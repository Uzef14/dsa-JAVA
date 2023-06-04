import java.util.Scanner;
public class factorial {
    public static double fact() {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=n;i>0;i--){
            fact =fact* i;
        }

        return fact;
    }
    public static void main(String[] args) {
        double res =fact();
        System.out.println(res);
    }
}
