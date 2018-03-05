package РегулярныеВыражения;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Символы {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]{1}");
        Matcher m = p.matcher("A mutable sequence of characters.");
        int numberOfChar = 0;
       while (m.find()) {

            numberOfChar++;
        }
        System.out.println(numberOfChar);
    }
}
