package com.javarush.task.task18.task1822;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 public class Solution {
    public static void main(String[] args) throws IOException {
        String id = args[0];
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        //FileInputStream fileInputStream = new FileInputStream(file);
        BufferedReader fin = new BufferedReader(new FileReader(file));
        Pattern p = Pattern.compile("^(\\d+)\\s+.*\\s+[^\\s]+\\s+\\d+$");
        while (fin.ready()) {//Читаем пока запрос ожидается
            String line = fin.readLine();// читаем строку
           Matcher m = p.matcher(line);
         if (m.matches() && id.equals(m.group(1))) {
           System.out.println(line);
            }
        }
        fin.close();
    }
}

//        String [] string = s.split(" ");
//        byte [] b = new byte[fileInputStream.available()];
//        fileInputStream.read(b);
//        fileInputStream.close();
//        char[] c = new char[0];
//        int sim = Integer.parseInt(args[0]);
//        c = new String(b).toCharArray(); // Присвоили массив символов из char
//        for(char ch : c){
//            System.out.println(ch);



