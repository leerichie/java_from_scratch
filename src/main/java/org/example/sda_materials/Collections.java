package org.example.sda_materials;

import java.util.*;

public class Collections {
    static class Prisoner {
        private final int id;
        private final String name;
        private final String lastName;

        public Prisoner(int id, String name, String lastName) {
            this.id = id;
            this.name = name;
            this.lastName = lastName;
        }

        public String getName() {
            return name + " " + lastName.charAt(0);
        }

        public int getId() {
            return id;
        }
    }

    public static void main(String[] args) {
        List<Prisoner> prisoners = Arrays.asList(
                new Prisoner(1, "Tom", "Dental"),
                new Prisoner(2, "Richard", "Smartie"),
                new Prisoner(3, "Richard", "Smartie"),
                new Prisoner(4, "Jenni", "Sharp"),
                new Prisoner(5, "Jenni", "Sharp"),
                new Prisoner(6, "Sharon", "Baron"),
                new Prisoner(7, "Sharon", "Baron")
        );

        Collection<String> names = prisoners.stream()
                .map(Prisoner::getName)
                .toList();

        Collection<Integer> ids = prisoners.stream()
                .map(Prisoner::getId)
                .toList();

        System.out.println(names);
        System.out.println(ids);

        Set<String> namesSet = new HashSet<>();     // cant contain duplicates
        namesSet.add("Tommy");
        namesSet.add("Bob");
        namesSet.add("Chloe");
        namesSet.add("Fanny");
        for (String findB : namesSet) {
            System.out.println("names: " + findB);
        }
        namesSet.forEach(System.out::println);

        List<Float> temp = new ArrayList<>();
        temp.add(-0.0f);
        temp.add(1.5f);
        temp.add(14.2f);
        temp.add(30.0f);
        for (Float t : temp) {
            System.out.println("temps: " + t);
        }
        for (Float ten : temp) {
            if (ten > 10f) {
                System.out.println("above 10: " + ten);
            }
        }
        Queue<String> lfc = new LinkedList<>();
        lfc.offer("Gerrad");
        lfc.offer("Henderson");
        lfc.offer("Rush");
        lfc.offer("Barnes");
        System.out.println("FirstInFirstOut" + lfc.poll());
        for (String FIFO : lfc) {
            System.out.println("after POLL: " + FIFO);
        }
        System.out.println("LastInFirstOut" + lfc.peek());
        for (String LIFO : lfc) {
            System.out.println("after PEEK: " + LIFO);
        }
        Map<String, Float> employees = new HashMap<>();
        employees.put("Ania J", 10.000f);
        employees.put("Leesk R", 15.000f);
        employees.put("Diddy P", 24.000f);
        for (String key : employees.keySet()) {
            System.out.println("employee key: " + key);
        }
        for (Float value : employees.values()) {
            System.out.println("employee value: " + value);
        }
        for (Map.Entry<String, Float> pair : employees.entrySet()) {
            System.out.println("employee key & value: " + pair);
        }
        Iterator<String> namesIterator = namesSet.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(true);
            if(true){
                break;
            }
        }
    }
}