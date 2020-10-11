package ru.bkmz.etapOne.Exceptions;

import java.util.ArrayList;

public class MyArray<S> extends ArrayList {
    @Override
    public boolean add(Object o) {

        if (size()== 10)
            try {
                throw new MyExceptions("Превышен лимит: "+ size());
            } catch (MyExceptions myExceptions) {
                myExceptions.printStackTrace();
            }

        System.out.println((String) o);

        return super.add(o);
    }
}
