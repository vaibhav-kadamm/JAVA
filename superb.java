class human {
    public void move(){
        System.out.println("human can move");
    }

}
class vaibhav extends human{
    public void move(){
        super.move();
        System.out.println("vaibhav can walk and run");
    }
}
public class superb{
 public static void main(String[] args) {
    human b=new vaibhav();
    b.move();
 }
}
