package com.javarush.task.task19.task1903;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
static {
            countries.put("UA" ,"Ukraine");
            countries.put("RU","Russia");
            countries.put( "CA" ,"Canada");
}
 public static void main(String[] args) {

         IncomeData data = new IncomeData() {
            public String getCountryCode() { return "UA"; }

           public String getCompany() { return "JavaRush Ltd."; }

            public String getContactFirstName() { return "Ivan"; }

           public String getContactLastName() { return "Ivanov"; }

            public int getCountryPhoneCode() { return 38; }

            public int getPhoneNumber() { return 5017; }
        };

       IncomeDataAdapter a = new IncomeDataAdapter(data);

        System.out.println(a.getCompanyName());
        System.out.println(a.getCountryName());
        System.out.println(a.getName());
        System.out.println(a.getPhoneNumber());

 }
 public static class IncomeDataAdapter implements Contact, Customer{
        private IncomeData data;
       IncomeDataAdapter (IncomeData incomeData){
        this.data=incomeData;
       }
 @Override
        public String getCompanyName() {
           data.getCompany();
            return null;
        }
        @Override
        public String getCountryName() {
            return countries.get(this.data.getCountryCode());
        }
        @Override
        public String getName() {
            return data.getContactLastName()+", "+data.getContactFirstName();
        }
        @Override
        public String getPhoneNumber() {
           StringBuffer stringBuffer = new StringBuffer("");
          stringBuffer.append(this.data.getPhoneNumber());
              String nulls ="";
           while (stringBuffer.length()<10){nulls+="0";stringBuffer.append("0"); }
            nulls+=this.data.getPhoneNumber();

           stringBuffer.setLength(0);

           stringBuffer.append("+").append(this.data.getCountryPhoneCode())
                   .append("(").append(nulls.substring(0, 3)).append(")")
                   .append(nulls.substring(3,6)).append("-")
                   .append(nulls.substring(6, 8)).append("-")
                   .append(nulls.substring(8, 10));

           return stringBuffer.toString();
        }
    }
 public static interface IncomeData {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        int getCountryPhoneCode();      //example 38
        int getPhoneNumber();           //example 501234567
    }
        public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }
        public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}