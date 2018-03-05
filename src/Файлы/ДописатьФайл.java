package Файлы;

import java.io.*;

public class ДописатьФайл {
    public static void main(String[] args) throws Exception {StringBuffer stringBuffer = new StringBuffer();
    String name="";
    if (args[0].equals("-c")) {
        BufferedReader bufferedR =
                new BufferedReader(new InputStreamReader(System.in));
        //Считываем с консоли имя файла
        name = bufferedR.readLine();
        // запускаем поток для чтения из файла построчно
        BufferedReader reader = new BufferedReader(new FileReader(name));

        //Читаем файл построчно
        int str = 1;
        String line = "";
        while ((line = reader.readLine()) != null) {
            str = Integer.parseInt(line.substring(0, 8).trim()) + 1;
        }
        reader.close();
        stringBuffer.append(str);
        System.out.println(stringBuffer);

        while (stringBuffer.length() < 8) stringBuffer.append(" ");
        stringBuffer.append(args[1]);

        while (stringBuffer.length() < 38) stringBuffer.append(" ");
        stringBuffer.append(args[2]);

        while (stringBuffer.length() < 46) stringBuffer.append(" ");
        stringBuffer.append(args[3]);

        while (stringBuffer.length() < 50) stringBuffer.append(" ");

    }
    BufferedWriter writer = new BufferedWriter(new FileWriter(name,true));
    System.out.println(stringBuffer.toString());
    writer.write( "\n"+stringBuffer.toString());
    writer.close();





}}


