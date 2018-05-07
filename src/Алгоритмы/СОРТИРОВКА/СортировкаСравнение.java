package Алгоритмы.СОРТИРОВКА;

import java.text.ChoiceFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class СортировкаСравнение {

    /*public static void main(String[] args) {
        List<MessageFormat.Stock> stocks = getStocks();
        sort(stocks);
        Date actualDate = new Date();
        printStocks(stocks, actualDate);


    }

    public static void printStocks(List<MessageFormat.Stock> stocks, Date actualDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
// Здесь код форматирования строк и подстановка аргументов
        double[] filelimits = {0d, actualDate.getTime()};
        String[] filepart = {"closed {4}", "open {2} and last {3}"};

        ChoiceFormat fileform = new ChoiceFormat(filelimits, filepart);
        Format[] testFormats = {null, null, dateFormat, fileform};
        java.text.MessageFormat pattform = new java.text.MessageFormat("{0}   {1} | {5} {6}");
        pattform.setFormats(testFormats);

        for (MessageFormat.Stock stock : stocks) {
            String name = ((String) stock.get("name"));
            String symbol = (String) stock.get("symbol");
            double open = !stock.containsKey("open") ? 0 : ((double) stock.get("open"));
            double last = !stock.containsKey("last") ? 0 : ((double) stock.get("last"));
            double change = !stock.containsKey("change") ? 0 : ((double) stock.get("change"));
            Date date = (Date) stock.get("date");
            Object[] testArgs = {name, symbol, open, last, change, date, date.getTime()};
            System.out.println(pattform.format(testArgs));

        }
    }
    //Здесь сортировка по имени потом по дате без часов минут секунд а потом по прибыли
    public static void sort(List<MessageFormat.Stock> list) {
        Collections.sort(list, new Comparator<MessageFormat.Stock>() {
            public int compare(MessageFormat.Stock stock1, MessageFormat.Stock stock2) {
                String name1 =(String) stock1.get("name");
                String name2 =(String) stock2.get("name");
                int i =  name1.compareTo(name2);
                Date date1 = (Date) stock1.get("date");
                Date date2 = (Date) stock2.get("date");
                if(i==0){i=date2.compareTo(date1);}
                Double open1 = stock1.containsKey("open") ? (Double) stock1.get("last") - (Double) stock1.get("open") : (Double) stock1.get("change");
                Double open2 = stock2.containsKey("open") ? (Double) stock2.get("last") - (Double) stock2.get("open") : (Double) stock2.get("change");
                if(i==0)i=Double.compare(open2,open1);
                return i;


            }
        });
    }

    public static class Stock extends HashMap {
        public Stock(String name, String symbol, double open, double last) {
            put("name", name);
            put("symbol", symbol);
            put("open", open);
            put("last", last);
            put("date", getRandomDate(2020));
        }

        public Stock(String name, String symbol, double change, Date date) {
            put("name", name);
            put("symbol", symbol);
            put("date", date);
            put("change", change);
        }
    }

    public static List<MessageFormat.Stock> getStocks() {
        List<MessageFormat.Stock> stocks = new ArrayList();

        stocks.add(new MessageFormat.Stock("Fake Apple Inc.", "AAPL", 125.64, 123.43));
        stocks.add(new MessageFormat.Stock("Fake Cisco Systems, Inc.", "CSCO", 25.84, 26.3));
        stocks.add(new MessageFormat.Stock("Fake Google Inc.", "GOOG", 516.2, 512.6));
        stocks.add(new MessageFormat.Stock("Fake Intel Corporation", "INTC", 21.36, 21.53));
        stocks.add(new MessageFormat.Stock("Fake Level 3 Communications, Inc.", "LVLT", 5.55, 5.54));
        stocks.add(new MessageFormat.Stock("Fake Microsoft Corporation", "MSFT", 29.56, 29.72));

        stocks.add(new MessageFormat.Stock("Fake Nokia Corporation (ADR)", "NOK", .1, getRandomDate()));
        stocks.add(new MessageFormat.Stock("Fake Oracle Corporation", "ORCL", .15, getRandomDate()));
        stocks.add(new MessageFormat.Stock("Fake Starbucks Corporation", "SBUX", .03, getRandomDate()));
        stocks.add(new MessageFormat.Stock("Fake Yahoo! Inc.", "YHOO", .32, getRandomDate()));
        stocks.add(new MessageFormat.Stock("Fake Applied Materials, Inc.", "AMAT", .26, getRandomDate()));
        stocks.add(new MessageFormat.Stock("Fake Comcast Corporation", "CMCSA", .5, getRandomDate()));
        stocks.add(new MessageFormat.Stock("Fake Sirius Satellite", "SIRI", -.03, getRandomDate()));

        return stocks;
    }

    public static Date getRandomDate() {
        return getRandomDate(1970);
    }

    public static Date getRandomDate(int startYear) {
        int year = startYear + (int) (Math.random() * 30);
        int month = (int) (Math.random() * 12);
        int day = (int) (Math.random() * 28);
        GregorianCalendar calendar = new GregorianCalendar(year, month, day);

        return calendar.getTime();
    }*/
}



