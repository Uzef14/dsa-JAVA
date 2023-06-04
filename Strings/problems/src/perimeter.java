import java.util.Scanner;
public class perimeter {
    public static void sumofsides() {
 Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of side1");
 int side1 = sc.nextInt();
        System.out.println("Enter the value of side2");
 int side2 = sc.nextInt();
        System.out.println("Enter the value of side3");
 int side3 = sc.nextInt();
 int perimeter = side1+side2+side3;
        System.out.println(perimeter);
    }
    public static void main(String[] args) {
        sumofsides();
    }
}
