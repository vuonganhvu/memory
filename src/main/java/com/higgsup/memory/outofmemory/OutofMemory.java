package com.higgsup.memory.outofmemory;

import java.util.ArrayList;
import java.util.List;

public class OutofMemory {
    public static void main(String[] args) {
        int size = 1000000;
        List<A> aList = new ArrayList<A>();
        for(int i =0; i< size; i++){
            aList.add(new A("a_"+i));
        }
    }
}

class A {
    private String a;

    public A(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
}