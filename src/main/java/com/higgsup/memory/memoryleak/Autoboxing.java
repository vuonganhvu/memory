package com.higgsup.memory.memoryleak;

public class Autoboxing {
    public long addIncremental(long l) {
        Long sum = 0L;
        sum = sum + l; //create 1000 object sum khong can thiet
        return sum;
    }

    public static void main(String[] args) {
        Autoboxing adder = new Autoboxing();
        for (long i = 0; i < 1000; i++) {
            adder.addIncremental(i);
        }
        System.out.println("Success");
    }
}
