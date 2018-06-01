package com.denys;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class Proposal_1Test {

    @Test
    void getMoney() {
        Proposal_1 testproposal = new Proposal_1(1000);
        if (testproposal.getMoney()!=1000){
            fail("getMoney Failed");
        }
    }

    @Test
    void getInterestRate() {
        Proposal_1 testproposal = new Proposal_1(1000);
        if (testproposal.getInterestRate()!=0.07){
            fail("getInterestRate Failed");
        }
    }

    @Test
    void withdrawMoney() throws Exception{
        Proposal_1 testproposal = new Proposal_1(1000);
        testproposal.withdrawMoney(100);
        if (testproposal.getMoney()!=900){
            fail("withdrawMoney Failed");
        }
    }

    @Test
    void replenishMoney()throws Exception {
        Proposal_1 testproposal = new Proposal_1(1000);
        testproposal.replenishMoney(100);
        if (testproposal.getMoney()!=1100){
            fail("replenishMoney Failed");
        }
    }

    @Test
    void print() {
    }
}