import java.util.StringTokenizer;

public class РазбиениеСтроки {
    public static void main(String[] args) {
        String   string = "JavaRush - лучший сервис обучения Java.";
        StringTokenizer tokenizer =   new StringTokenizer(string," ");

        while (tokenizer.hasMoreTokens()) {
            

            String s = tokenizer.nextToken();
            System.out.println(s);
        }
    }
}
