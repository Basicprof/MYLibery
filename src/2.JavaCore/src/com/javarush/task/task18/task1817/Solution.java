package com.javarush.task.task18.task1817;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
public class Solution {
    public static void main(String[] args) throws IOException {
        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        byte [] b = new byte[fileInputStream.available()];
        fileInputStream.read(b);
         fileInputStream.close();
        int space = 0;
        for (int i = 0; i < b.length; i++) {
            if(b[i]==32)space++;
                    }
     System.out.println(decimalFormat.format(space/(float)b.length *100));
       // System.out.println(new BigDecimal(space/(float)b.length *100).setScale(2,BigDecimal.ROUND_HALF_UP));

    }
   }
