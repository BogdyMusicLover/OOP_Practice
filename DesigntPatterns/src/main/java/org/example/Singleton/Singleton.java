package org.example.Singleton;

// folosim final pt a nu putea fii extinsa
public final class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    // daca in clasa mai exista o metoda care nu este statica, compilatorul nu o mai vede ca pe o clasa utility
    public void testClass() {
    }
}
