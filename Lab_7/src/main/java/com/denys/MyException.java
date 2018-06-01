package com.denys;

public class MyException extends Exception {
    private double number;
    public MyException(String message, double num){

        super(message);
        number=num;
    }
}
