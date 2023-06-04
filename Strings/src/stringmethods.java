
import java.sql.SQLOutput;
import java.util.Arrays;
public class stringmethods {

    public static void str(){
        String  s1 =new String("Twinkel");
        String a ="Hello";
        String s3 ="java";
        char [] b = a.toCharArray();
        System.out.println(b);
        char [] arr4 = s3.toCharArray();
        System.out.println(arr4);
        char [] arr2 = s1.toCharArray();
        System.out.println(arr2);

    }
    public static void rabbit(){
        String doc ="Twinkel Twinkel Little TATATA documentation";
        String doc2 ="What u rs          ";
        System.out.println(doc.replace("Twinkel","You"));
       // System.out.println(doc.indexOf("Twinkel",1));
        int index =doc.indexOf("TATA");
        while(index != -1) {
            System.out.println(index);
            System.out.println(doc.indexOf("TATA", index+1));
            break;

        }
//        System.out.println(doc +" "+doc2);
//        System.out.println(doc.toUpperCase());
//        System.out.println(doc2.length());
//        String d=doc2.strip();
//        System.out.println(d.length());
    }

    public static void main(String[] args){
        //str();
        rabbit();
    }
}
