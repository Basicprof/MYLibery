package com.javarush.task.task09.task0917;



public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (Exception e) {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() throws  NullPointerException {
        throw new NullPointerException();
    }

    public void method2 () throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException();
    }

    public void method3() throws NullPointerException {
        throw new NumberFormatException();
    }
}

