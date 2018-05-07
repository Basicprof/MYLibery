package РегулярныеВыражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Методы start и end
//        Далее представлен пример, в котором производится подсчет количества раз, когда в строке
//        ввода встречается слово "кот".
public class КолРазВСтроке {

    private static final String REGEX = "\bкот\b";
    private static final String INPUT = "кот кот кот котёл кот";

    public static void main( String args[] ) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);   // получение matcher объекта
        int count = 0;

        while(m.find()) {
                count++;
                System.out.println("Номер вхождения: "+count);
                System.out.println("Начальная позиция вхождения: "+m.start());
                System.out.println("Конечная позиция вхождения: "+m.end());
        }
    }
}

