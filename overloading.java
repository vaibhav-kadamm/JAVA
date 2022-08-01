public class overloading {
    public static void main(String[] args) {
        int a=7;
        int b=12;
        double c=7.24;
        double d=2.45;
        int result1= minFunction(a,b);
        double result2=minFunction(c,d);
        System.out.println("min value =" +result1);
        System.out.println("min value =" +result2);
    }
    public static int minFunction(int a,int b){
        int min;
        if(a>b);
        min=b;
        
           min=a;
         
        
         return min;
    }
    public static double minFunction(double c,double d){
        double min;
        if(c>d);
        min=d;
    
           min=c;
        return min;
    }

    }
