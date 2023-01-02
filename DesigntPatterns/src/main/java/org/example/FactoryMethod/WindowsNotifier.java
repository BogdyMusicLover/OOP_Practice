package org.example.FactoryMethod;

public class WindowsNotifier extends Notifier {
    @Override
    public Notifiable createNotification() {
        return new WindowsNotification();
    }
}
