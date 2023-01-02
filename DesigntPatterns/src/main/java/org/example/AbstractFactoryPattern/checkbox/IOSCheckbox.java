package org.example.AbstractFactoryPattern.checkbox;

import org.example.AbstractFactoryPattern.intefaces.ICheckbox;

public class IOSCheckbox implements ICheckbox {
    @Override
    public void render() {
        System.out.println("Rendered an IOS Checkbox");
    }
}
