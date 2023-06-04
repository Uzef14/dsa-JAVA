public class binarysearch {

    public static void bsearch() {
        boolean flag=false;
       // int [] arr ={1,2,3,4,5,6,9};
        String [] arr ={"apple","azzz","banana","banti","cat","cattty","pussy"};
        int start=0;
        int end=arr.length-1;
        String ele ="cat";

        while(start<=end){
         int mid=(start+end)/2;
         int res=ele.compareTo(arr[mid]);
         if(ele==arr[mid]){
             System.out.println("element found at"+mid);
              flag=true;
             break;
         }
         if(res>0){
             start=mid;
         }
         if(res<0){
             end =mid;
         }

        }
        if(!flag){
            System.out.println("element found at"+-1);
        }


    }
    public static int b1search() {
        int [] arr ={1,2,3,4,5,6,9};
        int start=0;
        int end=arr.length-1;
        int ele =6;
        while(start<=end){
            int mid=(start+end)/2;
            if(ele==arr[mid]){
                System.out.println("element found at"+mid);
                return mid;
            }
            if(ele>arr[mid]){
                start=mid;
            }
            if(ele<arr[mid]){
                end =mid;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        bsearch();
//        int res=b1search();
//        System.out.println(res);
    }
}
