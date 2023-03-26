package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        String color;
        System.out.println("Enter age of the car");
        age = in.nextInt();
        System.out.println("Enter color of the car");
        color = in.next();

        Car car1 = new Car();
        Car car2 = new Car(age);
        Car car3 = new Car(age, color);
        System.out.println("Car 1");
        car1.ShowCar();
        System.out.println("Car 2");
        car2.ShowCar();
        System.out.println("Car 3");
        car3.ShowCar();

    }
}
