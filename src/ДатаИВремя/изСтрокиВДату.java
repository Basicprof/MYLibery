import java.text.SimpleDateFormat;
import java.util.Date;

public class изСтрокиВДату {
    public static void main(String[] args) {
        try {

            String sd = "Fri, 03 Oct 2008 05:52:30 GMT";
            //Tue Mar 20 11:48:49 EET 2018
            SimpleDateFormat format = new
                    SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
            Date date = format.parse(sd);
            System.out.println("Date : " + date);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
