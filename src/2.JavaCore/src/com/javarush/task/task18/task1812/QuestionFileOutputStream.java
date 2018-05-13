package com.javarush.task.task18.task1812;
 import java.io.*;
 import java.util.concurrent.Callable;

public class QuestionFileOutputStream implements AmigoOutputStream {
     AmigoOutputStream amig;

       QuestionFileOutputStream(AmigoOutputStream amig){
        this.amig = amig;

     }
     @Override
     public void flush() throws IOException {
          amig.flush();

     }

     @Override
     public void write(int b) throws IOException {
      amig.write(b);
     }

     @Override
     public void write(byte[] b) throws IOException {
        amig.write(b);
     }

     @Override
     public void write(byte[] b, int off, int len) throws IOException {
amig.write(b,off,len);
     }
@Override
     public void close() throws IOException {
         System.out.println("Вы действительно хотите закрыть поток? Д/Н");
         BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
         if(bufferedReader.readLine().equals("Д")){
             amig.close();
         }
     }
 }

