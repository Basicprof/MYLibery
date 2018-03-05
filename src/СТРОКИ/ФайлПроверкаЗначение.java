package СТРОКИ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ФайлПроверкаЗначение {
    public static void main(String[] args) throws IOException, IOException {
    int id = Integer.parseInt(args[0]);
    String name = new Scanner(System.in).nextLine();
    BufferedReader fr = new BufferedReader(new FileReader(name));
    String str = fr.readLine();
    while(!str.equals("")){
        if (Integer.parseInt(str.split(" ")[0]) == id) {
            System.out.println(str);
            break;
        }
        str = fr.readLine();
    }
    fr.close();
}

}
