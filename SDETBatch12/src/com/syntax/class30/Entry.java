package com.syntax.class30;

import java.util.HashSet;
import java.util.Set;

public class Entry {
    String key;
    Double value;
    String name = "alam";

    public Entry(String key, Double value) {
        this.key = key;
        this.value = value;
    }
    public String getKey() {
        return key;
    }
    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {return "Entry{" + "key='" + key + '\'' + ", value=" + value + '}';}

}


class Test{
    public static void main(String[] args) {
        //creating a class and storing object of that class in a set
        Set<Entry> entries = new HashSet<>();
        entries.add(new Entry("Apple", 12.0));
        entries.add(new Entry("Banana", 10.0));
        entries.add(new Entry("Mango", 14.0));
        System.out.println(entries);
        for(Entry e: entries){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
