 class superclass {
    int age;
   superclass(int age){
     this.age=age;
   }
   public void get_age(){
    System.out.println("age is:"+age);
   }
 }
public class subclass extends superclass{
    subclass(int age){
        super(age);
    }
public static void main(String[] args) {
 subclass sub=new subclass(23);
 sub.get_age();

}
}