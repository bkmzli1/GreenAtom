package ru.bkmz.StreamAPI;

import org.apache.commons.collections4.SetUtils;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Наташа", Arrays.asList("Java", "C++"));
        Developer dev2 = new Developer("Эрнест", Arrays.asList("Java", "Python"));
        Developer dev3 = new Developer("Элла", Arrays.asList("С#", "Python", "JavaScript"));
        Stream<Developer> developerStream = Stream.of(dev1, dev2, dev3);

        System.out.println( );

      developerStream.filter(x -> existA(x.languages,"Java")).forEach(developer -> {
            System.out.println(developer.name);
        });
        System.out.println();
    }


    private static boolean existA(List<String> languages, String a) {
        for (String s : languages) {
            if (a.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static class Developer {
        private String name;
        private List<String> languages;

        public Developer(String name, List<String> languages) {
            this.name = name;
            this.languages = languages;
        }
    }
}
/*14
*
 */