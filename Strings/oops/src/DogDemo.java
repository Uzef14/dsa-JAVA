public class DogDemo {
    public static void main(String[] args) {
        dog dog1 =new dog();
       // dog1.sex="Male";
        dog1.name="pushpa";
        dog dog2 =new dog ("padu",2,"street","Female");
        dog dog3 =new dog("Shreoo",7,"lamda","Male");
      //  dog2.sex="Male";

        dog1.introduce();
        dog2.introduce();
        dog2.setSex("fuddu");
        System.out.println(dog2.getAge());

        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println(dog2.getSex());
    }


}
