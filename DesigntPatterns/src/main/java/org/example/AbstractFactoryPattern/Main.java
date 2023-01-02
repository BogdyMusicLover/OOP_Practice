package org.example.AbstractFactoryPattern;

import org.example.AbstractFactoryPattern.factory.IOSFactory;
import org.example.AbstractFactoryPattern.factory.MaterialFactory;
import org.example.AbstractFactoryPattern.intefaces.UIFactory;
import org.example.AbstractFactoryPattern.utils.OS;

public class Main {
    public static void main(String[] args) {
        OS currentOs = OS.Android;
        UIFactory factory = switch (currentOs) {
            case IOS -> new IOSFactory();
            case Android -> new MaterialFactory();
        };

        MobileApplication mobileApplication = new MobileApplication(factory);
        mobileApplication.render();

    }
}
