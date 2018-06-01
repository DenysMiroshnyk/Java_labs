package com.denys;

public class Text {

    private Sentence[] sentences; //array of Sentences
    private int size;

    Text(String string){
        String[] stringSentences = string.split("(?<=\\. )");
        size= stringSentences.length;
        sentences = new Sentence[size];
        for(int i = 0; i<size; i++){
            sentences[i] = new Sentence(stringSentences[i]);
            //System.out.println(stringSentences[i]);
        }
    }

    void change(int length, String word){
        for (int i = 0; i < size; i++) {
            sentences[i].change(length, word);
        }
    }

    void output(){
        for (Sentence sentence : sentences) {
            sentence.output();
        }
    }
}
