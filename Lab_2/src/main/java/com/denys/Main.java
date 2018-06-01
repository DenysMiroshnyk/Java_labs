package com.denys;
import java.util.Random;

public class Main
{
    public static void main(String[] args) {
        Random rnd = new Random(System.currentTimeMillis());
        int min = -10;
        int max = 10;
        final long a = min + rnd.nextInt(max - min + 1);
        long[] B = new long[10];
        long[] C = new long[10];

        for (int i=0; i<10; i++){
            B[i] = min + rnd.nextInt(max - min + 1);
            C[i] = a*B[i];
        }
        System.out.println("const a = " + a);
        System.out.println("matrix B:");
        for (int i = 0;i<10; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println();
        System.out.println("matrix C:");
        for (int i = 0;i<10; i++){
            System.out.print(C[i] + " ");
        }
    }
}
