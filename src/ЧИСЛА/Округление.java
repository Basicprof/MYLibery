package ЧИСЛА;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Округление {
    public static void main(String[] args) throws IOException {


        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        System.out.println(args[0]);
        byte[] b = new byte[fileInputStream.available()];
        fileInputStream.read(b);
        System.out.println(b);
        fileInputStream.close();
        int space = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 32) space++;
        }

        System.out.println(decimalFormat.format(b.length / space * 100));
        //System.out.println(String.format("%.2f", b.length/space*100));
        //float ratio = (float)spaces*100.0f/(float)symbols;
        //System.out.format("%.2f", ratio);
        //апомните этот пример, можете применять везде, где нужно просто
        // и без бубна использовать полученное число в дальнейших
        // математических вычислениях:
        double rounded = 10.25677;
        double value = Math.rint(rounded * 100)/100;
        //   Это пример нормального человеческого округления до сотых.
        // Но наш уважаемый валидатор не принимает правильного решения,
        // а хочет долбаную стринговскую запятую в качестве разделителя
        // вместо математической точки в double, из этого и следуют все
        // проблемы решений с BigDecimal и др. ;)
        System.out.println(new BigDecimal((float)b.length /space*100).setScale(2,BigDecimal.ROUND_HALF_UP));
    }
}