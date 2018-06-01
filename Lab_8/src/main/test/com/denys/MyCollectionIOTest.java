package com.denys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.List;


class MyCollectionIOTest {

    @Test
    void serializeCollection() {
        List<Proposals> written = new MyCollection<>();
        String filePath = "save_1.txt";
        written.add(new Proposal_1(100.56));
        written.add(new Proposal_1(9999.99));

        MyCollectionIO.serializeCollection(written, filePath);

        List<Proposals> rewritten = MyCollectionIO.deserializeCollection(filePath);
        assertEquals(written.size(), rewritten.size());

        Iterator<Proposals> itr_w = written.iterator();
        Iterator<Proposals> itr_r = rewritten.iterator();
        while (itr_r.hasNext() && itr_w.hasNext()) {
            Proposals temp_1 = itr_w.next();
            Proposals temp_2 = itr_r.next();
            assertEquals(temp_1.getMoney(), temp_2.getMoney());
            assertEquals(temp_1.getDateOfDepositing(), temp_2.getDateOfDepositing());

        }



    }

    @Test
    void deserializeCollection() {
        List<Proposals> written = new MyCollection<>();
        String filePath = "save_1.txt";
        written.add(new Proposal_1(100.56));
        written.add(new Proposal_1(9999.99));

        MyCollectionIO.serializeCollection(written, filePath);

        List<Proposals> rewritten = MyCollectionIO.deserializeCollection(filePath);
        assertEquals(written.size(), rewritten.size());

        Iterator<Proposals> itr_w = written.iterator();
        Iterator<Proposals> itr_r = rewritten.iterator();
        while (itr_r.hasNext() && itr_w.hasNext()) {
            Proposals temp_1 = itr_w.next();
            Proposals temp_2 = itr_r.next();
            assertEquals(temp_1.getMoney(), temp_2.getMoney());
            assertEquals(temp_1.getDateOfDepositing(), temp_2.getDateOfDepositing());

        }

    }

    @Test
    void serializeProposals() {
        MyCollection<Proposals> written = new MyCollection<>();
        String filePath = "save_2.txt";
        written.add(new Proposal_1(100.56));
        written.add(new Proposal_1(9999.99));

        MyCollectionIO.serializeProposals(written, filePath);

        MyCollection<Proposals> rewritten = MyCollectionIO.deserializeProposals(filePath);
        assertEquals(written.size(), rewritten.size());
    }

    @Test
    void deserializeProposals() {
        MyCollection<Proposals> written = new MyCollection<>();
        String filePath = "save_2.txt";
        written.add(new Proposal_1(100.56));
        written.add(new Proposal_1(9999.99));

        MyCollectionIO.serializeProposals(written, filePath);

        MyCollection<Proposals> rewritten = MyCollectionIO.deserializeProposals(filePath);
        assertEquals(written.size(), rewritten.size());
    }

    @Test
    void serializeTxt() {
        MyCollection<Proposals> written = new MyCollection<>();
        String filePath = "save_3.txt";
        written.add(new Proposal_1(100.56));
        written.add(new Proposal_1(9999.99));

        MyCollectionIO.serializeTxt(written, filePath);

        MyCollection<Proposals> rewritten = MyCollectionIO.deserializeTxt(filePath);
        assertEquals(written.size(), rewritten.size());
        Iterator<Proposals> itr_w = written.iterator();
        Iterator<Proposals> itr_r = rewritten.iterator();

        while (itr_r.hasNext() && itr_w.hasNext()) {
            Proposals temp_1 = itr_w.next();
            Proposals temp_2 = itr_r.next();
            assertEquals(temp_1.getMoney(), temp_2.getMoney());
            assertEquals(temp_1.getDateOfDepositing(), temp_2.getDateOfDepositing());

        }
    }

    @Test
    void deserializeTxt() {
        MyCollection<Proposals> written = new MyCollection<>();
        String filePath = "save_3.txt";
        written.add(new Proposal_1(100.56));
        written.add(new Proposal_1(9999.99));

        MyCollectionIO.serializeTxt(written, filePath);

        MyCollection<Proposals> rewritten = MyCollectionIO.deserializeTxt(filePath);
        assertEquals(written.size(), rewritten.size());
        Iterator<Proposals> itr_w = written.iterator();
        Iterator<Proposals> itr_r = rewritten.iterator();

        while (itr_r.hasNext() && itr_w.hasNext()) {
            Proposals temp_1 = itr_w.next();
            Proposals temp_2 = itr_r.next();
            assertEquals(temp_1.getMoney(), temp_2.getMoney());
            assertEquals(temp_1.getDateOfDepositing(), temp_2.getDateOfDepositing());

        }
    }


}