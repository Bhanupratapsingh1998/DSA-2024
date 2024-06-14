package com.dsa2024.OPPS.Collections.Map;

import java.util.Hashtable;

public class classHashtableDemo {
    public static void main(String[] args) {
        // Use generics for type safety
        Hashtable<Temp, String> h = new Hashtable<>();
        h.put(new Temp(5), "A");
        h.put(new Temp(2), "B");
        h.put(new Temp(6), "C");
        h.put(new Temp(15), "D");
        h.put(new Temp(23), "E");
        h.put(new Temp(16), "F");
        // h.put("Durga", null); // RE: java.lang.NullPointerException
        System.out.println(h); // {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
    }
}

class Temp {
    int i;

    Temp(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Temp temp = (Temp) obj;
        return i == temp.i;
    }

    @Override
    public String toString() {
        return i + "";
    }
}
