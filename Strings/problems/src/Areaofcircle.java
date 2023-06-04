import java.util.Scanner;
public class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the radius");
        float r= sc.nextFloat();
        double Area =(3.142*r*r);
        System.out.print(Area);
    }
}
