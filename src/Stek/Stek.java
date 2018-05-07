package Stek;

public class Stek {
    public static void main(String[] args)
    {
        method1();
    }

    public static void method1()
    {
        method2();
    }

    public static void method2()
    {
        method3();
    }

    public static void method3()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        // currentThread() Получаем ссылку на текущий поток нить
        //  getStackTrace() - получаем массив
        // StackTraceElement[], элементами которого являются стековые фрейы
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getClassName()+" : "+element.getClassName());
        }
    }
}

