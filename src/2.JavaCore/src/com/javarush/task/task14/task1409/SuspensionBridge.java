package com.javarush.task.task14.task1409;

public class SuspensionBridge implements  Bridge{
    int NUM=2;
    @Override
    public int getCarsCount() {
        return NUM;
    }
}
