package ru.bkmz.etapOne.Exceptions;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        MyArray<String> myArray = new MyArray<>();
        for (int i = 0; i < 12; i++) {

                myArray.add(UUID.randomUUID().toString());

        }
    }
}
