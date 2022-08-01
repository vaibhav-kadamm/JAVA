public class varargs {
    public static void main(String[] args) {
        printMax(3,45,33.4);
        //printMax (new double[]{9,7,8});
    }
    public static void printMax(double... numbers){
        if(numbers.length==0){
            System.out.println("no argument passs");
            return;
        }
        double result=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>result){
                result=numbers[i];
                System.out.println("max value is :"+result);
            }
        }

    }
}
