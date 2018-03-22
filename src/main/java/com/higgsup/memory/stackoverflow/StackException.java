package com.higgsup.memory.stackoverflow;

public class StackException {
    public static void main(String[] args) {
        StackException stackException1 = new StackException();
        StackException stackException2 = new StackException();
        stackException1.dequi(stackException2);
    }

    public void dequi(StackException stack){
        stack.dequi(this);
    }
}
