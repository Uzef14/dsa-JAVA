import java.util.Scanner;
public class stringperformance {
    public static void addtostr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n");
        int n=sc.nextInt();
        String str="";
        for(int i=0;i<n;i++){
            str += (char) ('A'+i);
            System.out.println(str);

        }
    }
    public static void main(){

        addtostr();
    }
}
