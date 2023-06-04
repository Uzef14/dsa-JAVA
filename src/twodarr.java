import java.util.Arrays;
import java.util.Scanner;
public class twodarr {

    public static void printarr(){
        int [][] arr1 ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr1[0]+","+arr1[1]+","+arr1[2]);
        System.out.println(Arrays.toString(arr1[0]));
    }

    public static void twodarrprint(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the rows:");
        int rows = sc.nextInt();
        System.out.print("enter the cols:");
        int cols = sc.nextInt();
        int [][] arr = new int [rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }

    }
    public static void main(String [] args ){
        printarr();
        twodarrprint();
    }

}
