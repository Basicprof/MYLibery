package NIO;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ЧтениеФайлаIoNio {
    public static void main(String[] args) throws IOException {
        int content;
       try (InputStream inputStream = Files.newInputStream(Paths.get("D:\\Текущая идеа\\15\\MyLibery\\src\\Файлы\\NIO\\ФАЙЛЫАРХИВ\\a"))){
                        do {
                            content = inputStream.read();
                            if(content!=-1) System.out.print((char) content);
                        }
                        while (content!=-1);


        }catch (IOException ixceprion){
           System.out.println("Input/Output exit");
       }
    }
}
