package ru.bkmz.Collection.Colection;

import ru.bkmz.Collection.utils.Collections;
import ru.bkmz.Collection.utils.Print;

import java.util.ArrayList;
import java.util.UUID;

public class ArrayL extends Print implements Collections {

    ArrayList<String> stringArrayList;

    public ArrayL(){
        super( "ArrayList");
        stringArrayList = new ArrayList<>();

        String testString = UUID.randomUUID().toString();

         getAddTime().start();
        add();
         getAddTime().stop();


        getDeleteTime().start();
        add();
         getDeleteTime().stop();

        print();
    }


    @Override
    public void add() {
        for (int i = 0; i < 2000; i++) {
            stringArrayList.add(UUID.randomUUID().toString());
        }
    }

    @Override
    public void search() {

    }

    @Override
    public void delete() {
        for (int i = 0; i < 2000; i++) {
            stringArrayList.remove(stringArrayList.get(i));
        }
    }



}
