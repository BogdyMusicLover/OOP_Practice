package org.example.FactoryMethod;

public class MacOsNotification implements Notifiable {
    @Override
    public void display() {
        System.out.println("MacOS notification");
    }
}
