package Алгоритмы.СОРТИРОВКА;

import java.util.*;


public class СортMap {
    /*Сходу написать такой сортировщик не так просто. По крайней мере, я для себя выбрал в этом случае такую стратегию: раз написал, много раз используй. Поэтому такой сортировщик я написал через Generics т.к. в map может иметь и другие типы в качестве ключа и значения.

    Ниже я поделюсь двумя версиями сортировочного метода. Для Java version = 7 и для Java version = 8.

    Итак, если у Вас 7-я версия Java:*/

    public static <K, V extends Comparable<? super V>> Map<K, V>
    sortByValue(Map<K, V> map )
    {
        List<Map.Entry<K, V>> list =
                new LinkedList<>(map.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<K, V>>()
        {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2)
            {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list)
        {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
    /*Т.е., сначала, как писал @Nofate, вытаскиваем список entries
            (это у нас переменная list), затем сортируем эти entries
    по значениям и заливаем в новую мапу (это у нас result). Для
    результирующей мапы я использовал LinkedHashMap чтобы при добавлении
    элементы не пересортировывались.*/
    //==========================---------------0000000000000===============
    //А вот версия с использованием Stream'ов из Java 8:

}
