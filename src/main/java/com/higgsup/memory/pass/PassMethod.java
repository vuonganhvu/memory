package com.higgsup.memory.pass;

public class PassMethod {
    public static void main(String[] args) {
        A a = new A("Anhvv");
        change(a);
        System.out.println(a.getA());
    }
    private static void change(A a){
        a = new A("Hungnh");
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
