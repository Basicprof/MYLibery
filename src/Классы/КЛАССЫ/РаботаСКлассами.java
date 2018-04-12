package Классы.КЛАССЫ;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class РаботаСКлассами {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException {
    SomeClass someClass = new SomeClass();
    Class clss  = someClass.getClass();
    Class clss2 = SomeClass.class;
        System.out.println(clss.getName());//Имя класса
        System.out.println("");
        System.out.println("Constructor :");
    Class clss3 = Class.forName("com.video.lessons.SomeClass");
    SomeClass someClass1 = (SomeClass)clss.newInstance();
    // Делаем новый класс рефлексией
         Constructor    constructors= clss.getConstructor();
         //Выводим все конструктор
        Constructor[] constructorsD= clss.getDeclaredConstructors();
        //Выводим все конструктор
      //Constructor constructor = clss.getMethod();  //Выводим все методы
   for (Constructor constructor : constructorsD) {
       System.out.println(constructor.getName());
       Parameter[] parameters = constructor.getParameters();
       for (Parameter parameter : parameters) {
           System.out.println(parameter.getName());
           System.out.println(parameter.getType().getName());
       }

       System.out.println("");
       System.out.println("  Method[]");

       Method[] methods = clss.getDeclaredMethods();
       for (Method method : methods) {
           System.out.println(method.getName());
           Parameter[] parametersM = method.getParameters();
           for (Parameter parameter : parametersM) {
               System.out.println(parameter.getName());
               System.out.println(parameter.getType().getName());
           }
       }
   }
        System.out.println(clss +" "+clss+" "+clss2+" "+clss3);
    }
    static class SomeClass{

         private  static transient int i;
           String s;
           public SomeClass(){}
           public SomeClass (String s){
               this.s=s;
           }
           public String someMethcd(){
               System.out.println("this is : "+ s);
               return  s;
           }
    }
}