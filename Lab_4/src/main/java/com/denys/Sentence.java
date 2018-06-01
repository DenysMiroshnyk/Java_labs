package com.denys;

public class Sentence {

    private SentenceMembers[] sentence;
    private int size;

    Sentence(String string) {
        String[] stringMembers = string.split("((?<=[.])|(?=[.]))|((?<=[ ])|(?=[ ]))|((?<=[,])|(?=[,]))|((?<=[(])|(?=[(]))|((?<=[)])|(?=[)]))");
        size = stringMembers.length;
        sentence = new SentenceMembers[size];
        for (int i = 0; i < size; i++) {
            if (stringMembers[i].length() == 1) {
                sentence[i] = new Punctuation(stringMembers[i]);
            } else {
                sentence[i] = new Word(stringMembers[i]);
            }
            System.out.println(stringMembers[i]);
        }
    }

    void change(int length, String word){
        for (int i = 0; i < size; i++) {
            if (sentence[i] instanceof Word){
                if (sentence[i].size() == length){
                    sentence[i] = new Word(word);
                }
            }
        }
    }

    void output(){
        for (SentenceMembers element: sentence) {
            element.output();
        }
        System.out.println();
    }
}



