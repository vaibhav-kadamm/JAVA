public class StringIterarte {

    static void getChar(String s){

        for(int i=0;i<s.length();i++){

            System.out.print(s.charAt(i));
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        String s="VaibhavKadam";
        getChar(s);
    }
}
