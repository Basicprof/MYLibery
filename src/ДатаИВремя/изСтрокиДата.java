
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

    /*
    Читаем и пишем в файл: JavaRush
    */

public class изСтрокиДата {
    public class Solution {
    }
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
                //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

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
                writer.println(this.users);
                for (User a: users){
                    writer.println(a.getFirstName());
                    writer.println(a.getLastName());
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
                        new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);

                User user = new User();
                while (bufferedReader.ready())arrayList.add(bufferedReader.readLine());

                for (int i = 1; i < arrayList.size() ; i+=5) {
                    user.setLastName(arrayList.get(i));
                    user.setFirstName(arrayList.get(i+1));
                    user.setBirthDate(format.parse(arrayList.get(i+2)));
                    user.setMale(Boolean.parseBoolean(arrayList.get(i+3)));
                    user.setCountry(User.Country.valueOf(arrayList.get(i+4)));
                }
                users.add(user);
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

  public class User {
        private String firstName;
        private String lastName;
        private Date birthDate;
        private boolean isMale;
        private Country country;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }

        public boolean isMale() {
            return isMale;
        }

        public void setMale(boolean male) {
            isMale = male;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public static enum Country {
            UKRAINE("Ukraine"),
            RUSSIA("Russia"),
            OTHER("Other");

            private String name;

            private Country(String name) {
                this.name = name;
            }

            public String getDisplayedName() {
                return this.name;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            User user = (User) o;

            if (isMale != user.isMale) return false;
            if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
            if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
            if (birthDate != null ? !birthDate.equals(user.birthDate) : user.birthDate != null) return false;
            return country == user.country;

        }

        @Override
        public int hashCode() {
            int result = firstName != null ? firstName.hashCode() : 0;
            result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
            result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
            result = 31 * result + (isMale ? 1 : 0);
            result = 31 * result + (country != null ? country.hashCode() : 0);
            return result;
        }
    }

}

