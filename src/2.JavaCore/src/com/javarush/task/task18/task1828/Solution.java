package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
//oioioioioioiioioi
    //lklklkoikjiuhkhnbbkjb

        public static void main(String[] args) throws Exception {

            if (args[0].equals("-u")) { update(args[1],args[2],args[3],args[4]);}
            if (args[0].equals("-d")) { dell(args[1]);}


            }
public  static void update(String s1, String s2,String s3,String s4) throws IOException {
                StringBuffer stringBuffer = new StringBuffer();
                String name="";
                stringBuffer.append(s1);
                while (stringBuffer.length() < 8) stringBuffer.append(" ");
                stringBuffer.append(s2);

                while (stringBuffer.length() < 38) stringBuffer.append(" ");
                stringBuffer.append(s3);

                while (stringBuffer.length() < 46) stringBuffer.append(" ");
                stringBuffer.append(s4);

                while (stringBuffer.length() < 50) stringBuffer.append(" ");

                BufferedReader bufferedR =
                        new BufferedReader(new InputStreamReader(System.in));
                //Считываем с консоли имя файла
                name = bufferedR.readLine();
                // запускаем поток для чтения из файла построчно
                BufferedReader reader = new BufferedReader(new FileReader(name));

                //Читаем файл построчно
                int str = 1;
                String line = "";
                List<String> list = new ArrayList<>();
                while ((line = reader.readLine()) != null) {
                    str = Integer.parseInt(line.substring(0, 8).trim());

                    if (str == Integer.parseInt(s1)) {System.out.println(stringBuffer.toString());
                        list.add(list.size(),stringBuffer.toString());
                    }else list.add(list.size(), line);
                }

                reader.close();
                BufferedWriter writer = new BufferedWriter(new FileWriter(name));
                writer.write("");
                for (String lines : list) {

                    writer.write(lines+"\n");
                }
                writer.close();


            }public  static void dell(String s1) throws IOException {

        String name="";

        BufferedReader bufferedR =
                new BufferedReader(new InputStreamReader(System.in));
        //Считываем с консоли имя файла
        name = bufferedR.readLine();
        // запускаем поток для чтения из файла построчно
        BufferedReader reader = new BufferedReader(new FileReader(name));

        //Читаем файл построчно
        int str = 1;
        String line = "";
        List<String> list = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            str = Integer.parseInt(line.substring(0, 8).trim());

            if (!(str == Integer.parseInt(s1))) {
                list.add(list.size(),line);
            }
        }

        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter(name));
        writer.write("");
        for (String lines : list) {

            writer.write(lines+"\n");
        }
        writer.close();


    }}










