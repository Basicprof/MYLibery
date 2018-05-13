package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen  {
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }
    public String getDescription(){
        String Sssss = Country.MOLDOVA;
        int N = getCountOfEggsPerMonth();
        return super.getDescription() +  " Моя страна - "+
                Sssss+". Я несу "+N+" яиц в месяц.";
}
}
