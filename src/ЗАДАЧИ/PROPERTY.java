package ЗАДАЧИ;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;



    /*
    Знакомство с properties
    */
    public class PROPERTY {
        public static Map<String, String> properties = new HashMap<>();


        public void fillInPropertiesMap() throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String name = bufferedReader.readLine();
            FileInputStream fileInputStream = new FileInputStream(name);
            load(fileInputStream);     fileInputStream.close();
            OutputStream OutputStream = new FileOutputStream(name);
            save(OutputStream);    OutputStream.close();


        }
        public void save(OutputStream outputStream) throws Exception {
            //  PrintWriter writer  = new PrintWriter(outputStream);
            Properties propert= new Properties();

            for (Map.Entry<String, String> pair : properties.entrySet()){
                propert.setProperty(pair.getKey(), pair.getValue());
            }
            propert.store(outputStream,"");

        }


        public void load(InputStream inputStream) throws Exception {
            Properties prop = new Properties();
            prop.load(inputStream);
            System.out.println(prop.getProperty("klush2"));
            System.out.println(prop.getProperty("klush2","default value"));
            //Вывести дефолтное значение
            Enumeration<String> e = (Enumeration<String>) prop.propertyNames();
            while (e.hasMoreElements())
            {
                String key = e.nextElement();
                properties.put(key, prop.getProperty(key));
            }
//          propert = new Properties();
//        propert.load(inputStream); // загружаю в объект props значения из потока,
// связанного с файлом
//        propKeys = propert.stringPropertyNames(); // получение всех ключей за
// объекта props
//        for (String s : propKeys){ // заполнение карты properties
//            properties.put(s, prop.getProperty(s));
//        }
        }

        public static void main(String[] args) throws Exception {
            properties.put("klush","http\\://ru.wikipedia.org\\/wiki\\/.properties");
            properties.put("klush2","http\\://ru.wikipedia.org\\/wiki\\/.properties");
            properties.put("klush1","http\\://ru.wikipedia.org\\/wiki\\/.properties");
            properties.put("klush3","http\\://ru.wikipedia.org\\/wiki\\/.properties");
            new PROPERTY().fillInPropertiesMap();
            for (Map.Entry<String, String> pair : properties.entrySet())
            {  System.out.println(pair.getKey()+" "+pair.getValue());

            }
        }
    }

