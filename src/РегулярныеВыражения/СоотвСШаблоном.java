package РегулярныеВыражения;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class СоотвСШаблоном {  private static final String REGEX = "Pro";
    private static final String INPUT = "ProgLang";
    private static Pattern pattern;
    private static Matcher matcher;


//    }Методы matches и lookingAt
//    Оба метода matches и lookingAt направлены на попытку поиска соответствия вводимой
// последовательности с шаблоном. Разница, однако, заключается в том, что для метода matches
// требуется вся вводимая последовательность, в то время как lookingAt этого не требует.
//
//    Оба метода всегда начинаются в начале вводимой строки. Далее представлен пример, рассматривающий
// их функциональность.
  public static void main( String args[] ) {
            pattern = Pattern.compile(REGEX);
            matcher = pattern.matcher(INPUT);

            System.out.println("Текущее регулярное выражение: " + REGEX);
            System.out.println("Текущие входные данные: " + INPUT);

            System.out.println("lookingAt(): " + matcher.lookingAt());
            System.out.println("matches(): " + matcher.matches());
        }
    }
}
