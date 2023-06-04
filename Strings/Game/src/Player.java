public class Player {
        String name;
        int guess;
        public int guess(){
            int guess =(int)(Math.random()*10);
            return guess;
        }
         Player(String Pname){
            name = Pname;
        }



}
