public class StringPalindrome {

    static boolean isPalindrome(String s){

        String rev="";

        boolean ans =false;

        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            ans=true;
        }
        return ans;
    }
    public static void main(String[] args) {
        
        String s="abbab";

        s=s.toLowerCase();
        System.out.println(isPalindrome(s));
    }
}
