import java.util.Scanner;

public class stringbuilder {
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
    public static void addtosb(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n");
        int n=sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append((char)('A'+i));
        }
        System.out.println(sb);
        }

    public static void main(String[] args){
    addtostr();
        addtosb();
        StringBuilder sb = new StringBuilder("Helllo");
        sb.ensureCapacity(50);
        sb.append("Apple");
        sb.append("Apple");
        sb.append("Apple");
        sb.append("Apple");
        sb.append("Apple");
        sb.append("Apple");
        sb.insert(2,"OOOOOOO");
        System.out.println(sb.toString());
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(System.currentTimeMillis());

    }
}
