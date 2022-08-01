import javax.sound.sampled.SourceDataLine;

class Super_class {
    int n=20;
public void display(){
    System.out.println("this is super class");
}
}
public class Sub_class extends Super_class{
 int n=30;
 public void display(){
    System.out.println("this is sub class");
 }
 public void method(){
    Sub_class sub=new Sub_class();
    sub.display();
    super.display();
    System.out.println("value of super class is"+super.n);
    System.out.println("value of sub class is"+sub.n);
 }
 public static void main(String[] args) {
    Sub_class obj=new Sub_class();
    obj.method();
 }

 }




