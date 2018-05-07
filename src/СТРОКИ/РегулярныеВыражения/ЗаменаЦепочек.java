package РегулярныеВыражения;



//    Замена цепочек в тексте
//    У класса Matcher для замены текста есть метод replaceAll. Но что если нам надо совершить более гибкую замену. Для этих целей пригодятся методы appendReplacement и appendTail. Кстати, как раз о вызове метода appendTail программисты иногда забывают. Поиск цепочек как и ранее осуществляем методом Matcher.find().

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ЗаменаЦепочек {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

        Pattern regexp = Pattern.compile("<[a-z]+>");
        Matcher m = regexp.matcher("<a><b-><1><c><d/>");
        while (m.find())
            m.appendReplacement(buffer, "text");
        m.appendTail(buffer);

        System.out.println(buffer);
    }
}
//    В API для обратной совместимости до сих пор используется StringBuffer.
//
//





