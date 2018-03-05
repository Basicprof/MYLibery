package ДатаИВремя;

import sun.util.calendar.LocalGregorianCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTime {
    public static void main(String[] args) {
    Date data = new Date(0);
        System.out.println(data);
        Calendar calendar = Calendar.getInstance();//приватный конструктор
        calendar.setTime(data);//Для работы с датой
       // System.out.println(calendar);
        // Добавить неделю месяц год
        calendar.add(Calendar.WEEK_OF_MONTH,1);
        //System.out.println(calendar.getTime());// Вывели дату
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        //System.out.println(dateFormat.format(calendar.getTime()));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MMM-dd", Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MMMMM-dd", Locale.ENGLISH);
        System.out.println(simpleDateFormat.format(data));
        System.out.println(simpleDateFormat1.format(data));
        System.out.println(simpleDateFormat2.format(data));
    }
    //boolean after(Date date)
//    Возвращает значение true, если вызывающий объект date содержит дату, которая раньше заданной даты, в противном случае он возвращает значение false.
      //      2	boolean before(Date date)
  //  Возвращает значение true, если вызывающий объект date содержит дату, более раннюю, чем заданная дата, в противном случае он возвращает значение false.
        //    3	Object clone()
   // Дублирование вызывающего объекта date.
    //        4	int compareTo(Date date)
   // Сравнивает значение вызывающего объекта с этой датой. Возвращает 0, если значения равны. Возвращает отрицательное значение, если объект вызова является более ранним, чем дата. Возвращает положительное значение, если объект вызова позже даты.
//5	int compareTo(Object obj)
    //Работает точно так же compareTo(Date), если объект вызова имеет класс Date. В противном случае вызывает ClassCastException.
//6	boolean equals(Object date)
   // Возвращает значение true, если вызывающий объект date содержит то же время и дату, которая указана в date, в противном случае он возвращает значение false.
  //          7	long getTime()
 //   Возвращает количество миллисекунд, истекших с 1 января 1970 года.
//8	int hashCode()
  //  Возвращает хэш-код для вызывающего объекта.
  //          9	void setTime(long time)
  //  Задает дату и время, соответствующие моменту времени, что представляет собой общее затраченное время в миллисекундах от полуночи 1 января 1970 года.
   // 10 String toString();
  //  Преобразует вызывающий объект date в строку и возвращает результат.
}
