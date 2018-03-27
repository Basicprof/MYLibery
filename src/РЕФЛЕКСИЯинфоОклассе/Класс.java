package РЕФЛЕКСИЯинфоОклассе;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Класс {
    private Class c;

    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.io.FileInputStream");
        // С помощью этого объекта можно узнавать все о классе.
        String nameCl = c.getName();// Возвращает имя класса
        System.out.println("name - "+ nameCl);
        //получить конструкторы
       Constructor [] constructors= c.getConstructors();
       //возвращает массив конструкторов
        for (int i = 0; i <constructors.length ; i++) {
            System.out.println(constructors[i]);
        }
         Class [] intergaces = c.getInterfaces();
        //Множество интерфейсов класса
        for (int i = 0; i < intergaces.length ; i++) {

            System.out.println(intergaces[i]);
        }
        // Получаем модификаторы
        int modificator = c.getModifiers(); //возвращаем целое число
     Modifier.isPrivate(modificator);
     //Проверям истина или лож есть модификатор приват или нет

   if(Modifier.isPrivate(c.getModifiers())) System.out.println("Private");
   if(Modifier.isPublic(c.getModifiers())) System.out.println("Public");
   if(Modifier.isProtected(c.getModifiers())) System.out.println("Protected");
   if(Modifier.isFinal(c.getModifiers())) System.out.println("isFinal");
   if(Modifier.isStatic(c.getModifiers())) System.out.println("isStatic");
        Method []m = c.getMethods();// Получаем методы класса и суперркалсса
        for (int i = 0; i <m.length ; i++) {
            System.out.println(m[i]);
        }
        //Получам поля класса
        Field []f = c.getFields();
        for (int i = 0; i <f.length ; i++) {
            System.out.println(f[i]);
            System.out.println(f[i].getName());//Получение имени поля
            System.out.println(f[i].getType());//Получение типа поля
        }
    }
}
