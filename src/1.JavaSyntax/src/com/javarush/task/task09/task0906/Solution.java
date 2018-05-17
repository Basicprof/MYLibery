package com.javarush.task.task09.task0906;


public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();

        System.out.printf(stackTraceElement[2].getClassName()+": "+stackTraceElement[2].getMethodName()+": "+s);
    }
}
