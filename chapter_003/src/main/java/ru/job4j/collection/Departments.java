package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> list) {
        Set<String> tmp = new TreeSet<>();
        for (String value : list) {
            if (!value.contains("/")) {
                tmp.add(value);
            } else {
                String[] vl = value.split("/");
                String elTmp = "";
                for (String el : vl) {
                    if (vl.length == 1) {
                        elTmp = el;
                        tmp.add(el);
                    } else if (vl[0].equals(elTmp)) {
                        tmp.add(value);
                    } else {
                        tmp.add(vl[0]);
                        tmp.add(value);
                    }
                }
            }
        }
        return new ArrayList<>(tmp);
    }

    public static Set<String> sortAsc(List<String> orgs) {
        Set<String> result = new TreeSet<>();
        for (String org : orgs) {
            result.add(org);
        }
        return result;
    }

    public static Set<String> sortDesc(List<String> departments) {
        Set<String> result = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        result.addAll(departments);
        return result;
    }

    public static void main(String[] args) {
        List<String> deps = Arrays.asList(
                "K1/SK1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2"
        );
        //Print when missed department
        fillGaps(deps).forEach(System.out::println);
        System.out.println("============");
        //Print in descender order
        for (String v : sortDesc(deps)) {
            System.out.println(v);
        }
        System.out.println("##########");
        //Print natural order
        sortAsc(deps).
                forEach(System.out::println);
    }
}
