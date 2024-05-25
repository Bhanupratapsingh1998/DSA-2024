package com.dsa2024.OPPS;

public class SimpleSingleton {
    // Static variable to hold the single instance of the class
    private static SimpleSingleton instance;

    // Private constructor to prevent instantiation
    private SimpleSingleton() {
        // Initialize any resources if necessary
    }

    // Public static method to provide the global point of access
    public static SimpleSingleton getInstance() {
        if (instance == null) {
            synchronized (SimpleSingleton.class) {
                if (instance == null) {
                    instance = new SimpleSingleton();
                }
            }
        }
        return instance;
    }

    // Example method to demonstrate singleton behavior
    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }
}

class Main {
    public static void main(String[] args) {
        // Get the single instance of SimpleSingleton
        SimpleSingleton singleton = SimpleSingleton.getInstance();

        // Call a method on the singleton instance
        singleton.showMessage();

        // Get another reference to the same singleton instance
        SimpleSingleton anotherSingleton = SimpleSingleton.getInstance();

        // Check if both references point to the same instance
        if (singleton == anotherSingleton) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances.");
        }
    }
}
