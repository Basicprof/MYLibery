package РегулярныеВыражения;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class НайтиПодстроку {
        //matches() возвращает только true, если полная строка соответствует.
        // find() попытается найти следующее событие в подстроке, которое соответствует регулярному
        // выражению. Обратите внимание на акцент на "следующий". Это означает, что результат вызова
        // find() несколько раз может быть не таким. Кроме того, используя find(), вы можете вызвать
        // start(), чтобы вернуть позицию, подстроенную подстрокой.

        public static void main(String[] args) {


            final Matcher subMatcher = Pattern.compile("\\d+").matcher("skrf35kesruytfkwu4ty7sdfs");
            System.out.println("Found: " + subMatcher.matches());
            System.out.println("Found: " + subMatcher.find() + " - position " + subMatcher.start());
            System.out.println("Found: " + subMatcher.find() + " - position " + subMatcher.start());
            System.out.println("Found: " + subMatcher.find() + " - position " + subMatcher.start());
            System.out.println("Found: " + subMatcher.find());
            System.out.println("Found: " + subMatcher.find());
            System.out.println("Matched: " + subMatcher.matches());

            System.out.println("-----------");
            final Matcher fullMatcher = Pattern.compile("^\\w+$").matcher("skrf35kesruytfkwu4ty7sdfs");
            System.out.println("Found: " + fullMatcher.find() + " - position " + fullMatcher.start());
            System.out.println("Found: " + fullMatcher.find());
            System.out.println("Found: " + fullMatcher.find());
            System.out.println("Matched: " + fullMatcher.matches());
            System.out.println("Matched: " + fullMatcher.matches());
            System.out.println("Matched: " + fullMatcher.matches());
            System.out.println("Matched: " + fullMatcher.matches());
        }
    }

