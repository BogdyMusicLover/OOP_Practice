package org.example.AbstractFactoryPattern.checkbox;

import org.example.AbstractFactoryPattern.intefaces.ICheckbox;

public class MaterialCheckbox implements ICheckbox {
    @Override
    public void render() {
        System.out.println("Rendered a material Checkbox");
    }
}
