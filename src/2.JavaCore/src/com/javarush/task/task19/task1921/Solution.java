package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        Pattern pattern = Pattern.compile("([\\D+\\s*]+)([\\d+\\s*]+)");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
String strok="";
        while (bufferedReader.ready()) {
         strok += bufferedReader.readLine();
        }bufferedReader.close();
        Matcher matcher = pattern.matcher(strok);
            while (matcher.find()) {
                if (!matcher.group(0).trim().isEmpty()) {
                PEOPLE.add(new Person(matcher.group(1).trim(),
        simpleDateFormat.parse(matcher.group(2))));
                }
            }

            for (int i = 0; i < PEOPLE.size(); i++) {
                System.out.println(PEOPLE.get(i).getName() + " " +
                         PEOPLE.get(i).getBirthday());
          }


    }}


