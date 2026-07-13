package org.example;

// Import here manually
import packageone.ClassOne;
import packagetwo.ClassTwo;
import packagethree.ClassThree;


public class Main {
    public static void main(String[] args) {
        System.out.println(new ClassOne().greet());
        System.out.println(new ClassTwo().greet());
        System.out.println(new ClassThree().greet());
    }
}