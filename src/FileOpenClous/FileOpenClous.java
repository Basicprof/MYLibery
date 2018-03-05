package FileOpenClous;

//package com.javarush.task.task13.task1318;

        import java.io.*;


public class FileOpenClous {


        public static void main(String[] args) throws IOException {
    // InputStream = поток для чтения
     InputStream inStream = new FileInputStream("c:/source.txt");
    // OutputStream Поток для записи
     OutputStream outStream = new FileOutputStream("c:/result.txt");
                while (inStream.available() > 0)
                {
                        int data = inStream.read(); //читаем один байт из потока для чтения
                        outStream.write(data); //записываем прочитанный
                    // байт в другой поток.
                }
                System.out.print((char) inStream.read());
                inStream.close(); //закрываем потоки
                outStream.close();

 // Создание объекта в памяти но не на дистке.
   File myFile = new File("sdfas/asdfsdf");
  if(myFile.isDirectory()){ //Если это  деректория
                        System.out.println("dir = ");
                }
                if(myFile.isFile()) //Является ли это файлом
                        System.out.println("file = " );
                if(myFile.exists())// Если файл существует
                        System.out.println("exitsrs = " );
                BufferedWriter bufferedWriter =
                        new BufferedWriter(new FileWriter(myFile, true));
//    PrintWriter writer = new PrintWriter(bufferedWriter);
//        do {
//        s = bufferedReader.readLine();
//        writer.println(s);
//    }
//        while (!s.equals("exit"));
//        bufferedWriter.close();
//            writer.close();
}
}
