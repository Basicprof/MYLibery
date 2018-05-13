package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen  {
    @Override
    public int getCountOfEggsPerMonth() {
        return 1;
    } public String getDescription(){
        String Sssss = Country.UKRAINE;
        int N = getCountOfEggsPerMonth();
        return super.getDescription() +  " Моя страна - "+Sssss+". Я несу "+N+" яиц в месяц.";}
}
