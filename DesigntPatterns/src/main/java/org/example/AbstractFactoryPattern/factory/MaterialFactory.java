package org.example.AbstractFactoryPattern.factory;

import org.example.AbstractFactoryPattern.button.IOSButton;
import org.example.AbstractFactoryPattern.button.MaterialButton;
import org.example.AbstractFactoryPattern.checkbox.MaterialCheckbox;
import org.example.AbstractFactoryPattern.intefaces.IButton;
import org.example.AbstractFactoryPattern.intefaces.ICheckbox;
import org.example.AbstractFactoryPattern.intefaces.UIFactory;

public class MaterialFactory implements UIFactory {
    @Override
    public IButton createButton() {
        return new MaterialButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MaterialCheckbox();
    }
}
