package com.javarush.task.task20.task2011;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
Externalizable для апартаментов
*/
public class Solution {

    public static class Apartment implements Externalizable{

        private String address;
        private int year;
        public void writeExternal  ( ObjectOutput o) throws IOException {
            o.writeObject(address);
            o.writeInt(year);
        }
        public void readExternal  ( ObjectInput o) throws IOException, ClassNotFoundException {
            this.address = (String) o.readObject();
            this.year = (int ) o.readInt();
        }
        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() { super(); }

        public Apartment(String adr, int y) {
            address = adr;
            year = y;
        }



        /**
         * Prints out the fields. used for testing!
         */
        public String toString() {
            return("Address: " + address + "\n" + "Year: " + year);
        }
    }

    public static void main(String[] args) {

    }
}
