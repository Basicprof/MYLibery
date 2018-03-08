package РегулярныеВыражения;
//Методы appendReplacement и appendTail
//        Класс Matcher также предоставляет методы замены текста appendReplacement и appendTail.
//
//        Далее представлен пример, поясняющий их функциональность.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ЗаменаТекста2 {

    private static String REGEX = "а*д";
    private static String INPUT = "аадProgLangааадProgLangадProgLangд";
    private static String REPLACE = "-";
    public static void main(String[] args) {



            Pattern p = Pattern.compile(REGEX);

            // получение matcher объекта
            Matcher m = p.matcher(INPUT);
            StringBuffer sb = new StringBuffer();
            while(m.find()) {
                m.appendReplacement(sb, REPLACE);
            }
            m.appendTail(sb);
            System.out.println(sb.toString());
        }
    }

