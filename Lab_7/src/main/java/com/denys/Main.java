package com.denys;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyCollection<Proposals> depositList = new MyCollection<>();
        depositList.add(new Proposal_1(100.56));
        System.out.println("Example deposit 1:\n");
                depositList.get(depositList.size() - 1).print();

        depositList.add(new Proposal_1(9999.99));

        System.out.println("\nExample deposit 2:\n");
        depositList.get(depositList.size() - 1).print();

        System.out.println("\nAll deposits:");
        for (Proposals x :
                depositList) {
            x.print();
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
