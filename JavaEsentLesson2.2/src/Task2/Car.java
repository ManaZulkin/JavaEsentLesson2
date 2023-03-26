package Task2;

public class Car {
    private int age;
    private String color;

    public Car () {
    }
    public Car (int age){
        this.age = age;
    }
    public Car (int age, String color){
        this.age = age;
        this.color = color;
    }
    public void ShowCar(){
        System.out.println("Age " + age);
        System.out.println("Color " + color);
    }
}
