 class Cacli {
    int c;
    public void addition(int a,int b){
        c=a+b;
        System.out.println("addition of numbers :"+c);
    } 
    public void subtraction(int a,int b){
        c=a-b;
        System.out.println("subtraction of numbers :"+c);

    }
}
public class My_Cacli extends Cacli{
 public void  multiplication(int a,int b){
  c=a*b;
  System.out.println("mutiplication of numbers:"+c);
 }
 public static void main(String[] args) {
    int a=2,b=5;
    My_Cacli demo=new My_Cacli();
    demo.addition(a, b);
    demo.subtraction(a, b);
    demo.multiplication(a, b);
    
 }
}
