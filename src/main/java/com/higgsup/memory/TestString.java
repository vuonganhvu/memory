package com.higgsup.memory;

/**
 * Created on 21-Mar-18.
 * OwnerBy anhvu
 */
public class TestString {
    public static void main(String[] args) {
        String s1 = new String("S1");
        String s2 = "S2";
        change(s1);
        change(s2);
        System.out.println("s1 " + s1);
        System.out.println("s2 " + s2);
    }

    private static void change(String s){
        s = "Anhvv";
    }
}
