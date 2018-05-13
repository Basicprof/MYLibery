package com.javarush.task.task19.task1908;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();

        BufferedReader bufferedReaderFile = new BufferedReader(new FileReader(name1));
        BufferedWriter bufferedWriterFile = new BufferedWriter(new FileWriter(name2));
        bufferedReader.close();
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        String s = "";


        while ((s = bufferedReaderFile.readLine()) != null) {

            Matcher m = pattern.matcher(s);

            while (m.find()) {
                bufferedWriterFile.write(s.substring(m.start(), m.end()));
                bufferedWriterFile.write(" ");
            }
        }

            bufferedReaderFile.close();
            bufferedWriterFile.close();


    }
}
