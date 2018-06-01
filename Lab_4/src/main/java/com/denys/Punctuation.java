package com.denys;

public class Punctuation implements SentenceMembers {
    private String symbol;

    Punctuation(String string){
        symbol = string;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public void output() {
        System.out.print(symbol);
    }
}
