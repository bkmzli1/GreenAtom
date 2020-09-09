package ru.bkmz.Collection.utils;

import java.util.HashMap;
import java.util.Map;

public class HashM {
    public HashMap<Integer, String> rev(HashMap<String, Integer> hashMapOld) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry: hashMapOld.entrySet()) {
            hashMap.put(entry.getValue(),entry.getKey());
        }
        return hashMap;
    }
}
