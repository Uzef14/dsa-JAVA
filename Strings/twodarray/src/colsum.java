import java.util.ArrayList;
import java.util.Arrays;

public class colsum {

    public static void colsum1() {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3));
        arr.add(Arrays.asList(1,2,3));

        for(int col=0;col<N;col++){
            int   sum=0;
            for(int row=0;row<M;row++){
                sum =sum+arr.get(col).get(row);
            }
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {


    }
}
