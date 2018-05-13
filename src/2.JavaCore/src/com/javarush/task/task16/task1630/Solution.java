package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    public static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static {
        try {  firstFileName = bufferedReader.readLine();
             secondFileName = bufferedReader.readLine();
      } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
  public static void main(String[] args) throws InterruptedException {

        systemOutPrintln(firstFileName);
 systemOutPrintln(secondFileName);
    }
  public static void systemOutPrintln(String fileName) throws InterruptedException {
  ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
         f.start();
        f.join();
       //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }
    public interface ReadFileInterface {
        void setFileName(String fullFileName);
        String getFileContent();
        void join() throws InterruptedException;

        void start();
    }
    public static class ReadFileThread  extends Thread implements ReadFileInterface {
        String file=null;
        String contant="";
        @Override
        public void setFileName(String fullFileName) {
            file =fullFileName;
        }
        @Override
        public String getFileContent() {
            return this.contant;}



        @Override
        public void run() {
            String file ="";
            String line ="";
            try {

                BufferedReader bufferedReader =
                        new BufferedReader(new FileReader(this.file));
                while ((file = bufferedReader.readLine())!=null)
                {contant += file+" ";
                  }  getFileContent();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //Thread.currentThread().interrupt();
        }
    }
}

