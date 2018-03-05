package Файлы;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class ДописатьВФайл {
    //1 Метод
    public static void main(String[] args) {
        OutputStream os = null;
        String appendText = "Этой строкой мы будем обновлять существующий файл";

        try {
            //в конструкторе FileOutputStream используем флаг true, который обозначает обновление содержимого файла
            os = new FileOutputStream("text.txt", true);
            os.write(appendText.getBytes(), 0, appendText.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String filePath = "/home/user/Desktop/project/src/myfile.txt";
        String text = "Hello world!\n";

        try {
            Files.write(Paths.get(filePath), text.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }

        //2 Метод
        filePath = "/home/user/Desktop/project/src/myfile.txt";
        text = "Hello world!\n";

        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }

        //=================================
        String filename="C:\\file.txt";
        System.out.print("Use file : " + filename);
        // 1 вариант
        try{
            FileWriter sw = new FileWriter(filename,true);
            sw.write("Add this text to the end of datafile by FileWriter" + "\n");
            sw.close();
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        // 2-ой вариант
        try {
            RandomAccessFile file = new RandomAccessFile(filename, "rw");
            file.skipBytes((int)file.length()); //skip to the end of the file
            file.writeBytes("Add this text to the end of datafile by RandomAccessFile\n");
            file.close();
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        // 3-ий вариант
        PrintStream out = null;
        try {
            out = new PrintStream(
                    new BufferedOutputStream(
                            new FileOutputStream(filename, true)));
            out.println("Add this text to the end of datafile by FileOutputStream");
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }



    }

}


