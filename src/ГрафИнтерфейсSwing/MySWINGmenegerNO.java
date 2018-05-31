import javax.swing.*;
public class MySWINGmenegerNO extends JFrame{
    MySWINGmenegerNO() {
        super("Пробное окно Без менеджера размещения");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JButton button = new JButton("Кнопка");
      button.setSize(80, 30);
        pack();
        button.setLocation(20, 20);
        panel.add(button);
        button = new JButton("Кнопка с длинной надписью");
       button.setSize(120, 40);
        pack();
        button.setLocation(70, 50);
        panel.add(button);
        setContentPane(panel);
        setSize(250, 150);
        pack();
     }
//    Всеми тремя размерами можно управлять с помощью соответствующим методов set:
//
//    setMinimumSize(Dimension size),
//
//    setPreferredSize(Dimension size),
//
//    setMaximumSize(Dimension size).
//
//    Чаще всего используется простой прием, когда элементу «не рекомендуется» увеличиваться или уменьшаться относительно своих предпочтительных размеров. Это легко сделать командой:
//
//            element.setMinimumSize(element.getPreferredSize());
}
