import java.util.HashSet;

public class ListView {
    public static void main(String[] args) {
//        Преобразовать в массив и вывести в ListView
//        Следующий пример - задел на будущее. Когда вы узнаете, что такое ListView, то вернитесь к этому уроку и узнайте, как сконвертировать множество в массив и вывести результат в компонент ListView (Список):

       // Итак, создадим множество стран.


        public void onClick(View view) {
            HashSet<String> countryHashSet = new HashSet<>();
            countryHashSet.add("Россия");
            countryHashSet.add("Франция");
            countryHashSet.add("Гондурас");
            countryHashSet.add("Кот-Д'Ивуар"); // любимая страна всех котов

            // Получим размер HashSet
            mInfoTextView.setText("Размер HashSet = " + countryHashSet.size());
        }
        public void onClick(View view) {

            ArrayAdapter<String> adapter;

            HashSet<String> countryHashSet = new HashSet<>();
            countryHashSet.add("Россия");
            countryHashSet.add("Кот-Д'Ивуар"); // любимая страна всех котов
            countryHashSet.add("Франция");
            countryHashSet.add("Гондурас");

            // Конвертируем HashSet в массив
            String[] myArray = {};
            myArray = countryHashSet.toArray(new String[countryHashSet.size()]);

            // Выводим массив в ListView
            final ListView listView = (ListView) findViewById(R.id.listView);
            adapter = new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1, myArray);
            listView.setAdapter(adapter);
        }
      //  Продолжим опыты. Поработаем теперь с числами.


        public void onClick(View view) {

            Random random = new Random(30);
            Set<Integer> numberSet = new HashSet<>();

            for(int i = 0; i < 1000; i++)
                numberSet.add(random.nextInt(10));
            mInfoTextView.setText(numberSet.toString());
        }
     //   Здесь мы ещё раз убеждаемся, что повторное добавление числа не происходит. В цикле случайным образом выбирается число от 0 до 9 тысячу раз. Естественно, многие числа должны были повториться при таком сценарии, но во множество каждое число попадёт один раз.

      //          При этом данные не сортируются, так как расположены как попало.

       // Специально для Android был разработан новый класс ArraySet, который более эффективен.


        ArraySet<K,V> = HashSet<K,V>
    }
