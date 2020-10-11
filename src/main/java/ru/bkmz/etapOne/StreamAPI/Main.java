package ru.bkmz.etapOne.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Наташа", Arrays.asList("Java", "C++"));
        Developer dev2 = new Developer("Эрнест", Arrays.asList("Java", "Python"));
        Developer dev3 = new Developer("Элла", Arrays.asList("С#", "Python", "JavaScript"));
        List<Developer> developerList = new ArrayList<Developer>();
        developerList.add(dev1);
        developerList.add(dev2);
        developerList.add(dev3);
        Stream<Developer> developerStream = developerList.stream();
        List<Developer> developersWithUniqueLanguages = developerStream
                .flatMap(
                        developer -> developer.getLanguages().stream()
                                .map(language -> new AbstractMap.SimpleEntry<>(language, developer))
                )
                .collect(Collectors.toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue, (a, b) -> null))
                .values().stream()
                .filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.toList());

        for (Developer d : developersWithUniqueLanguages) {
            System.out.println(d.name);
        }
    }


    public static class Developer {
        private String name;
        private List<String> languages;

        public Developer(String name, List<String> languages) {
            this.name = name;
            this.languages = languages;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getLanguages() {
            return languages;
        }

        public void setLanguages(List<String> languages) {
            this.languages = languages;
        }
    }
}
/*14
 *
 */