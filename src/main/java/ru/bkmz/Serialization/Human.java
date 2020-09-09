package ru.bkmz.Serialization;

import java.io.Serializable;

public class Human implements Serializable {
    String name, tip;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        if (0 < age && age <= 3) {
            tip = "он сидит дома";
        }else  if (3 < age && age <= 7) {
            tip = " ходит в детский сад";
        }else  if (7 < age && age <= 18) {
            tip = "учится в школе";
        }else  if (17 < age && age <= 23) {
            tip = "учится в институте";
        }else  if (24 < age && age <= 65) {
            tip = " ходит на работу";
        }
    }

}
