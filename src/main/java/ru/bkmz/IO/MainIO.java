package ru.bkmz.IO;

import java.io.File;
import java.util.*;

public class MainIO {
    public static void main(String[] args) {
        Set<String> strings = new LinkedHashSet<>();
        Scanner scn = new Scanner(System.in);
        String[] in = scn.nextLine().split("");
        int i = 0;
        boolean string = false;
        for (String s : in) {
            if (i==0){
                strings.add(s);
                i++;
            }else {
                if (!string) {
                    switch (s) {
                        case " ":
                            strings.add("");
                            i++;
                            break;
                        case "\"":
                            string = true;
                    }
                }else if (s.equals("\"")){
                    string = false;
                }


            }


        }


    }
}