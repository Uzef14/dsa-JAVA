import java.util.Scanner;
public class operationonarr {
    public static void arr(){
        int [] arr1= new int[10];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){
            System.out.println("enter the value of arr at"+i);
            arr1[i]=sc.nextInt();
        }
        for(int x:arr1){
            System.out.print(x+',');
        }
    }
    public static void insertbetween(){
        int [] arr1={10,20,30,40,50,60,70,80};
        int i=40;
        for(int j=0;j<arr1.length;j++){
            if(arr1[j]==i){
                j=j+1;
            }
            System.out.println(arr1[j]);
        }
    }
    public static void arr1(){
        int [] ar2={10,20,30,40,50};
        int m=3;
        for(int k=0;k<ar2.length;k++){
            if(k==m){
                ar2[k]=60;
            }
            System.out.println(ar2[k]);
        }

    }

    public static void binarysearch(){
        int [] arr={1,2,3,4,5,6,7,8,9,10,11};
        int r=0;
        int l =arr.length-1;

        int ele =9;
        while(r<=l){
            int mid =(r+1)/2;
            if(ele ==arr[mid]){
                System.out.println("element found at"+mid);
            }
            if(ele>arr[mid]){
                r=mid;
            }
            if(ele<arr[mid]){
                l=mid;
            }
        }
        System.out.println("ele found at"+-1);
    }
    public static void main(String[] args) {
        //arr();
        //insertbetween();
       // arr1();
        binarysearch();
    }

}

