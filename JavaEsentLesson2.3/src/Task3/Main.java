package Task3;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double speed;
        int vaga, age, carsNumb, coiseNumb;
        String color, choise;
        System.out.println("How many cars do you want to create?");
        carsNumb = in.nextInt();
        Car[] cars = new Car[carsNumb];
        System.out.println("When you see '?' write 'y' to enter parametrs. In another case creation will end");
        for (int i = 0; i < carsNumb; i++ ) {
            cars[i] = new Car();
            System.out.println("Age?");
            choise = in.next();
            if (choise.equals("y")){
                System.out.println("Enter age of the car");
                cars[i].setAge(in.nextInt());
                coiseNumb = 1;
                System.out.println("Color?");
                choise = in.next();
            }  if (choise.equals("y")) {
                System.out.println("Enter color of the car");
                cars[i].setColor(in.next());
                System.out.println("Veight?");
                choise = in.next();
            }  if (choise.equals("y")) {
                System.out.println("Enter veight of the car");
                cars[i].setVaga(in.nextInt());
                System.out.println("Speed?");
                choise = in.next();
            } if (choise.equals("y")) {
                System.out.println("Enter speed of the car");
                cars[i].setSpeed(in.nextDouble());
            }
            System.out.println("Car is created");
        }
        for (int i = 0; i < carsNumb; i++)
            cars[i].ShowCar();
    }
}