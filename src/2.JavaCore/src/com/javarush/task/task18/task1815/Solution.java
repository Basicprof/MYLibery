package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface {
        ATableInterface atab;

        TableInterfaceWrapper (ATableInterface atab){
            this.atab =atab;
        }
        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            atab.setModel(rows);
        }

        @Override
        public String getHeaderText() {

           return  atab.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
          atab.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}