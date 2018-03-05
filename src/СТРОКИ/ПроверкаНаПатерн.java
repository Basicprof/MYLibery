package СТРОКИ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ПроверкаНаПатерн {
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
