package org.example.foo;

import org.example.foo.bar.BarClass;
import static org.example.foo.bar.BarClass.staticMethod;


public class FooClass {
    public static void main(String[] args) {

        BarClass barClass = new BarClass();
        System.out.println(staticMethod(2));
        System.out.println(staticMethod(3));
    }
}
