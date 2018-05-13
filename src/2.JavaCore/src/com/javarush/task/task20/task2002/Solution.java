package com.javarush.task.task20.task2002;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix
        // outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте
        // outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);
           // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MMMMM-dd", Locale.ENGLISH);

            JavaRush javaRush = new JavaRush();
            User user  = new User();
            user.setFirstName("Ivan");
            user.setLastName("Ivanov");

           user.setBirthDate(new Date());
            user.setMale(true);
            user.setCountry(User.Country.RUSSIA);

            //initialize users field for the javaRush object
            // here - инициализируйте поле users для объекта javaRush тут
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
           // System.out.println(javaRush.equals(loadedObject));
            for (User u: javaRush.users) {
                System.out.println(u.getLastName());
                System.out.println(u.getFirstName());
                System.out.println(u.getBirthDate());
                System.out.println(u.isMale());
                System.out.println(u.getCountry());
            }for (User u: loadedObject.users) {
                System.out.println(u.getLastName());
                System.out.println(u.getFirstName());
                System.out.println(u.getBirthDate());
                System.out.println(u.isMale());
                System.out.println(u.getCountry());
            }
            //check here that javaRush object equals to loadedObject object -
            // проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer  = new PrintWriter(outputStream);

            for (User a: users){
                writer.println(a.getLastName());
                writer.println(a.getFirstName());
                writer.println(a.getBirthDate());
                 writer.println(a.isMale());
                 writer.println(a.getCountry());
              }
            writer.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            ArrayList <String> arrayList = new ArrayList<>();
         //  String sd = "Fri, 03 Oct 2008 05:52:30 GMT";
            //            Tue Mar 20 11:48:49 EET 2018
            SimpleDateFormat format =
                    new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy",Locale.ENGLISH);


                    while (bufferedReader.ready())arrayList.add(bufferedReader.readLine());

                    for (int i = 0; i < arrayList.size() ; i+=5) {
                        User user = new User();
                  user.setLastName(arrayList.get(i));
                user.setFirstName(arrayList.get(i+1));
                  user.setBirthDate(format.parse(arrayList.get(i+2)));
                user.setMale(Boolean.parseBoolean(arrayList.get(i+3)));
                user.setCountry(User.Country.valueOf(arrayList.get(i+4)));

            users.add(user);
                   }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
