public class FibbRecursion {

    static int n1=0,n2=1,n3=0;
   static void fibb(int cnt){
  if(cnt>0){
      n3=n1+n2;
      n1=n2;
      n2=n3;
      System.out.print(" "+n3);
       fibb(cnt-1);
  }
  
   }
  public static void main(String[] args) {
    int cnt=10;
    System.out.print(n1+" "+n2);
     fibb(cnt-2);
  }
}
