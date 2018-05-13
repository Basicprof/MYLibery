package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 5;
    }
    public String getDescription(){
        String Sssss = Country.BELARUS;
        int N = getCountOfEggsPerMonth();
    return super.getDescription()+  " Моя страна - "+Sssss+". Я несу "+N+" яиц в месяц.";}
}
