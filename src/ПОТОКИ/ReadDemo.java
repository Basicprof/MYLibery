package ПОТОКИ;

import java.io.*;

public class ReadDemo {
    public static void main(String[] args) throws IOException {
        String fPath = "D:\\test\\in.txt";
        int i, count = 0;
        File f = new File(fPath);
        FileReader fr = null;
        // FileReader наследуется от
        // ImputStreamReader Класс для работы
        // ссимвольными потоками
        //Проверяем есть ли данные в потоке
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String reader = bufferedReader.readLine();
        //Проверяем есть ли данные в потоке
        if(bufferedReader.ready()) reader = bufferedReader.readLine();
try {
    fr = new FileReader(f);
    while ((i = fr.read()) != -1){// посимвольно считываем
        System.out.print((char) i);
        Thread.sleep(500);
    }
 }
catch (FileNotFoundException e){
    e.printStackTrace();
}catch (IOException e){
    e.printStackTrace();
}catch (Exception e){
    e.printStackTrace();
}finally {
    if(fr != null){
        try {
            fr.close();
           }
           catch (IOException e){
            e.printStackTrace();
        }
       }
   }

    }
}
