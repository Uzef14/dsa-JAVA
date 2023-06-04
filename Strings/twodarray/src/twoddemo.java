import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList ;
import java.util.Scanner ;
import java.util.Arrays ;

public class twoddemo {
    public static ArrayList<ArrayList<Integer>> readarr () {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the row count");
        int row =sc.nextInt();
        System.out.println("Enter the col  count");
        int col = sc.nextInt();
        ArrayList<ArrayList<Integer>> d2arr = new ArrayList<>(row);
        for(int i=0;i<row;i++){
            System.out.println("Enter the col count for"+i);
            int colmn = sc.nextInt();
            d2arr.add(new ArrayList<>(colmn));
            for (int j=0;j<colmn;j++){
                System.out.println("Enter the value for row"+j);
                int n= sc.nextInt();
                d2arr.get(i).add(n);
            }
        }
        return d2arr;
    }

    public static ArrayList<Integer> aslist( ) {

        ArrayList <Integer> arrlist = new ArrayList<>(3);
        Scanner sc = new Scanner(System.in);
        int row =sc.nextInt();
        for(int i=0;i<row;i++){
            int num =sc.nextInt();
            //arrlist.get(i).add(num);
        }

        return arrlist;

    }


    public static ArrayList<Integer>  rest12 (ArrayList<ArrayList<Integer>>,n,m) {

    }
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer> > darr = new  ArrayList <>(9);

        ArrayList <Integer> rows =new ArrayList<>(10);
        rows.add(0);
        rows.add(1);
        ArrayList <Integer> roow1 = new ArrayList<>(Arrays.asList(55,56,57));
        
        rest12 (,2,2);

        darr.add(rows);
        darr.add(roow1);
        darr.add(rows);
//        System.out.println(rows);
//        System.out.println(darr);
        darr.get(0).set(0,90);
//        System.out.println(darr);
//        System.out.println(rows);
//        System.out.println(darr.get(1));
//        System.out.println(darr.get(0).get(1)
//        System.out.println(darr.size());
//        System.out.println(darr.get(0).size());
        ArrayList<ArrayList<Integer>> darr1 =readarr();
        for(int row=0;row<darr1.size();row++){
            for(int col=0;col<darr1.get(row).size();col++){
                System.out.print(darr1.get(row).get(col)+ " ");
            }
            System.out.println(" ");
        }
    }
}
