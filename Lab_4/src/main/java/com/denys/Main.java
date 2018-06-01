package com.denys;

public class Main {
    public static void main(String[] args) {

        String replacer = "REPLACED";

        Text text = new Text(

                 "One design goal of Java is portability, which means that programs written for the Java platform must run similarly on any combination of hardware and operating system with adequate runtime support. " +
                        "This is achieved by compiling the Java language code to an intermediate representation called Java bytecode, instead of directly to architecture-specific machine code. " +
                        "Java bytecode instructions are analogous to machine code, but they are intended to be executed by a virtual machine (VM) written specifically for the host hardware. " +
                        "End users commonly use a Java Runtime Environment (JRE) installed on their own machine for standalone Java applications, or in a web browser for Java applets."
        );
/*

        System.out.println("\n Our string is:\n ");
        text.output();

        text.change(replacer.length(),replacer);
        System.out.println("\n Our string now is:\n ");
        text.output();
*/

    }
}
