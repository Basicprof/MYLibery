package Массивы;

import java.util.ArrayList;
import java.util.List;

public class ИзАrrayListВМассив {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Юра");
        list.add("Маша");
        String [] strings = new String[list.size()];
        strings = list.toArray(strings);
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);
        }

    }
}
