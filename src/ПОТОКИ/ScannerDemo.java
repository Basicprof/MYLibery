package ПОТОКИ;
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double weight;
        int height;
        double delta;
        String action;
        System.out.println("What is your name?");
        name = sc.nextLine(); // Считали Имя
        System.out.println("Your weight (kg)?");
        weight = sc.nextDouble(); //Считали вес
        System.out.println("Your height (cm)?");
        height = sc.nextInt(); // Считали рост
        delta = height - weight;
        action = (delta>120)? "You are cm.Go to the FYM!":
                ((delta < 80)? "You are overweight. Go to the GYM and do cardio!":"You are OK. Go to rhe GYM!" );
       System.out.println("Hello, "+ name + "\nYour weight is "+ weight + " kg.\nYour height is "+ height +" cm.\n"+ action);
    }
    }

