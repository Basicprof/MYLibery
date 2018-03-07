package РегулярныеВыражения;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ЗаменаТекста {

    private static String REGEX = "Собака";
    private static String INPUT = "Собака говорит мяу.";
    private static String REPLACE = "Кот";

//    Методы replaceFirst и replaceAll
//    Методы replaceFirst и replaceAll производят замену текста, который совпадает с заданным регулярным выражением. Исходя из их названия, replaceFirst производит замену первого совпадения, а replaceAll производит замену остальных совпадений.
//
//    Далее представлен пример, поясняющий их функциональность.



        public static void main(String[] args) {
            Pattern p = Pattern.compile(REGEX);

            // получение matcher объекта
            Matcher m = p.matcher(INPUT);
            INPUT = m.replaceAll(REPLACE);
            System.out.println(INPUT);
        }
    }
}
