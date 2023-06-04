import java.net.SocketTimeoutException;
import java.util.Scanner;

public class stringintro {
    public static void newstr(){
        String s1 =new String("abcde");
        String s2 = new String("abcde");
        String s3 ="java";
        System.out.println(s1.equals(s2));
        if(s1 ==s2){
            System.out.println("S1 and S2 are equal");
        }
        System.out.println("S1 and S2 are not equal");
        System.out.println(s1.charAt(2));
        char [] arr4 = s3.toCharArray();
        char [] arr2 = s1.toCharArray();
        arr2[0]='R';
        System.out.println(s1);
        System.out.println(arr2);
    }
    public static void displaystring(){
        Scanner sc = new Scanner(System.in);
        int rows =sc.nextInt();
        sc.nextLine();
        int largestsize =0;
        String largeststring="";
        for(int i=1;i<=rows;i++){
            String line = sc.nextLine();
            if(line.length()>largestsize){
                largestsize=line.length();
                largeststring=line;
            }
            System.out.println("\t"+line+"\n");
        }
        System.out.println(largeststring);

    }
    public static void main(String[] args) {
         //newstr();
        displaystring();
        String a = "hello";
        System.out.println(a);
        String str= "hello";
        System.out.println(str);
        String c = a;
        if(a==str && str==c && c==a){
            System.out.println("they are equal");
        }
        else{
            System.out.println("they are not equal");
        }
    }
}