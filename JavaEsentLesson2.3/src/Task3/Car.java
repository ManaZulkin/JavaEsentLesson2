package Task3;

public class Car {
    private int age, vaga;
    private String color;
    private double speed;

    public Car(){

    }
    public Car(int age){
        this.age = age;
    }
    public Car(int age, String color){
        this.age = age;
        this.color = color;
    }
    public Car(int age, String color, int vaga){
        this.age = age;
        this.color = color;
        this.vaga = vaga;
    }
    public Car(int age, String color, int vaga, double speed){
        this.vaga = vaga;
        this.color = color;
        this.age = age;
        this.speed = speed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVaga(int vaga) {
        this.vaga = vaga;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void ShowCar(){
        System.out.println(" Age " + age + " Color " + color + " Vaga " + vaga + " Speed " + speed);
    }
}
