package com.higgsup.memory.string;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "S1";
        String s2 = "S1";
        String s3 = new String("S1");
        System.out.println("s1 == s2 " + (s1==s2));
        System.out.println("s1 == s3 " + (s1==s3));
        System.out.println("s1 equals s3 " + (s1.equals(s3)));
    }
}
