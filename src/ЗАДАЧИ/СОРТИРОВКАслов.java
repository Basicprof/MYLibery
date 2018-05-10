package ЗАДАЧИ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class СОРТИРОВКАслов {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readFile = new BufferedReader(new FileReader(reader.readLine()));
        String[] file;
        StringBuffer buff = new StringBuffer();
        String s = "";
        while ((s = readFile.readLine()) != null) {
            buff.append(s + " ");
        }
        file = buff.toString().split(" ");
        StringBuilder result = getLine(file);
        System.out.println(result);
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder sb = new StringBuilder();
        ArrayList<StringBuilder> list = new ArrayList<>();
        if (words.length == 0 || words == null) return sb;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) list.add(new StringBuilder(words[i]));
        }

        list = getRecursLine(list, words);
//for (Object o: list){
//    System.out.println((StringBuilder) o);
//}
        StringBuilder result = null;
        int b = Byte.MIN_VALUE;
        for (StringBuilder s : list) {
            if (s.length() > b) {
                b = s.length();
                result = (StringBuilder) s;
            }
        }

        for (int i = 0; i < words.length; i++) {
            if (!result.toString().contains(words[i])) {
                result.append(" " + words[i]);
            }
        }


        return result;
    }

    public static ArrayList getRecursLine(ArrayList list, String[] world) {

        boolean startStop = false;
        for (int i = 0; i < list.size(); i++) {
            String stringWorld = list.get(i).toString();

            for (int j = 0; j < world.length; j++) {
                String strWorld = stringWorld + " " + world[j];
                if (!world[j].isEmpty() && stringWorld.toLowerCase().charAt(stringWorld.length() - 1) == world[j].toLowerCase().charAt(0) && !stringWorld.contains(world[j])) {
                    startStop = true;
                    list.set(i, new StringBuilder(strWorld));
                }
            }
        }
        //Убираем дубликаты
        Set<StringBuilder> hs = new HashSet<>();
        hs.addAll(list);//кОПИРУЕМ ЛИСТ В СЕТ ГДЕ УБИРАЮТСЯ ДУБЛИКАТЫ
        list.clear(); //ОЧИЩАЕМ ЛИСТ
        list.addAll(hs); //И ВОЗВРАЩАЕМ ДАННЫЕ В ЛИСТ

        if (startStop) getRecursLine(list, world);

        return list;
    }

    public static boolean getContecst(StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        String[] strings = stringBuilder.toString().split(" ");
        boolean EcvilsContinio = false;
        for (int i = 0; i < strings.length; i++) {

            if (stringBuilder2.toString().contains(strings[i])) EcvilsContinio = true;

        }
        return EcvilsContinio;
    }
}
