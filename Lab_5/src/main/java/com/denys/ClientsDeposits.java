package com.denys;

import java.util.Scanner;

public class ClientsDeposits {
    private Proposals[] depositsArray = new Proposals[0];

    public void addDeposit(int prop, Scanner scan){
        if (prop>3||prop<1){
            System.out.println("No such proposal!\n\n");
        }
        else {
            System.out.println("Value:");
            double sum = scan.nextDouble();
            Proposals[] temp = new Proposals[depositsArray.length + 1];
            System.arraycopy(depositsArray, 0, temp, 0, depositsArray.length);
            switch (prop) {
                case 1:
                    temp[temp.length - 1] = new Proposal_1(sum);
                    break;
                case 2:
                    temp[temp.length - 1] = new Proposal_2(sum);
                    break;
                case 3:
                    temp[temp.length - 1] = new Proposal_3(sum);
                    break;
            }

            depositsArray = temp;
        }
            System.out.println("Deposit added\n\n");
        }

    /**
     * sorts array of deposits by cash
     */
    private void sortDepositsByMoney(){
        if(depositsArray.length == 0 ){
            System.out.println("You don't have deposits");
        }
        else{
            Proposals temp;
            for (int i = 0; i < depositsArray.length; i++) {
                    for(int j=1; j < (depositsArray.length-i); j++) {
                        if (depositsArray[j - 1].getMoney() > depositsArray[j].getMoney()) {
                            temp = depositsArray[j - 1];
                            depositsArray[j - 1] = depositsArray[j];
                            depositsArray[j] = temp;
                        }
                    }
            }
        }
    }

    /**
     * sorts array of deposits by date of creation
     */
    private void sortDepositsByDateOfCreation(){
        if(depositsArray.length == 0 ){
            System.out.println("You don't have deposits");
        }
        else{
            Proposals temp;
            for (int i = 0; i < depositsArray.length; i++) {
                for(int j=1; j < (depositsArray.length-i); j++) {
                    if (depositsArray[j - 1].getDateOfDepositing().isAfter(depositsArray[j].getDateOfDepositing())) {

                        temp = depositsArray[j - 1];
                        depositsArray[j - 1] = depositsArray[j];
                        depositsArray[j] = temp;
                    }
                }
            }
        }
    }

    /**
     * sorts array of deposits by interest rate
     */
    private void sortDepositsByInterestRate(){
        if(depositsArray.length == 0 ){
            System.out.println("You don't have deposits");
        }
        else{
            Proposals temp;
            for (int i = 0; i < depositsArray.length; i++) {
                for(int j=1; j < (depositsArray.length-i); j++) {
                    if (depositsArray[j - 1].getInterestRate() > depositsArray[j].getInterestRate()) {
                        temp = depositsArray[j - 1];
                        depositsArray[j - 1] = depositsArray[j];
                        depositsArray[j] = temp;
                    }
                }
            }
        }
    }


    public void printList(){
        if (depositsArray.length != 0) {
            for (int i = 0; i < depositsArray.length; i++) {
                System.out.println("\n\n" + i + ":\n");
                depositsArray[i].print();
            }
        }
        else{
            System.out.println("You don't have deposits");
        }
    }

    /**
     * Sorts array by chosen criteria
     *
     * @param scan (java.util.Scanner obj)
     * @throws java.util.InputMismatchException
     */

    public void sorting(Scanner scan) throws java.util.InputMismatchException {
        if (depositsArray.length != 0) {
            System.out.println("choose a sort param number:\n" +
                    "1. Cash\n " +
                    "2. InterestRate\n " +
                    "3. DateOfCreation\n");
            int prop = scan.nextInt();
            switch (prop) {
                case 1:
                    this.sortDepositsByMoney();
                    break;
                case 2:
                    this.sortDepositsByInterestRate();
                    break;
                case 3:
                    this.sortDepositsByDateOfCreation();
                    break;
                default:
                    throw new java.util.InputMismatchException();
            }

            System.out.println("SORTED!!\n\n");
        }
        else{
            System.out.println("You don't have deposits");
        }
    }

    /**
     * Edits deposit if exists
     *
     * @param scan (java.util.Scanner obj)
     * @throws java.util.InputMismatchException
     */
    public void editDeposit(Scanner scan) throws java.util.InputMismatchException {
        int num;
        if (depositsArray.length == 0){
            System.out.println("You don't have deposits");
        }
        else{
            System.out.println("Choose your deposit:");
            this.printList();
            num = scan.nextInt();
            if (num>=depositsArray.length){
                throw new java.util.InputMismatchException();
            }
            else{
                System.out.println("Type an operation (or operation number):\n" +
                        "1. Withdraw\n" +
                        "2. Replenish\n");
                switch (scan.nextInt()){
                    case 1:
                        System.out.println("Value:\n");
                        depositsArray[num].withdrawMoney(scan.nextDouble());
                        System.out.println("SUCCESS!!\n");
                        break;
                    case 2:
                        System.out.println("Value:\n");
                        depositsArray[num].replenishMoney(scan.nextDouble());
                        System.out.println("SUCCESS!!\n");
                        break;
                    default:
                        throw new java.util.InputMismatchException();
                }
            }
        }
    }
}
