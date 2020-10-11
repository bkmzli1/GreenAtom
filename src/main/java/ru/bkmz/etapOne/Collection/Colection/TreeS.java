package ru.bkmz.etapOne.Collection.Colection;

import ru.bkmz.etapOne.Collection.utils.Collections;
import ru.bkmz.etapOne.Collection.utils.Print;

import java.util.TreeSet;
import java.util.UUID;

public class TreeS extends Print implements Collections {

    TreeSet<String> stringTreeSet;

    public TreeS() {
        super("TreeSet");
        stringTreeSet = new TreeSet<>();

        String testString = UUID.randomUUID().toString();

        getAddTime().start();
        add();
        getAddTime().stop();


        getDeleteTime().start();
        delete();
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
        stringTreeSet.clear();
    }


}
