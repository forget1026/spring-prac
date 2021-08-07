package com.Chapter5.ch12;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * -1;
    }
}

public class StringTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new MyCompare());
        treeSet.add("Park");
        treeSet.add("Kim");
        treeSet.add("Lee");

        System.out.println(treeSet);
    }
}
