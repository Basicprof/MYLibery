package ОБРАБОТКАнЕОБРАБАТЫВАЕМЫХ;
import java.awt.*;
import java.io.*;
import javax.swing.*;
//Вы можете создать свое поведение создав реализацию метода uncaughtException,
//        либо как реализацию интерфейса, либо переопределив метод класса ThreadGroup.
//        Для примера, мы создадим реализацию UncaughtExceptionHandler, которая
//        отображает окно с содержимым стека, в текстовом поле при возникновении
//        ошибки времени исполнения. Вы можете закрывать окно в
//        промежутках возникновения ошибок. Окно вновь появится при следующем
//        возникновении ошибки.
public class StackWindow extends JFrame
        implements Thread.UncaughtExceptionHandler {

    private JTextArea textArea;

    public StackWindow(
            String title, final int width, final int height) {
        super(title);
        setSize(width, height);
        textArea = new JTextArea();
        JScrollPane pane = new JScrollPane(textArea);
        textArea.setEditable(false);
        getContentPane().add(pane);
    }

    public void uncaughtException(Thread t, Throwable e) {
       // Переопределили обраббоку исключений необрабатываемых вывод не в консоль
         //       а в   окошке
        addStackInfo(e);
    }

    public void addStackInfo(final Throwable t) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
                toFront();
                StringWriter sw = new StringWriter();
                PrintWriter out = new PrintWriter(sw);
                t.printStackTrace(out);
                textArea.append(sw.toString());
            }
        });
    }
}