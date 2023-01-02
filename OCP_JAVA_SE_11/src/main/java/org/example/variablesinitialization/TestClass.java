package org.example.variablesinitialization;

public class TestClass {
    static int i;
    int y;
    public static void main(String[] name){
        int p;
        System.out.println(i+ " " + new TestClass().y);
//        System.out.println(p);     - variabilele din interiorul metodelor ( variabilele locale) nu iau valoarea DEFAULT -
//                                   - acestea trebuie initializate

    }

}

