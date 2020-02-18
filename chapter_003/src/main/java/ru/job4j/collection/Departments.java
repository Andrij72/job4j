package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> list) {
        HashSet<String> tmp = new HashSet<>();
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
                    } else if (vl[0] == elTmp) {
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
        String temp;
        for (String org : orgs) {
            if (org.contains("/")) {
                temp = org.substring(0, org.lastIndexOf("/"));
                result.add(temp);
            }
            result.add(org);
        }
        return result;
    }

    public static Set<String> sortDesc(List<String> orgs) {

        Comparator<String> compar = new Comparator<>() {
            @Override
            public int compare(String v1, String v2) {
                int res = -1;
                String[] vl1 = v1.split("/");
                String[] vl2 = v2.split("/");
                if (vl1.length == 1 && vl2.length == 1) {
                    res = vl2[0].compareTo(vl1[0]);
                } else if(vl1.length == 2 && vl2.length == 2) {
                    if (vl1[0]==vl2[0]) {
                        res = vl2[1].compareTo(vl1[1]);
                    } else if(vl1.length == 3 && vl2.length == 3){
                        if (vl1[1]==vl2[1])
                            res = vl2[2].compareTo(vl1[2]);
                    }
                }
                return res;
            }
        };

        Set<String> result = new TreeSet<>(compar);
        for (String value : orgs) {
            result.add(value);
        }
        return result;
    }


    public static void main(String[] args) {
        List<String> deps = Arrays.asList(
                "K1/SK1",
                "K1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2"
        );
        List<String> lst = fillGaps(deps);
        sortDesc(lst);
        for (String v:lst) {
            System.out.println(v);
        }

        //Print natural order
        System.out.println("##########");
        sortAsc(lst).
                stream().
                forEach(System.out::println);
    }
}
