package org.example.FactoryMethod;

public class MacOsNotifier extends Notifier {
    @Override
    public Notifiable createNotification() {
        return new MacOsNotification();
    }
}
