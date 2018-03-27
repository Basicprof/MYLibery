package КЛОНИРОВАНИЕ;


import javax.sound.midi.Soundbank;
import java.util.LinkedHashMap;
import java.util.Map;

    /*
    Глубокое клонирование карты
    */
    public class ГлубокоеКлонирование implements Cloneable{

        public static void main(String[] args) {
            ГлубокоеКлонирование solution = new ГлубокоеКлонирование();
            solution.users.put("Hubert", new User(172, "Hubert"));
            solution.users.put("Zapp", new User(41, "Zapp"));
            ГлубокоеКлонирование clone = null;
            try {
                clone =(ГлубокоеКлонирование) solution.clone();
                System.out.println(solution);
                System.out.println(clone);

                System.out.println(solution.users);
                System.out.println(clone.users);

            } catch (CloneNotSupportedException e) {
                e.printStackTrace(System.err);
            }
        }

        protected Map<String, User> users = new LinkedHashMap();
        @Override
        public ГлубокоеКлонирование clone() throws CloneNotSupportedException {
            ГлубокоеКлонирование solution = (ГлубокоеКлонирование) super.clone();
            Map<String, User> user = new LinkedHashMap();
            // Клонируем карту Сооздаем новую
            // Копируем в нее карту текущего объхекта
            // и присваиваем ссылке на ту карту новую ссылку.

            user.putAll(this.users);
            solution.users=user;

            return solution;
        }
        public static class User implements Cloneable{
            int age;
            String name;
            @Override
            public User clone() throws CloneNotSupportedException {
                return  (User)super.clone();
            }
            public User(int age, String name) {
                this.age = age;
                this.name = name;
            }
        }
    }
