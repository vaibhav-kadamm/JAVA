public class sum {
  public int sum( int a ,int b){
return (a+b);
   }
   public double sum(double a,double b, double c){
    return(a+b+c);
   }
   public static void main(String[] args) {
     sum s=new sum();
     System.out.println(s.sum(10,20));
     System.out.println(s.sum(10,20,30));
   }
}
