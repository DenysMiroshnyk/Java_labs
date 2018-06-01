package com.denys;

import java.time.LocalDate;

public interface Proposals {
    /**
     *
     * @return returns the interest rate of deposit
     */
    public double getInterestRate();
    /**
     *
     * @return money of money currently deposited
     */
    public double getMoney();
    /**
     *
     * @return the creation date of deposit
     */
    public LocalDate getDateOfDepositing();

    /**
     *
     * @param num means amount of money you want to withdraw
     */
    public void withdrawMoney(double num);

    /**
     *
     * @param sum means amount of money you want to store
     */
    public void replenishMoney(double sum);

    /**
     * prints a deposit
     */
    public void print();
}
