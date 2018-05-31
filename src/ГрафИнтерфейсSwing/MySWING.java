import javax.swing.*;
import java.awt.*;

public class MySWING extends JFrame {// Клас отвечающий за настойки окна

    MySWING() {
   super("Окно программы");
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
//   JButton jButton = new JButton("Кнопка на весь экран");
//   getContentPane().add(jButton);

        //\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

//================================================================
   //. Менеджер размещения в строку
           JPanel jPanel = new JPanel();// Создаем панель
   jPanel.setLayout(new FlowLayout());//Создаем Самый простой менеджер размещения — FlowLayout. Он размещает добавляемые на панель компоненты строго по очереди, строка за строкой
        //почему так мы не будем обращатся к нему в этой программе

//  jPanel.add(new JButton("+"));
//  jPanel.add(new JButton("-"));
//  jPanel.add(new JButton("Кнопка "));
//  jPanel.add(new JButton("Сложная кнопка"));
 // setContentPane(jPanel);// Метод позволяет заменить содержимое окна


//================================================================
//========================================================
// Менеджер размещения BorderLayout  по умолчанию
//        getContentPane().add(new JButton("Кнопка"), BorderLayout.NORTH);
 //       getContentPane().add(new JButton("+"), BorderLayout.EAST);
   //     getContentPane().add(new JButton("-"), BorderLayout.WEST);
     //   getContentPane().add(new JButton("Кнопка с длинной надписью"), BorderLayout.SOUTH);
       // getContentPane().add(new JButton("В ЦЕНТР!"));
//=================================================================
   //            Менеджер табличного размещения GridLayout

//        jPanel.setLayout(new GridLayout(2,3,5,10));
//
//        jPanel.add(new JButton("Кнопка"));
//        jPanel.add(new JButton("+"));
//        jPanel.add(new JButton("-"));
//        jPanel.add(new JButton("Кнопка с длинной надписью"));
//        jPanel.add(new JButton("еще кнопка"));
//        setContentPane(jPanel);
//=\==================================================================
//Менеджер блочного размещения BoxLayout и класс Box
   //     Создаем  панель не конструктором, а одним из двух статических методов, определенных в классе Box: //createHorizontalBox() и createVerticalBox().
        Box box = Box.createVerticalBox(); //
        JButton jButton1 = new JButton("Кнопка");
        jButton1.setAlignmentX(JComponent.RIGHT_ALIGNMENT);
        box.add(jButton1);
// Добавляем  невидимую «распорку», единственная задача которой — раздвигать соседние элементы, обеспечивая между //ними заданное расстояние. Горизонтальная распорка создается статическим методом createHorizontalStrut(int width), а //вертикальная — методом createVerticalStrut(int height).
        box.add(Box.createVerticalStrut(10));
       JButton jButton = new JButton("+");
       jButton.setAlignmentX(JComponent.RIGHT_ALIGNMENT);
       box.add(jButton);
  //Lобавляем еще один специальный элемент — своеобразную «пружину».
        box.add(Box.createVerticalGlue());

//        ВЫРАВНИВАНИЕ   методы setAlignmentX(float alignment) — выравнивание по горизонтали и setAlignmentY(float alignment) — выравнивание по вертикали. В качестве параметра проще всего использовать константы, определенные в классе JComponent. Для выравнивания по горизонтали служат константы LEFT_ALIGNMENT (по левому краю), RIGHT_ALIGNMENT (по правому краю) и CENTER_ALIGNMENT (по центру). Для выравнивания по вертикали — BOTTOM_ALIGNMENT (по нижнему краю), TOP_ALIGNMENT (по верхнему краю) и CENTER_ALIGNMENT (по центру).

//        Для этого заменим строку:
//
//        box.add(new JButton("-"));
//        На три других:

        JButton jButton2 = new JButton("-");
        jButton2.setAlignmentX(JComponent.RIGHT_ALIGNMENT);
        box.add(jButton2);
        // Горизонтальная и вертикальная пружины создаются соответственно методами createHorizontalGlue() и //createVerticalGlue().
        box.add(Box.createVerticalStrut(10));
        JButton jButton3 = new JButton("Кнопка с длинной надписью");
                jButton3.setAlignmentX(JComponent.RIGHT_ALIGNMENT);
         box.add(jButton3);
        setContentPane(box);    //===================================================
    }


    }
