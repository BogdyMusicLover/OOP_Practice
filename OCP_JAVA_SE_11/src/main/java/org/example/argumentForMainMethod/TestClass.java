package org.example.argumentForMainMethod;

public class TestClass {
    public static void main(String args[]) {
        System.out.println(args);
        System.out.println(args.length);
        args[0] = "a";

        System.out.println(args.length);
    }
}
