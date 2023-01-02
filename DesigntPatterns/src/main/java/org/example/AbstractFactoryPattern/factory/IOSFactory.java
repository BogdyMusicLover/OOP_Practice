package org.example.AbstractFactoryPattern.factory;

import org.example.AbstractFactoryPattern.button.IOSButton;
import org.example.AbstractFactoryPattern.checkbox.IOSCheckbox;
import org.example.AbstractFactoryPattern.intefaces.IButton;
import org.example.AbstractFactoryPattern.intefaces.ICheckbox;
import org.example.AbstractFactoryPattern.intefaces.UIFactory;

public class IOSFactory implements UIFactory {
    @Override
    public IButton createButton() {
        return new IOSButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new IOSCheckbox();
    }
}
