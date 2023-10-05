public class CharFromString {
    static char getChar(String s,int index){
        return s.charAt(index);
    }
    public static void main(String[] args) {
        String s="Vaibhav Kadam";
        int index=5;
         char ch=getChar(s, index);
         System.out.println("Character from " + s
         + " at index " + index 
         + " is " + ch);     }
}
