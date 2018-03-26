
import java.io.*;
import java.util.Properties;

public class PROPERTY {
    public static void main(String[] args) {
         Properties defoltProperties = new Properties();
     //Создать деволтное знаычение по умолчанию и передать в конструктор
         defoltProperties.setProperty("bla","me defolt");
     Properties property = new Properties(defoltProperties);
        //Вывести дефолтное значение
        System.out.println(property.getProperty("klush2","default value"));

        FileInputStream fis;
        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);

            String host = property.getProperty("db.host");
            String login = property.getProperty("db.login");
            String password = property.getProperty("db.password");

            System.out.println("HOST: " + host
                    + ", LOGIN: " + login
                    + ", PASSWORD: " + password);

        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }

    }
}

