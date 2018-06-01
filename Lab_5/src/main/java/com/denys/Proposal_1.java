package com.denys;

import java.time.LocalDate;

public class Proposal_1 implements Proposals {
    private LocalDate dateOfDepositing;
    private double money;
    public static final double interestRateOfDeposit = 0.07;

    /**
     *
     * @param sum means amount of money u deposit
     */
    Proposal_1(double sum){
        dateOfDepositing = LocalDate.now();
        money = sum;
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
    public void withdrawMoney(double sum){
        money-=sum;
    }

    @Override
    public void replenishMoney(double sum){
        money+=sum;
    }

    @Override
    public void print() {
        System.out.println("Deposit:\n" +
                "Cash: " + money +
                "\nInterest Rate: " + this.getInterestRate() +
                "\nDate of creation: " + this.getDateOfDepositing() );
    }
}
