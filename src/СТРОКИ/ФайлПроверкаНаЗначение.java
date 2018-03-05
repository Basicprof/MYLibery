package СТРОКИ;
 import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
 public class ФайлПроверкаНаЗначение {
     public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    FileInputStream inputStream = new FileInputStream(reader.readLine());
    reader.close();

    StringBuilder strBld = new StringBuilder();
    while (inputStream.available() > 0)
        strBld.append((char) inputStream.read());
    inputStream.close();

    String[] products = strBld.toString().split("\n");
    for (String x : products) if (x.startsWith(args[0] + " "))
        System.out.println(x);
}
}

