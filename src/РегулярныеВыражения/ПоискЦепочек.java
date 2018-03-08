package РегулярныеВыражения;

//Поиск цепочек в тексте
//    Поиск текста можно осуществить с помощью метода Matcher.find(). Например, находим
// открывающие html теги в тексте:

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ПоискЦепочек {
        public static void main(String[] args) {
            Pattern regexp = Pattern.compile("<[a-z]+>");
            Matcher m = regexp.matcher("<a><b-><1><c><d/>");
            while (m.find()) {
                System.out.println(m.group());
            }
        }
    }
//    Метод find устанавливает курсор на следующую цепочку, а получить саму цепочку можно
// с помощью метода Matcher.group().
//
//    В ближайшее время расширю статью несколькими более сложными примерами с группами.

