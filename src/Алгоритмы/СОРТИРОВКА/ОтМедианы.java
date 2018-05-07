package Алгоритмы.СОРТИРОВКА;

import java.util.Arrays;



    /*
    Почитать в инете про медиану выборки
    */
    public class ОтМедианы {


        public static void main(String[] args) {
//        Integer [] ifsa={13, 8, 15, 5, 17,9,10,8};
//
//        Integer [] asd= sort(ifsa);
//        for (int i = 0; i <asd.length ; i++) {
//            System.out.print(asd[i]+" ");
//        }
        }


        public static Integer[] sort(Integer[] array) {
            int mediana =0;
            Arrays.sort( array);
            if(array.length%2==0){
                mediana = (array[array.length/2-1]+array[array.length/2])/2;}
            else mediana = array[array.length/2];
            System.out.println(mediana);
            Integer[] sortCopy = new Integer[array.length];
            int vrDlin =-1; boolean stop =false;
            for (int i = 0; i < array.length; i++) {
                int ari = num(array,mediana);
                if (array[ari] < mediana) {
                    if(mediana-array[ari]==vrDlin)
                        stop =true;
                }else  if(array[ari]-mediana==vrDlin)stop =true;
                if (i > 0 && array[ari] < sortCopy[i - 1]&&stop) {
                    sortCopy[i] = sortCopy[i - 1];
                    sortCopy[i - 1] = array[ari];

                } else sortCopy[i] = array[ari];
                if(array[ari]<mediana){
                    vrDlin = mediana-array[ari];
                }else vrDlin = mediana-array[ari];
                array[ari] = -1;
                stop =false;
            }


            return sortCopy;
        }

        public static Integer num(Integer[] in, int mediana) {
            int minInt = 0; int med = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < in.length; i++) {
                if (in[i] != -1) {
                    if (in[i] < mediana && mediana - in[i] < min) {
                        min = mediana - in[i];
                        minInt = i;
                    } else if (in[i] - mediana < min) {
                        min = in[i] - mediana;
                        minInt = i;
                    }
                    if(in[i]==mediana) med = i;
                }
            }  if(minInt ==0 )minInt = med;
            return minInt;
        }
    }
