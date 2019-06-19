package com.zipcodewilmington.phonebook;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    Map<String, List<String>> map;
    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;
    }

    public PhoneBook() {

        map = new LinkedHashMap();
    }


    public void add(String name, String phoneNumber) {

        map.put(name, Arrays.asList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        map.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String name) {
        List<String> number = new ArrayList<>();
        number.add(name);
       if( map.containsKey(name) || map.containsValue(number)) {
           return true;
       }
       return false;
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for(String s : map.keySet()) {
            if (map.get(s).contains(phoneNumber)) {
                return s;
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        List<String> arr = new ArrayList<>();
        for (String name: map.keySet()) {
            arr.add(name);
        }
        return arr;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }
}
