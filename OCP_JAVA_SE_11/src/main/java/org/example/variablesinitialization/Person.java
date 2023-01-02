package org.example.variablesinitialization;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {
    private int id = 2;
    static String name = "abc";
    static java.util.Date dob = Date.valueOf(LocalDate.now());
    boolean VIP;

    public static void main(String[] args) {
        Person p1 = new Person();
//        p2 = p1;   - p2 nu este declarat
//        int id = p2.id;
        System.out.println(dob);
        System.out.println(dob.after(Date.valueOf("2022-12-29")));
        p1.VIP = true;
        p1.setId(4);
        System.out.println(p1);


    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", VIP=" + VIP +
                '}';
    }
}

