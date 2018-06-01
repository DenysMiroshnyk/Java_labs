package com.denys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MyCollectionTest {

    @Test
    public void size() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));

        if(ex.size()!=t.size()){
            fail("Size failed");
        }
    }

    @Test
    public void isEmpty() throws Exception {
        List<Proposals> t = new MyCollection<>();
        ArrayList<Proposals> ex=new ArrayList<>();
        if(t.isEmpty()!=ex.isEmpty()){
            fail("isEmpty failed");
        }


        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));

        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));

        if(t.isEmpty()!=ex.isEmpty()){
            fail("isEmpty failed");
        }

    }

    @Test
    public void contains() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));

        if(t.contains(new Proposal_1(100.56))!=ex.contains(new Proposal_1(100.56))){
            fail("contain failed");
        }
        if(t.contains(new Proposal_1(100))!=ex.contains(new Proposal_1(100))){
            fail("contain failed");
        }
    }

    @Test
    public void iterator() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));

        Iterator<Proposals> tItr = t.iterator();
        Iterator<Proposals> exItr = ex.iterator();
        while(tItr.hasNext()){
            if(exItr.hasNext()){
                if (tItr.next().getMoney()!=exItr.next().getMoney()){
                    fail("iterator.next failed");
                }
            } else {
                fail("iterator.hasNext failed");
            }
        }
    }

    @Test
    public void toArray() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));

        Object[] testarr=t.toArray();
        Object[] exarr=ex.toArray();

        if(testarr.length!=exarr.length){
            fail("toArray size failed");
        }
        for(int i=0;i<testarr.length;i++){
            Proposals test=(Proposals)testarr[i];
            Proposals examp=(Proposals)exarr[i];
            if(test.getMoney()!=examp.getMoney()){
                fail("toArray contant failed");
            }
        }

    }

    @Test
    public void add() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));


        if(t.size()!=ex.size()){
            fail("add size failed");
        }
        for(int i=0;i<t.size();i++){
            Proposals test=t.get(i);
            Proposals examp=ex.get(i);
            if(test.getMoney()!=examp.getMoney()){
                fail("add contant failed");
            }
        }
    }

    @Test
    public void add1() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));



        t.add(0,new Proposal_1(3000));
        ex.add(0,new Proposal_1(3000));

        t.add(1,new Proposal_1(3001.11));
        ex.add(1,new Proposal_1(3001.11));

        t.add(t.size()-1,new Proposal_1(3002.22));
        ex.add(ex.size()-1,new Proposal_1(3002.22));


        if(t.size()!=ex.size()){
            fail("add size fail");
        }
        for(int i=0;i<t.size();i++){
            Proposals test=t.get(i);
            Proposals examp=ex.get(i);;
            if(test.getMoney()!=examp.getMoney()){
                fail("add contant fail");
            }
        }
    }

    @Test
    public void remove() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));
        t.add(new Proposal_1(9999.99));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));
        ex.add(new Proposal_1(9999.99));
        ex.add(new Proposal_1(9999.99));

        ex.remove(0);
        ex.remove(2);

        t.remove(0);
        t.remove(2);
        if(t.size()!=ex.size()){
            fail("remove size failed");
        }
        for(int i=0;i<t.size();i++){
            Proposals test=t.get(i);
            Proposals examp=ex.get(i);
            if(test.getMoney()!=examp.getMoney()){
                fail("remove contant failed");
            }
        }

    }

    @Test
    public void remove_1() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));
        t.add(new Proposal_1(3000));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));
        ex.add(new Proposal_1(3000));
        ex.add(new Proposal_1(9999.99));

        t.remove(new Proposal_1(3000));
        ex.remove(new Proposal_1(3000));

        t.remove(new Proposal_1(100.56));
        ex.remove(new Proposal_1(100.56));



        if(t.size()!=ex.size()){
            fail("remove size fail");
        }
        for(int i=0;i<t.size();i++){
            Proposals test=t.get(i);
            Proposals examp=ex.get(i);;
            if(test.getMoney()!=examp.getMoney()){
                fail("remove contant fail");
            }
        }
    }

    @Test
    public void addAll() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));

        ArrayList<Proposals> ad=new ArrayList<>();
        ex.add(new Proposal_1(9999.99));
        ex.add(new Proposal_1(9999.99));
        ex.add(new Proposal_1(9999.99));

        t.addAll(ad);
        ex.addAll(ad);

        for(int i=0;i<t.size();i++){
            Proposals test=t.get(i);
            Proposals examp=ex.get(i);
            if(test.getMoney()!=examp.getMoney()){
                fail("addAll contant failed");
            }
        }
    }

    @Test
    public void addAll_1() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));

        ArrayList<Proposals> ad=new ArrayList<>();
        ex.add(new Proposal_1(9999.99));
        ex.add(new Proposal_1(9999.99));
        ex.add(new Proposal_1(9999.99));

        t.addAll(2,ad);
        ex.addAll(2,ad);

        for(int i=0;i<t.size();i++){
            Proposals test=t.get(i);
            Proposals examp=ex.get(i);
            if(test.getMoney()!=examp.getMoney()){
                fail("addAll_1 contant failed");
            }
        }
    }

    @Test
    public void removeAll() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));

        ArrayList<Proposals> ad=new ArrayList<>();
        ex.add(new Proposal_1(9999.99));

        t.removeAll(ad);
        ex.removeAll(ad);

        for(int i=0;i<t.size();i++){
            Proposals test=t.get(i);
            Proposals examp=ex.get(i);
            if(test.getMoney()!=examp.getMoney()){
                fail("removeAll contant failed");
            }
        }
    }

    @Test
    public void clear() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));


        t.clear();

        if(!t.isEmpty()){
            fail("clear failed");
        }

    }

    @Test
    public void get() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));


        if(t.size()!=ex.size()){
            fail("get size failed");
        }

    }

    @Test
    public void set() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));

        t.set(0,new Proposal_1(9999.99));
        ex.set(0,new Proposal_1(9999.99));

        if(t.size()!=ex.size()){
            fail("set size failed");
        }

    }


    @Test
    public void indexOf() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));

        if(t.indexOf(new Proposal_1(100.56))!=ex.indexOf(new Proposal_1(100.56)) ){
            fail("indexOf failed");
        }
        if(t.indexOf(new Proposal_1(9999.99))!=ex.indexOf(new Proposal_1(9999.99))){
            fail("indexOf failed");
        }


    }

    @Test
    public void lastIndexOf() throws Exception {
        List<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));

        if(t.lastIndexOf(new Proposal_1(100.56))!=ex.lastIndexOf(new Proposal_1(100.56))){
            fail("indexOf failed");
        }
        if(t.lastIndexOf(new Proposal_1(9999.99))!=ex.lastIndexOf(new Proposal_1(9999.99))){
            fail("indexOf failed");
        }

    }

    @Test
    public void listIterator() throws Exception {

    }

    @Test
    public void subList() throws Exception {
        MyCollection<Proposals> t = new MyCollection<>();

        t.add(new Proposal_1(100.56));
        t.add(new Proposal_1(9999.99));



        ArrayList<Proposals> ex=new ArrayList<>();
        ex.add(new Proposal_1(100.56));
        ex.add(new Proposal_1(9999.99));

        MyCollection<Proposals> testarr=(MyCollection<Proposals>)(t.subList(0,1));
        List<Proposals> exarr=ex.subList(0,1);

        if(testarr.size()!=exarr.size()){
            fail("subList size failed");
        }
        for(int i=0;i<testarr.size();i++){
            Proposals test=testarr.get(i);
            Proposals examp=exarr.get(i);;
            if(test.getMoney()!=examp.getMoney()){
                fail("subList contant failed");
            }
        }

    }


}