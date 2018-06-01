package com.denys;

public class Word implements SentenceMembers {
    private Letter[] letters;
    private int size;


    Word(String string) {
        String[] stringLetters = string.split("");
        size = stringLetters.length;
        letters = new Letter[size];
        for (int i = 0; i < size; i++) {
            letters[i] = new Letter(stringLetters[i]);
        }
    }

    @Override
    public int size(){
        return size;
    }

    @Override
    public void output() {
        for (Letter ch : letters) {
            ch.output();
        }
    }
}


