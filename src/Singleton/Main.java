package Singleton;

import Singleton.Singleton;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.toString());
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.toString());
    }
}