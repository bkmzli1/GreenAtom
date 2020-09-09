package ru.bkmz.Collection.Colection;

import ru.bkmz.Collection.utils.Collections;
import ru.bkmz.Collection.utils.Print;

import java.util.HashSet;
import java.util.UUID;

public class HashS extends Print implements Collections {

    HashSet<String> stringTreeSet;

    public HashS(){
        super( "HashSet");
        stringTreeSet = new HashSet<>();

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
            stringTreeSet.add(UUID.randomUUID().toString());
        }
    }

    @Override
    public void search() {

    }

    @Override
    public void delete() {

        stringTreeSet.removeAll(stringTreeSet);

    }


}
