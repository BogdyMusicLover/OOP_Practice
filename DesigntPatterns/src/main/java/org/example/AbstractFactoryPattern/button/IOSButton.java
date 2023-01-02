package org.example.AbstractFactoryPattern.button;

import org.example.AbstractFactoryPattern.intefaces.IButton;

public class IOSButton implements IButton {
    @Override
    public void render() {
        System.out.println("Rendered an IOS button");
    }
}
