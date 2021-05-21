package com.mapchallange;

import java.util.HashMap;
import java.util.Map;

public class user {
    private final long Number;
    private final String Name;
    private final Map<String, Integer> exits;

    public user(long number, String name) {
        Number = number;
        Name = name;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Exit", 0);
    }



    public long getNumber() {
        return Number;
    }

    public String getName() {
        return Name;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }
}
