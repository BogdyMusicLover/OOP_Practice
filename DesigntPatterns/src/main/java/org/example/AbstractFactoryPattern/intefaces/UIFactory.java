package org.example.AbstractFactoryPattern.intefaces;

public interface UIFactory {
    IButton createButton();

    ICheckbox createCheckbox();
}
