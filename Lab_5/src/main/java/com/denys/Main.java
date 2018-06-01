package com.denys;

import java.util.Scanner;
import java.util.Locale; //troubleshooting))

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);;
        ClientsDeposits depositList = new ClientsDeposits();
        String operation;
        System.out.println("Type an operation (or operation number):\n" +
                "0. EditDeposit\n" +
                "1. AllProposals\n" +
                "2. MyDeposits\n" +
                "3. SortDeposits\n" +
                "4. AddDeposit\n" +
                "5. Exit\n");


        while (true){
            operation = scan.nextLine();
            if (operation.toLowerCase().equals("exit")||operation.toLowerCase().equals("5")){
                System.out.println("EXITING...");
                break;
            }
            switch (operation.toLowerCase()){
                case "editdeposit":
                    try {
                        depositList.editDeposit(scan);
                    }
                    catch (java.util.InputMismatchException ex){
                        System.out.println("Wrong input!\n\n");
                    }
                    break;
                case "0":
                    try {
                        depositList.editDeposit(scan);
                    }
                    catch (java.util.InputMismatchException ex){
                        System.out.println("Wrong input!\n\n");
                    }
                    break;
                case "allproposals":
                    System.out.println("1st Proposal:\n" +
                            "Interest Rate:" + Proposal_1.interestRateOfDeposit +
                            "\n2nd Proposal:\n" +
                            "Interest Rate:" + Proposal_2.interestRateOfDeposit +
                            "\n3d Proposal:\n" +
                            "Interest Rate:" + Proposal_3.interestRateOfDeposit);
                    break;
                case "1":
                    System.out.println("1st Proposal:\n" +
                            "Interest Rate:" + Proposal_1.interestRateOfDeposit +
                            "\n2nd Proposal:\n" +
                            "Interest Rate:" + Proposal_2.interestRateOfDeposit +
                            "\n3d Proposal:\n" +
                            "Interest Rate:" + Proposal_3.interestRateOfDeposit);
                    break;
                case "mydeposits":
                    depositList.printList();
                    break;
                case "2":
                    depositList.printList();
                    break;
                case "sortdeposits":
                    try {
                        depositList.sorting(scan);
                    }
                    catch (java.util.InputMismatchException ex){
                        System.out.println("Wrong input!\n\n");
                    }
                    break;
                case "3":
                    try {
                        depositList.sorting(scan);
                    }
                    catch (java.util.InputMismatchException ex){
                        System.out.println("Wrong input!\n\n");
                    }
                    break;
                case "adddeposit":
                    System.out.println("Enter number of proposition and value\n Proposition: ");
                    try {
                        depositList.addDeposit(scan.nextInt(), scan);
                    }
                    catch (java.util.InputMismatchException ex){
                        System.out.println("Wrong input!\n\n");
                    }
                    break;
                case "4":
                    System.out.println("Enter number of proposition and value\n Proposition: ");
                    try {
                        depositList.addDeposit(scan.nextInt(), scan);
                    }
                    catch (java.util.InputMismatchException ex){
                        System.out.println("Wrong input!\n\n");
                    }
                    break;
                default:
                    System.out.println("Type an operation (or operation number):\n" +
                            "0. EditDeposit\n" +
                            "1. AllProposals\n" +
                            "2. MyDeposits\n" +
                            "3. SortDeposits\n" +
                            "4. AddDeposit\n" +
                            "5. Exit\n");
                    break;
            }
        }
    }
}
