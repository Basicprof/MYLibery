package com.javarush.task.task19.task1924;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static String[] chisla = {"ноль", "один", "два", "три", "четыре",
            "пять", "шесть", "семь", "восемь", "девять", "десять",
            "одиннадцать", "двенадцать"};

    static {
        for (int i = 0; i < chisla.length; i++) {
            map.put(i, chisla[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufFile = buffirReaderFileInpStrReder();
        while (bufFile.ready()) {
            String stroka = rekLine(bufFile.readLine());

            if (!stroka.isEmpty())
               System.out.println(stroka);
 }
        bufFile.close();
    }

    public static BufferedReader buffirReaderFileInpStrReder() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReaderFile =
                new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();

        return bufferedReaderFile;
    }

    public static String rekLine(String str) {
        String result = str;
        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            Integer key = pair.getKey();                      //ключ
            String value = pair.getValue();
            String regVur = "\\b" + String.valueOf(key) + "\\b"; // "\\b"+key+"\\b";                                  //значение
            Pattern pattern = Pattern.compile(regVur);
            Matcher matcher = pattern.matcher(result);

            while (matcher.find()) {
           result = result.replaceAll("\\b"+String.valueOf(key)+"\\b",value);
                    }
                }
         return result;
        }

}