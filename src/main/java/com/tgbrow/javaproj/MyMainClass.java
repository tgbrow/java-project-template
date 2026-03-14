package com.tgbrow.javaproj;

public class MyMainClass {
    public static void main(String[] args) {
        MySupportClass x = new MySupportClass("my-special-string");
        System.out.printf("\nHello from MyExecutable: %s\n\n", x.myString);
    }
}