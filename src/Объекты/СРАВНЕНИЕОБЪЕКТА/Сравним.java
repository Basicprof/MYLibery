package Объекты.СРАВНЕНИЕОБЪЕКТА;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;




    /*
    Equals and HashCode
    */

public class Сравним {
        private final String first, last;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(  o instanceof Сравним))       return false;
            if (o == null || getClass() != o.getClass()) return false;
            Сравним solution = (Сравним) o;
            return Objects.equals(first, solution.first) &&
                    Objects.equals(last, solution.last);
        }

        public Сравним(String first, String last) {
            this.first = first;
            this.last = last;
        }

//    public boolean equals(Solution n) {
//        if (this == n)
//            return true;
//        if (!(n instanceof Solution))
//            return false;
//        Solution o = (Solution) n;
//
//        return o.first == first && o.last == last;
//    }

        public int hashCode() {
            final int prime = 31;
            int result = 1;
            if(this.first!=null)result = prime * result + this.first.hashCode() ;
            if(this.last!=null) result = prime * result + this.last.hashCode() ;
            return result;
        }

        public static void main(String[] args) {
            Set<Сравним> s = new HashSet<>();
            s.add(new Сравним("Donald", "Duck"));
            System.out.println(s.contains(new Сравним("Donald", "Duck")));
        }
    }

