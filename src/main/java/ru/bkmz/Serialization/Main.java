package ru.bkmz.Serialization;

import ru.bkmz.Collection.utils.HashM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        FileOutputStream outputStream = new FileOutputStream("aaaaa.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        Human human = new Human("ggg",2);

        objectOutputStream.writeObject(human);


        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("aaaaa.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        human = (Human) objectInputStream.readObject();

        System.out.println(human.name);
    }
}
