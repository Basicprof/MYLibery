package ПОТОКИ;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileIODemo {
    public static void main(String[] args) {
        String fPath = "D:\\test\\in.txt";
        String fResult = "D:\\test\\result.txt";
    try {
        // Путем байтовых потоков
        FileInputStream fis = new FileInputStream(fPath);
        FileOutputStream fos = new FileOutputStream(fResult);
        int s = fis.read();
        while (s != -1){
            fos.write(s);
            s = fis.read();
        }
       // This Не правильно закрытые потоки если ошибка то не закроются.
        fis.close();
        fos.close();
     } catch (FileNotFoundException e){
        e.printStackTrace();
    }
    catch (IOException e) {
        e.printStackTrace();
    }
    }
}
