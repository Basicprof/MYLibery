package Объекты.СРАВНЕНИЕОБЪЕКТА;

import java.util.Date;

/*
Ошибка в equals/hashCode
*/
public class HachCode {
    private int anInt;
    private String string;
    private double aDouble;
    private Date date;
    private HachCode solution;
    public HachCode(){}

    public HachCode(int anInt, String string, double aDouble, Date date, HachCode solution) {
        this.anInt = anInt;
        this.string = string;
        this.aDouble = aDouble;
        this.date = date;
        this.solution = solution;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (! (o instanceof HachCode)) return false ;

        HachCode solution1 = (HachCode) o;

        if (aDouble != 0.0d? aDouble != solution1.aDouble : solution1.aDouble != 0.0d) return false;


        if (anInt != 0 ? anInt != solution1.anInt : solution1.anInt != 0) return false;

        if (date != null ? date.hashCode()!=solution1.date.hashCode() : solution1.date != null) return false;

        if (solution != null ? solution.hashCode()!=solution1.solution.hashCode() : solution1.solution != null) return false;
        if (string != null ? !string.equals(solution1.string) : solution1.string != null) return false;

        return true;
    }

    @Override
    public int hashCode() {



        int result;
        long temp;
        result = anInt;
        temp = aDouble != +0.0d ? Double.doubleToLongBits(aDouble) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result+ (string != null ? string.hashCode() : 0);
        result = 31 * result +  (date != null ? date.hashCode() : 0);
        result = 31 * result + (solution != null ? solution.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        HachCode solution = new HachCode(55, "MeObjeqt",3.014, new Date(),new HachCode());
        HachCode solutionOne = new HachCode(55, "MeObjeqt",3.014, new Date(),new HachCode());
        //   System.out.println(solution.solution+" "+solutionOne.solution);
        // System.out.println("Сравнение объектов  : "+solution.equals(solutionOne)+
        //  " Хеш коды :"+solution.hashCode()+" "+solutionOne.hashCode());
    }
}

