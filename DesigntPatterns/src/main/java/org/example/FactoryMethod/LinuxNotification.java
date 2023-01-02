package org.example.FactoryMethod;

public class LinuxNotification implements Notifiable {
    @Override
    public void display() {
        System.out.println("Linux Notification");
    }
}
