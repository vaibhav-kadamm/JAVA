public class try_catch {
    public static void main(String[] args) {
        try{
            int i[]=new int[2];
            System.out.println("access element"+i[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("exception thrown:"+e);
        }

        }
    }


