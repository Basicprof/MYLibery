package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Externalizable{

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(new Solution(4));

        File file = new File("ss");
        file.createNewFile();// создаем файл
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Solution  savedObject =  new Solution(5);

        savedObject.writeExternal(objectOutputStream);
        objectOutputStream.close();
        System.out.println(savedObject.string);
          Solution loadedObject = new Solution();
          loadedObject.readExternal(objectInputStream);
        objectInputStream.close();

    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;
    public Solution() {}
    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
               out.writeObject(string);
               out.close();
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
              this.string = (String) in.readObject();
              in.close();
    }
}
