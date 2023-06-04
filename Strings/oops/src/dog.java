public class dog {
    String name;
    int age;
    String breed;
    private String  sex;

    dog(){
        age =1;
        System.out.println("making a normal dog obj");
    }
    dog(String n,int a,String b,String s){
        System.out.println("Making paramterized dog obj");
        name =n;
        age=a;
        breed=b;
        sex=s;

    }
     void introduce(){
        System.out.println("Hello my name is "+name+"i am "+age+"yrs old");
    }
    int getAge(){
        return age;
    }

    String setSex(String val){
        sex=val;
        return val;
    }

    String getSex(){
        return sex;
    }


}
