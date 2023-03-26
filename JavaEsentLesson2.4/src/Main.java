import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age, vaga, carsNumber;
        String choise;
        double speed;
        String color;
        System.out.println("Hello, here you will change parameters for your car.\nHow many cars do you want to create?");
        carsNumber = in.nextInt();
        Car[] cars = new Car[carsNumber];
        System.out.println("Now you will go to constructor. REMEMBER! If you see '?' then you need to enter 'y' if you want to change this parameter. Otherwise it will stay defult");
        for (int i = 0; i < carsNumber; i++){
            cars[i] = new Car();
            System.out.println("Age?");
            choise = in.next();
            if (choise.equals("y")){
        System.out.println("Enter age");
        cars[i].setAge(in.nextInt());}
            System.out.println("Color?");
            choise = in.next();
            if (choise.equals("y")){
                System.out.println("Enter color");
        cars[i].setColor(in.next());}
            System.out.println("Veight?");
            choise = in.next();
            if (choise.equals("y")){
                System.out.println("Enter veight");
        cars[i].setVaga(in.nextInt());}
            System.out.println("Speed?");
            choise = in.next();
            if (choise.equals("y")){
                System.out.println("Enter speed");
        cars[i].setSpeed(in.nextDouble());}
            if (carsNumber > 1)
            System.out.println("Generete next car");
        }
        System.out.println("You created next cars");
        for (int i = 0; i < carsNumber; i++){
            cars[i].ShowCar();
        }

    }
}