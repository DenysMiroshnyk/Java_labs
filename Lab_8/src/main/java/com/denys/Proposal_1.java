package com.denys;

import java.io.Serializable;
import java.time.LocalDate;

public class Proposal_1 implements Proposals, Serializable{
    private LocalDate dateOfDepositing;
    private double money;
    public static final double interestRateOfDeposit = 0.07;
    private static final long serialVersionUID = 1L;

    /**
     *
     * @param sum means amount of money u deposit
     */
    Proposal_1(double sum){
        dateOfDepositing = LocalDate.now();
        money = sum;
    }
    Proposal_1(LocalDate dateOfDepositing, double money){
        this.dateOfDepositing = dateOfDepositing;
        this.money = money;
    }

    @Override
    public double getMoney(){
        return money;
    }

    @Override
    public LocalDate getDateOfDepositing(){
        return dateOfDepositing;
    }

    @Override
    public double getInterestRate(){
        return interestRateOfDeposit;
    }

    @Override
    public void withdrawMoney(double sum) throws MyException {
     //   if(sum<0){
     //       throw new MyException("amount can't be <0",sum);
     //   }
     //   else {
            money -=Math.abs(sum);
    //    }
    }

    @Override
    public void replenishMoney(double sum)throws MyException {
    //    if(sum<0){
          //  throw new MyException("amount can't be <0",sum);
     //   }
     //   else {
            money += Math.abs(sum);
     //   }
    }

    @Override
    public void print() {
        System.out.println("Deposit:\n" +
                "Cash: " + money +
                "\nInterest Rate: " + this.getInterestRate() +
                "\nDate of creation: " + this.getDateOfDepositing() );
    }
}
