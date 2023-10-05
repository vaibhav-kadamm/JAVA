public class StringSwap {

    static String swapString(String s){

        if(s==null||s.isEmpty()){
            return s;
        }
        char[]ch=s.toCharArray();

        for(int i=0;i<ch.length-1;i+=2){
            char temp=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        
        String s="Vaibhav";
          System.out.println(swapString(s));
    }
}
