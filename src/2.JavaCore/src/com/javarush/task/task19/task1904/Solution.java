package com.javarush.task.task19.task1904;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
public class Solution { public static void main(String[] args) throws IOException, ParseException {
        PersonScannerAdapter scanner = new PersonScannerAdapter(new Scanner(new File("file.txt")));
    System.out.println(scanner.read());
}
    public static class PersonScannerAdapter implements PersonScanner{
        private  Scanner fileScanner;
        PersonScannerAdapter (Scanner fileScanner){
            this.fileScanner = fileScanner;
        }
@Override
        public Person read() throws IOException, ParseException {
            String userNameString = fileScanner.nextLine();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);

            String [] string = userNameString.split(" ");

            Person person = new Person(string[1]
                    ,string[2]
                    ,string[0]
                    ,
                    simpleDateFormat.parse(string[3]+" "+string[4]+" "+string[5])
            );
 return person;
        }
 @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}

