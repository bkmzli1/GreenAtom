package ru.bkmz.Collection;

import ru.bkmz.Collection.Colection.ArrayL;
import ru.bkmz.Collection.Colection.HashS;
import ru.bkmz.Collection.Colection.LinkedL;
import ru.bkmz.Collection.Colection.TreeS;
import ru.bkmz.Collection.utils.HashM;

import java.util.HashMap;
import java.util.UUID;

public class Main {

    /*TODO
     * - исследовать работу ArrayList, LinkedList, TreeSet, HashSet.
     * сортировка?
     * */


    public static void main(String[] args) throws InterruptedException {
        ArrayL arrayL = new ArrayL();
        LinkedL linkedL = new LinkedL();
        TreeS treeS = new TreeS();
        HashS hashSet = new HashS();

        HashMap<String, Integer> hashMap = new HashMap<>();
        HashM hashM =new HashM();
        for (int i = 0; i < 100; i++) {
            hashMap.put(UUID.randomUUID().toString(),i);
        }

        hashM.rev(hashMap);
    }
}
