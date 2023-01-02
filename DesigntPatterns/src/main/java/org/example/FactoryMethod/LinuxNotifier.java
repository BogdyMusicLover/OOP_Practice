package org.example.FactoryMethod;

public class LinuxNotifier extends Notifier {
    @Override
    public Notifiable createNotification() {
        return new LinuxNotification();
    }

}
