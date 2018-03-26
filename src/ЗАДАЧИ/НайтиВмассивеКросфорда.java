package ЗАДАЧИ;

import java.util.*;

import static java.util.Arrays.asList;


    /*
    Кроссворд
    */

public class НайтиВмассивеКросфорда {
   /*
    Кроссворд
    */

        static List <String> flagL = new ArrayList<>();
        static  List <Word> words = new ArrayList<>();

        static {


            flagL =  asList("Top", "Bottom", "Left", "Right", "45RightTop",
                    "45LeftTop", "45RightBottom", "45LeftBottom");

        }

        public static void main(String[] args) {
            int[][] crossword = new int[][]{
                    {'f', 'd', 'e', 'r', 'l', 'k'},
                    {'u', 's', 'a', 'm', 'e', 'o'},
                    {'l', 'n', 'g', 'r', 'o', 'v'},
                    {'m', 'l', 'p', 'r', 'r', 'h'},
                    {'p', 'o', 'e', 'e', 'j', 'j'}
            };
            words =    detectAllWords(crossword, "home", "same", "leo","jroel");





        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
            System.out.println(words.size()+" "+words.toString());;

        }

        public static List<Word> detectAllWords(int[][] crossword, String... words) {

            List <Word> words1 = new ArrayList<>();
            int [][]startWord; // Создаем карту для значений

            for (int i = 0; i <words.length ; i++) { // Перебераем все слова в массиве переданном в аргументах

                startWord = findWord(words[i], crossword); //находим функцией стартовые значения
                for (int j = 0; j < startWord.length; j++) {
                    if(startWord[j][0]<0)continue;
                    int startX = startWord[j][0];
                    int startY = startWord[j][1];
                    // перебераем  все стартовые значения слова и ищем окончание
                    for (String s : flagL) // перебераем все направления в которых может находиться слово
                    {    int[] res = recursVector(words[i], 0, crossword, startX, startY, s);

                        if (res[0] > -1 && res[1] > -1) {
                            Word w = new Word(words[i]);
                            w.setStartPoint(startY,startX);
                            w.setEndPoint(res[1], res[0]);
                            words1.add(w);

                        }    }
                }

            }



            return words1;
        }


        public static class Word {
            private String text;
            private int startX;
            private int startY;
            private int endX;
            private int endY;

            public Word(String text) {
                this.text = text;
            }

            public void setStartPoint(int i, int j) {
                startX = i;
                startY = j;
            }

            public void setEndPoint(int i, int j) {
                endX = i;
                endY = j;
            }

            @Override
            public String toString() {
                return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
            }
        }

        // Функция находит все страртовые позиции слова и возвращает в коллекцию мап
        private static int [][] findWord(String woord, int[][] cross){
            List <Integer> x = new ArrayList<>();
            List <Integer> y = new ArrayList<>();
            for (int i = 0; i < cross.length; i++) {
                for (int j = 0; j <cross[i].length ; j++) {
                    if(cross[i][j] == (int)woord.charAt(0)){
                        x.add(i);y.add(j);

                    }
                }

            }
            int [][] result= new  int[x.size()][2];
            for (int i = 0; i <result.length ; i++) {
                result[i][0] = x.get(i);
                result[i][1] = y.get(i);
            }
            return result;}
        // функция находит конечную позицию слова и возвращает в массив
        private static int[] recursVector(String coordWord,int start, int[][]crossword,int startX,int startY, String flags){
            int [] result = new int[]{-1,-1};
            if(startX>=0&&startY>=0&&coordWord.length()>start&&crossword.length >startX&&crossword[0].length >startY){
                if((int)coordWord.charAt(start) != crossword[startX][startY])

                {      startX= -1;
                    startY = -1;

                }
                if (coordWord.length()==start+1){ result = new int[]{startX,startY}; return  result;}

                int [] resPlus = crossSdvig(startX,startY,flagL.indexOf(flags));
                // устанавливаем направление перебора кросворда в зависимости от флага
                if(startX>-1&startY>-1){
                    return         recursVector(coordWord,start+1,crossword,resPlus[0],resPlus[1],flags);
                }

            }else
            {
                if(coordWord.length()>start){
                    result[0]=-1;result[1]=-1;
                }

            }
            return  result;}

        // цнкция устанавливает направление перебора массива кросфорда.
        private static int [] crossSdvig(int stX, int stY, int fl){
            int []result = new int[2];
            switch (fl) {
                case 0:
                    result = new int[]{stX, stY += 1};
                    break;
                case 1:
                    result = new int[]{stX, stY -= 1};
                    break;
                case 2:
                    result = new int[]{stX -= 1, stY};
                    break;
                case 3:
                    result = new int[]{stX += 1, stY};
                    break;
                case 4:
                    result = new int[]{stX += 1, stY += 1};
                    break;
                case 5:
                    result = new int[]{stX -= 1, stY += 1};
                    break;
                case 6:
                    result = new int[]{stX -= 1, stY += 1};
                    break;
                case 7:
                    result = new int[]{stX -= 1, stY -= 1};
                    break;
                default:
                    break;

            }
            return result;}

    }

