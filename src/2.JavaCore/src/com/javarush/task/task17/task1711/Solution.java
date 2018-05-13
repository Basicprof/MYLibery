package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
     public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }
  public static void main(String[] args) throws ParseException {
        //-c name1 sex1 bd1 name2 sex2 bd2 ...
switch (args[0]) {
    case  "-c": synchronized (allPeople){
        for (int i = 1; i < args.length; i += 3) {
            if (args[i + 1].equals("м"))
                allPeople.add(Person.createMale(args[i], simpleDateFormat.parse(args[i + 2])));
            if (args[i + 1].equals("ж"))
                allPeople.add(Person.createFemale(args[i], simpleDateFormat.parse(args[i + 2])));
            System.out.println(allPeople.size() - 1);
        }
    }break;

    case "-u":synchronized (allPeople){
        for (int i = 1; i < args.length; i += 4) {
            allPeople.get(Integer.parseInt(args[i])).setName(args[i + 1]);
            if (args[i + 2].equals("м"))
                allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
            if (args[i + 2].equals("ж"))
                allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE);
            allPeople.get(Integer.parseInt(args[i])).setBirthDay(simpleDateFormat.parse(args[i + 3]));

        }
    }break;
    case "-d": synchronized (allPeople){
        for (int i = 1; i < args.length; i++) {
            allPeople.get(Integer.parseInt(args[i])).remove();
        }
    }break;
    case "-i":synchronized (allPeople){
        for (int i = 1; i < args.length; i++) {
            String six = allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.FEMALE) ? "ж" : "м";

            System.out.println(
                    allPeople.get(Integer.parseInt(args[i])).getName() + " " +
                            six + " " +
                            simpleDateFormat2.format(allPeople.get(Integer.parseInt(args[i])).getBirthDay()));

        }
    }break;
    default:synchronized (allPeople){break;}
}
       }
    }


