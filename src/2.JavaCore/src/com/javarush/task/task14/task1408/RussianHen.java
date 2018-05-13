package com.javarush.task.task14.task1408;

public class RussianHen extends Hen  {
    @Override
    public int getCountOfEggsPerMonth() {
        return 6;
    } public String getDescription(){
        String Sssss = Country.RUSSIA;
        int N = getCountOfEggsPerMonth();
        return super.getDescription() +  " Моя страна - "+Sssss+". Я несу "+N+" яиц в месяц.";}
}