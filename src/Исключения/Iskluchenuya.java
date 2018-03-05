/*Встроенные исключения Java

Существуют несколько готовых системных исключений. Большинство из них являются подклассами типа
RuntimeException и их не нужно включать в список throws. Вот небольшой список непроверяемых исключений.

ArithmeticException - арифметическая ошибка, например, деление на нуль
ArrayIndexOutOfBoundsException - выход индекса за границу массива
ArrayStoreException - присваивание элементу массива объекта несовместимого типа
ClassCastException - неверное приведение
EnumConstantNotPresentException - попытка использования неопределённого значения перечисления
IllegalArgumentException - неверный аргумент при вызове метода
IllegalMonitorStateException - неверная операция мониторинга
IllegalStateException - некорректное состояние приложения
IllegalThreadStateException - запрашиваемая операция несовместима с текущим потоком
IndexOutofBoundsException - тип индекса вышел за допустимые пределы
NegativeArraySizeException - создан массив отрицательного размера
NullPointerException - неверное использование пустой ссылки
NumberFormatException - неверное преобразование строки в числовой формат
SecurityException - попытка нарушения безопасности
StringIndexOutOfBounds - попытка использования индекса за пределами строки
TypeNotPresentException - тип не найден
UnsupportedOperationException - обнаружена неподдерживаемая операция
Список проверяемых системных исключений, которые можно включать в список throws.

ClassNotFoundException - класс не найден
CloneNotSupportedException - попытка клонировать объект, который не реализует интерфейс Cloneable
IllegalAccessException - запрещен доступ к классу
InstantiationException - попытка создать объект абстрактного класса или интерфейса
InterruptedException - поток прерван другим потоком
NoSuchFieldException - запрашиваемое поле не существует
NoSuchMethodException - запрашиваемый метод не существует
ReflectiveOperationException - исключение, связанное с рефлексией*/

package Исключения;

public class Iskluchenuya {public static void main(String[] args)
//{
//    System.out.println("Program starts");
//
//    try
//    {
//        System.out.println("Before method1 calling");
//        method1();
//        System.out.println("After method1 calling. Never will be shown");
//    }
//    catch (Exception e)
//    {
//        System.out.println("Exception has been caught");
//    }
//
//    System.out.println("Program is still running");
//}
//
//    public static void method1()
//    {
//        int a = 100;
//        int b = 0;
//        System.out.println(a / b);
//    }
//} public static void main(String[] args)
{
    System.out.println("Program starts");

    try
    {
        System.out.println("Before method1 calling");
   //     method1();
        System.out.println("After method1 calling. Never will be shown ");
    }
    catch (NullPointerException e)
    {
        System.out.println("Reference is null. Exception has been caught");
    }
    catch (ArithmeticException e)
    {
        System.out.println("Division by zero. Exception has been caught");
    }
    catch (Exception e)
    {
        System.out.println("Any other errors. Exception has been caught");
    }

    System.out.println("Program is still running");
}

//    public static void method1()
//    {
//        int a = 100;
//        int b = 0;
//        System.out.println(a / b);
//    }
}
