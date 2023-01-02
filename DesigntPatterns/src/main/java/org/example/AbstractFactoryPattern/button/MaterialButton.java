package org.example.AbstractFactoryPattern.button;

import org.example.AbstractFactoryPattern.intefaces.IButton;

public class MaterialButton implements IButton {
    @Override
    public void render() {
        System.out.println("Rendered a material Button");
    }
}
