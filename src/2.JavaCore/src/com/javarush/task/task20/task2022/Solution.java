package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
   transient private FileOutputStream stream;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {

        out.writeObject(this);

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        this.stream = new FileOutputStream("s",true);


    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution("ss");
        solution.writeObject("Привет это сохранение объекта");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("s") );
        solution.writeObject(objectOutputStream);
        objectOutputStream.close();
        solution.close();
        Solution solutionNew = new Solution("ss");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("s"));
         solutionNew.readObject(objectInputStream);
         solutionNew.writeObject("Вторая строка записи в объжект");
      objectInputStream.close();
      solutionNew.close();

    }
}
