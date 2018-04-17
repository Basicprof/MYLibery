package Алгоритмы.СОРТИРОВКА;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ПодсчетСимволовMAP {
    public static void main(String[] args) throws IOException {
    if(args.length == 0){
        throw new IllegalArgumentException();
    }
    Map<Character, Integer> map = new TreeMap<>();
    FileInputStream fileInputStream = new FileInputStream(args[0]);
    byte [] b = new byte[fileInputStream.available()];
    fileInputStream.read(b);
    fileInputStream.close();
    char[] c = new char[0];
    c = new String(b).toCharArray(); // Присвоили массив символов из char
    for(char ch : c){
        if(map.containsKey(ch)){
            int val = map.get(ch) + 1;
            map.put(ch, val);
        } else {
            map.put(ch, 1);
        }
    }
    for(Map.Entry<Character, Integer> entry : map.entrySet()) {

        System.out.println(entry.getKey()  + "   " + entry.getValue());
    }
}
}