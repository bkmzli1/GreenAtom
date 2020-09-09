package ru.bkmz.Collection.Colection;

import ru.bkmz.Collection.utils.Collections;
import ru.bkmz.Collection.utils.Print;

import java.util.LinkedList;
import java.util.UUID;

public class LinkedL extends Print implements Collections {
    LinkedList<String> linkedL;

    public LinkedL() {
        super("link");
        linkedL = new LinkedList<>();


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
            linkedL.add(UUID.randomUUID().toString());
        }
    }

    @Override
    public void search() {

    }

    @Override
    public void delete() {
        for (int i = 0; i < 2000; i++) {
            linkedL.remove(linkedL.get(i));
        }
    }
}
