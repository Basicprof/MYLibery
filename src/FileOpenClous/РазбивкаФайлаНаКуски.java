package FileOpenClous;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class РазбивкаФайлаНаКуски {
    public static void main(String[] args) throws IOException {
        String fileName = "f:/Avatar.avi";
        FileInputStream fis = new FileInputStream(fileName);
        byte[] buffer = new byte[fis.available() / 3]; //разбивка на 3 (или 4) части
        int count = 0;
        while (fis.available() > 0) {
            count++;
            int len = fis.read(buffer);
            new FileOutputStream(fileName + ".part" + count).write(buffer, 0, len);
        }
    }
}
