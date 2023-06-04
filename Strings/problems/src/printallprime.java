import java.util.Scanner;
public class printallprime {
    public static void primenumber() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
          if(n%i==0){
              System.out.println(i +"is  prime");
          }
        }

    }
    public static void main(String[] args) {
        primenumber();
    }
}
