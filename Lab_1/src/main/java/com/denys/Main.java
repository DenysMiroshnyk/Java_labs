package com.denys;

public class Main {
    public static void main(String[] args) {

        char n = 10, m = 10;
        float S = 0;
        final char C = 0;
        for (char i = 1; i < n; i++){
            for (char j = 0; j <m; j++) {
                S += i*j/(float)(i+C);
            }
        }
        System.out.println(S);

    }
}
