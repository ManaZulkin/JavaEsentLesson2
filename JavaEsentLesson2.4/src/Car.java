public class Car {
    private int age, vaga;
    private double speed;
    private String color;

    public Car(){
        this(0,"Defult",0,0);
    }
    public Car(int age){
        this(age,"Defult",0,0);
    }
    public Car(int age, String color){
        this(age,color,0,0);
    }
    public Car(int age, String color, int vaga){
        this(age,color,vaga,0);
    }
    public Car(int age, String color, int vaga, double speed){
        this.age = age;
        this.color = color;
        this.vaga = vaga;
        this.speed = speed;
    }
    public void ShowCar(){
        System.out.println("Age - " + age + ";" + " Color - " + color + ";"  + " Veight - " + vaga + ";"  + " Speed - " + speed);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getVaga() {
        return vaga;
    }

    public void setVaga(int vaga) {
        this.vaga = vaga;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
