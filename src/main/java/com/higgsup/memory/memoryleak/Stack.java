package com.higgsup.memory.memoryleak;

public class Stack {
    private int maxSize;
    private Integer[] stackArray;
    private int pointer;

    public Stack(int s) {
        maxSize = s;
        stackArray = new Integer[maxSize];
        pointer = -1;
    }

    public void push(Integer j) {
        stackArray[++pointer] = j;
    }

    public int pop() {
        return stackArray[pointer--];
    }

    public int pop2() {
        int size = pointer--;
        int element = stackArray[size];
        stackArray[size] = null;
        return element;
    }

    public int peek() {
        return stackArray[pointer];
    }

    public boolean isEmpty() {
        return (pointer == -1);
    }

    public boolean isFull() {
        return (pointer == maxSize - 1);
    }

    public static void main(String[] args) {
        int size = 15000;
        Stack stack = new Stack(100000);
        for (int i = 0; i < size; i++) {
            stack.push(i);
        }
        for (Integer i = 0; i < size; i++) {
            int element = stack.pop2();
//            int element = stack.pop();
            System.out.println("Poped element is " + element);
        }
    }

}
