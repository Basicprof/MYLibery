package Файлы;

import java.io.FileInputStream;
import java.util.Scanner;

public class Сканер {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new FileInputStream("text.txt"));
    while (scanner.hasNextLine()){
        System.out.println(scanner.nextLine());
    }
    }
}
