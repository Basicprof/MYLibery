package СИНГЛТОН;

public class СинглТон {
    private static   volatile  СинглТон instance;// Обязательно  volatile  Атомарное чтение
    //один поток прекращает работу, потому что другой поток может изменить переменную
    private СинглТон (){}; // Приватный метот не позволяет создавть объкт
    public static СинглТон getInstance(){ // метод создает один объект при первов обращении к нему
        if(instance == null)instance = new СинглТон();
        return instance;};
}
