package com.javarush.task.task21.task2113;


public class Horse {
    String name;
    double speed;
    double distance;
   public Horse (String name, double speed, double distance){
       this.name = name;
       this.speed = speed;
       this.distance =distance;
   }
   public String getName(){return this.name;}
    public double getSpeed(){return this.speed;}
    public double getDistance(){return this.distance;}
    public void setName(String  s){this.name = s;}
    public void setSpeed(double s){this.speed = s;}
    public void setDistance(double d){this.distance =d;}
}
