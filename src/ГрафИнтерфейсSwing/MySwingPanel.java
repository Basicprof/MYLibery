import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class MySwingPanel extends JFrame {
   MySwingPanel(){
 super("Моя внутренняя панель");
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(500,300);
       JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      JButton jButton1 = new JButton("Первая кнопка");
      JButton jButton2 = new JButton("Вторая кнопка");
      JButton jButton3 = new JButton("Третья кнопка");
      panel.add(jButton1);
      panel.add(jButton2);
      panel.add(jButton3);
      panel.setSize(200,200);

       panel.setBorder(new CompoundBorder(new EmptyBorder(10,10,10,10),new LineBorder(Color.BLUE )));
      // Устанавливаем рамки вокруг панелей
     //=======================================================
      //panel.add(createPanel(new TitledBorder("Рамка с заголовком"), "TitledBorder"));
       //panel.add(createPanel(new EtchedBorder(), "EtchedBorder"));
       //panel.add(createPanel(new BevelBorder(BevelBorder.LOWERED), "BevelBorder"));
       //panel.add(createPanel(new SoftBevelBorder(BevelBorder.RAISED), "SoftBevelBorder"));
       //panel.add(createPanel(new LineBorder(Color.ORANGE, 4), "LineBorder"));
       //panel.add(createPanel(new MatteBorder(new ImageIcon("1.gif")), "MatteBorder"));
      //=====================================================
   panel.setAlignmentX(JComponent.RIGHT_ALIGNMENT);
   // После формирования объекта ПАРАМЕТРЫ РАСПОЛОЖЕНИЯ   можно изменить методами:
       //setHgapfint hgap) setVgap(int vgap) setAlignment(int align)

       add(panel,BorderLayout.AFTER_LINE_ENDS);

       //setContentPane(panel);  МЕТОД ЗАМЕНЯЕТ СОДЕРЖИМОЕ ОКНА

Box box = Box.createHorizontalBox();
JButton jButton5 = new JButton("Четвертая кнопка");
JButton jButton6 = new JButton("Пятая кнопка");
box.add(jButton5);
box.add(jButton6);
box.setSize(200,100);
box.setBorder(new CompoundBorder(new EmptyBorder(10,10,10,10),new LineBorder(Color.BLACK)));
       //box.add(createPanel(new EtchedBorder(), "EtchedBorder"));
       box.setAlignmentX(JComponent.CENTER_ALIGNMENT);
       add(box,BorderLayout.AFTER_LAST_LINE);
      // setContentPane(box); МЕТОД ЗАМЕНЯЕТ СОДЕРЖИМОЕ ОКНА

   }
   // Создадим метод для рамки
    private JPanel createPanel(Border border, String text) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JButton(text));
        panel.setBorder(new CompoundBorder(new EmptyBorder(12,12,12,12), border));
        return panel;
    }
}
