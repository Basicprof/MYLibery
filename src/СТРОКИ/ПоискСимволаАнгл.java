package СТРОКИ;

import java.io.FileInputStream;
import java.io.IOException;

public class ПоискСимволаАнгл {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:/file1.txt");
        int count = 0;

        while (fileInputStream.available() > 0) {
            char c = (char) fileInputStream.read();
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                count++;
            }
        }
        fileInputStream.close();

        System.out.println(count);
    }
}

