 class Inheritance {
    int c;
    public void addition(int a,int b){
        c=a+b;
        System.out.println("Addition of numbers are :"+c);
    }
    public void subtraction(int a,int b){
        c=a-b;
        System.out.println("Subtraction of numbers is:"+c);
    }
}
public class My_Inheritance extends Inheritance{
     public void multiplication(int a,int b){
        c=a*b;
       System.out.println("multiplication of numbers is:"+c);
     }
     public static void main(String[] args) {
        int a=20,b=30;
        My_Inheritance demo=new My_Inheritance();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplication(a, b);
        
     }
}
