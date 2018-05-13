package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
 public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
   public static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
   public static SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));
        //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));
        //сегодня родился    id=1
    }
   public static void main(String[] args) throws ParseException {

     if (args[0].equals("-c")) {
         String name = args[1];
         String sex  = args[2];
         Date   bd   = format.parse(args[3]);

         if (sex.equals("ж")) {
             allPeople.add(allPeople.size(), Person.createFemale(name, bd));
         }
         if (sex.equals("м")) {
             allPeople.add(allPeople.size(), Person.createMale(name, bd));
         }
         System.out.println(allPeople.size() - 1);
     }
        if (args[0].equals("-u")){
             int id = Integer.parseInt(args[1]);
            String name = args[2];
            String   sex  = args[3];
            Date   bd   = format.parse(args[4]);
               allPeople.get(id).setName(name);
               if(sex.equals("ж"))allPeople.get(id).setSex(Sex.FEMALE);
               if(sex.equals("м"))allPeople.get(id).setSex(Sex.MALE);
            allPeople.get(id).setBirthDay(bd);

        }
       if (args[0].equals("-d")){
           int id = Integer.parseInt(args[1]);
            allPeople.get(id).removePerson();
           }
       if (args[0].equals("-i")){
           int id = Integer.parseInt(args[1]);
               String sex = allPeople.get(id).getSex().equals(Sex.FEMALE)?"ж":"м";
           System.out.println(allPeople.get(id).getName()+" "+
                   sex+" " +
                   format2.format(allPeople.get(id).getBirthDay()));
       }
    }
      }
