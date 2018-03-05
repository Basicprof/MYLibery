package СТРОКИ;

public class StringBuilderTexr {
    public static void main(String[] args) {
        //StringBuilder
        //Класс StringBuilder идентичен классу StringBuffer
        // и обладает большей производительностью. Однако он не синхронизирован,
        // поэтому его не нужно использовать в тех случаях,
        // когда к изменяемой строке обращаются несколько потоков.

        //Создадим новый объект.


                StringBuilder builder = new StringBuilder();

        builder.append("kj"); // можно добавить один символ
        builder.append("ljhgljhgljhg"); // а можно добавить готовую строку
        String completedString = builder.toString(); // результирующая строка
//Соединять строки можно цепочкой.
        new StringBuilder().append("kjh").append(45).append(876.987).toString();

    }
}
