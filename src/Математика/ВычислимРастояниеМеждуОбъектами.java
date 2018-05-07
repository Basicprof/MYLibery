package Математика;

public class ВычислимРастояниеМеждуОбъектами {

        private   double x;
        private  double y;
        private double radius;
        public ВычислимРастояниеМеждуОбъектами(double x, double y, double radius){
            this.x =x;  this.y = y;  this.radius = radius;}
        boolean isIntersec(ВычислимРастояниеМеждуОбъектами o){
            //Формула вычисление нахождения
            // на одном месте двух объектов.

            double dx = x - o.x;
            double dy = y - o.y;
            double destination = Math.sqrt(dx * dx + dy * dy);
            double destination2 = Math.max(radius, o.radius);
            return destination <= destination2;
        };


        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }
    }

