 class human {
    public void move(){
        System.out.println("human can move");
    }
}

     class vaibhav extends human{
       public void move(){
        System.out.println("vaibhav can talk and walk");
       }
    }
    public class testvaibhav{
        public static void main(String[] args) {
            human a=new human();
            human b=new vaibhav();

            a.move();
            b.move();
        }
    }


