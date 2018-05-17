    package com.javarush.task.task18.task1813;
    import java.io.FileInputStream;
    import java.io.FileNotFoundException;
    import java.io.FileOutputStream;
    import java.io.IOException;
    public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    FileOutputStream fileOutputStream;
    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
         super(fileName);
        this.fileOutputStream = fileOutputStream;
  }
    public static void main(String[] args) throws FileNotFoundException {
     new AmigoOutputStream(new FileOutputStream(fileName));
    }
    public void close() throws IOException {

        fileOutputStream.flush();
        String ss ="JavaRush © All rights reserved.";
  fileOutputStream.write(ss.getBytes());
        fileOutputStream.close();

    }
     public void write(int b) throws IOException {
         fileOutputStream.write(b);
     }
        public void write(byte[] bs) throws IOException {
            fileOutputStream.write(bs);
        }
        public void write( byte[] b, int off, int len) throws IOException, IOException {
            fileOutputStream.write(  b, off, len );
        }
       public  void flush() throws IOException {
           fileOutputStream.flush();
        }
 }
