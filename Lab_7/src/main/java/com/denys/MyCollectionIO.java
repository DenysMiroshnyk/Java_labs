package com.denys;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

public class MyCollectionIO {
    /**
     * @param obj  is a proposal that writes to file
     * @param path is a file directory
     */
    public static void serializeProposals(MyCollection<Proposals> obj, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(obj);
            oos.flush();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * @param path is a file directory, where Proposal exists
     * @return a proposal
     */
    public static MyCollection<Proposals> deserializeProposals(String path) {
        MyCollection<Proposals> obj = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            obj = (MyCollection<Proposals>) ois.readObject();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return obj;
    }

    /**
     * @param obj  is a collection to be serialized
     * @param path is a file directory
     */
    public static void serializeCollection(List<Proposals> obj, String path) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {

            oos.writeInt(obj.size());

            for (Proposals x : obj) {
                oos.writeObject(x);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * @param path is a file directory, where collection exists
     * @return a collection
     */
    public static MyCollection<Proposals> deserializeCollection(String path) {
        MyCollection<Proposals> obj = new MyCollection<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {

            int size = ois.readInt();

            for (int i = 0; i < size; i++) {
                Proposals x = (Proposals) ois.readObject();
                obj.add(x);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return obj;
    }

    /**
     * @param obj  is a collection to be serialized
     * @param path is a file directory
     */
    public static void serializeTxt(MyCollection<Proposals> obj, String path) {
        try (PrintWriter out = new PrintWriter(path)) {
            for (Proposals d : obj) {
                out.print(d.getDateOfDepositing());
                out.print("#~~#" + d.getMoney());
                out.print("#~~#" + d.getInterestRate());
                out.print("\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * @param path is a file directory
     * @return a collection
     */
    public static MyCollection deserializeTxt(String path) {
        MyCollection obj = new MyCollection();
        try (BufferedReader in = new BufferedReader(new FileReader(path))) {
            String txtLine;
            while ((txtLine = in.readLine()) != null) {
                String[] parts = txtLine.split("#~~#");
                obj.add(new Proposal_1((LocalDate.parse(parts[0])),  Double.parseDouble(parts[1])));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return obj;
    }



}
