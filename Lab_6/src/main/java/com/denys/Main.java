package com.denys;

import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Proposals> depositList = new MyCollection<>();
        depositList.add(new Proposal_1(100.56));
        System.out.println("Example deposit 1:\n" +
                "money: " + depositList.get(depositList.size() - 1).getMoney() +
                "\ndate of creation: " + depositList.get(depositList.size() - 1).getDateOfDepositing() +
                "\ninterest rate: " + depositList.get(depositList.size() - 1).getInterestRate()
        );

        depositList.add(new Proposal_1(9999.99));

        System.out.println("\nExample deposit 2:\n" +
                "money: " + depositList.get(depositList.size() - 1).getMoney() +
                "\ndate of creation: " + depositList.get(depositList.size() - 1).getDateOfDepositing() +
                "\ninterest rate: " + depositList.get(depositList.size() - 1).getInterestRate()
        );

        System.out.println("\nAll deposits:");
        for (Proposals x :
                depositList) {
            System.out.println("deposit:\n" +
                    "money: " + x.getMoney() +
                    "\ndate of creation: " + x.getDateOfDepositing() +
                    "\ninterest rate: " + x.getInterestRate()
            );
        }

        System.out.println("\nDeleting first deposit...");
        Iterator<Proposals> iterator = depositList.iterator();
        iterator.next();
        iterator.remove();

        System.out.println("\nAll deposits now:");
        for (Proposals x :
                depositList) {
            System.out.println("deposit:\n" +
                    "money: " + x.getMoney() +
                    "\ndate of creation: " + x.getDateOfDepositing() +
                    "\ninterest rate: " + x.getInterestRate()
            );
        }
        depositList.clear();
        System.out.println("\nAll deposits:");
        for (Proposals x :
                depositList) {
            System.out.println("deposit:\n" +
                    "money: " + x.getMoney() +
                    "\ndate of creation:" + x.getDateOfDepositing() +
                    "\ninterest rate:" + x.getInterestRate()
            );
        }

    }
}
