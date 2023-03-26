import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter radius for circle");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        MyArea.areaOfCircle(r);
    }
}