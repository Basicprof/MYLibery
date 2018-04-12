import java.util.StringTokenizer;

public class РазбитьСтрокуПробел {
    String ts = " привет мама я тебя люблю ";

    //Первый способ (trim нужен для обрезки только ведущих пробелов)
    String[] test =  " привет мама я тебя люблю ".trim().split("\\s+");

    //Второй способ (можно задать шаблон)
    StringTokenizer token = new StringTokenizer(ts);
}
