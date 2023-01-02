package org.example.AbstractFactoryPattern;

import org.example.AbstractFactoryPattern.intefaces.UIFactory;

public class MobileApplication {
    private final UIFactory factory;

    public MobileApplication(UIFactory factory) {
        this.factory = factory;
    }

    public void render() {
        factory.createCheckbox().render();
        factory.createButton().render();
    }
}
