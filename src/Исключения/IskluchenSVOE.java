package Исключения;

public class IskluchenSVOE {
}
//    public void onClick(View view) {
//        if (cat == null) {
//            try {
//                throw new NullPointerException("Кота не существует");
//            } catch (NullPointerException e) {
//                Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
//            }
//        }
//    }
    /*Мы создали новый объект класса NullPointerException. Многие классы исключений кроме стандартного конструктора по умолчанию с пустыми скобками имеют второй конструктор с строковым параметром, в котором можно разместить подходящую информацию об исключении. Получить текст из него можно через метод getMessage(), что мы и сделали в блоке catch.

Теперь программа не закроется аварийно, а будет просто выводить сообщения в всплывающих Toast.*/
    /*Создание собственных классов исключений

Система не может предусмотреть все исключения, иногда вам придётся создать собственный тип исключения для вашего приложения. Вам нужно наследоваться от Exception (напомню, что этот класс наследуется от Trowable) и переопределить нужные методы класса Throwable. Либо вы можете унаследоваться от уже существующего типа, который наиболее близок по логике с вашим исключением.

final void addSuppressed(Throwable exception) - добавляет исключение в список подавляемых исключений (JDK 7)
Throwable fillInStackTrace() - возвращает объект класса Throwable, содержащий полную трассировку стека.
Throwable getCause() - возвращает исключение, лежащее под текущим исключение или null
String getLocalizedMessage() - возвращает локализованное описание исключения
String getMessage() - возвращает описание исключения
StackTraceElement[] getStackTrace() - возвращает массив, содержащий трассировку стека и состояний из элементов класса StackTraceElement
final Throwable[] getSuppressed() - получает подавленные исключения (JDK 7)
Throwable initCause(Throwable exception) - ассоциирует исключение с вызывающим исключением. Возвращает ссылку на исключение.
void printStackTrace() - отображает трассировку стека
void printStackTrace(PrintStream stream) - посылает трассировку стека в заданный поток
void printStackTrace(PrintWriter stream) - посылает трассировку стека в заданный поток
void setStackTrace(StackTraceElement elements[]) - устанавливает трассировку стека для элементов (для специализированных приложений)
String toString() - возвращает объект класса String, содержащий описание исключения.
Самый простой способ - создать класс с конструктором по умолчанию.*/
// Если этот код работает, его написал Александр Климов,
// а если нет, то не знаю, кто его писал.

//package ru.alexanderklimov.exception;
//
//        import android.os.Bundle;
//        import android.support.v7.app.AppCompatActivity;
//        import android.view.View;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

//    public void testMethod() throws HungryCatException{
//        System.out.println("Возбуждаем HungryCatException из метода testMethod()");
//        throw new HungryCatException(); // конструктор по умолчанию
//    }
//
//    public void onClick(View view) {
//        try {
//            testMethod();
//        } catch (HungryCatException e) {
//            e.printStackTrace();
//            System.out.println("Наше исключение перехвачено");
//        }
//    }
//
//    class HungryCatException extends Exception{
//    }
//}
 /*Мы создали собственный класс HungryCatException, в методе testMethod() его возбуждаем, а по нажатию кнопки вызываем этот метод. В результате наше исключение сработает.

Создать класс исключения с конструктором, который получает аргумент-строку, также просто.

*/// Если этот код работает, его написал Александр Климов,
// а если нет, то не знаю, кто его писал.
//
//package ru.alexanderklimov.exception;
//
//        import android.os.Bundle;
//        import android.support.v7.app.AppCompatActivity;
//        import android.view.View;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//
//    public void testMethod() throws HungryCatException {
//        System.out.println("Возбуждаем HungryCatException из метода testMethod()");
//        throw new HungryCatException(); // конструктор по умолчанию
//    }
//
//    public void testMethod2() throws HungryCatException {
//        System.out.println("Возбуждаем HungryCatException из метода testMethod2()");
//        throw new HungryCatException("Создано во втором методе");
//    }
//
//    public void onClick(View view) {
//        try {
//            testMethod();
//        } catch (HungryCatException e) {
//            e.printStackTrace();
//            System.out.println("Наше исключение перехвачено");
//        }
//
//        try {
//            testMethod2();
//        } catch (HungryCatException e) {
//            e.printStackTrace();
//        }
//    }
//
//    class HungryCatException extends Exception {
//        HungryCatException() {
//        }
//
//        HungryCatException(String msg) {
//            super(msg);
//        }
//    }
//}/*Перехват произвольных исключений
//
//Можно создать универсальный обработчик, перехватывающий любые типы исключения. Осуществляется это перехватом базового класса всех исключений Exception:
//*/
//cacth(Exception e) {
//    Log.w("Log", "Перехвачено исключение");
//}/*
//Подобная конструкция не упустит ни одного исключения, поэтому её следует размещать в самом конце списка обработчиков, во избежание блокировки следующих за ней обработчиков исключений.
//
//Основные правила обработки исключений
//
//Используйте исключения для того, чтобы:
//
//обработать ошибку на текущем уровне (избегайте перехватывать исключения, если не знаете, как с ними поступить)
//исправить проблему и снова вызвать метод, возбудивший исключение
//предпринять все необходимые действия и продолжить выполнение без повторного вызова действия
//попытаться найти альтернативный результат вместо того, который должен был бы произвести вызванный метод
//сделать все возможное в текущем контексте и заново возбудить это же исключение, перенаправив его на более высокий уровень
//сделать все, что можно в текущем контексте, и возбудить новое исключение, перенаправив его на более высокий уровень
//завершить работу программы
//упростить программу (если используемая схема обработки исключений делает все только сложнее, значит, она никуда не годится)
//добавить вашей библиотеке и программе безопасности*/