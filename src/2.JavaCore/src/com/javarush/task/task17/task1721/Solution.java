package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    static String line = "";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader name1 = new BufferedReader(new FileReader(bufferedReader.readLine()));
        BufferedReader name2 = new BufferedReader(new FileReader(bufferedReader.readLine()));
        bufferedReader.close();
        while ((line = name1.readLine()) != null) allLines.add(line);
        while ((line = name2.readLine()) != null) forRemoveLines.add(line);


        Solution solution = new Solution();
        solution.joinData();
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
