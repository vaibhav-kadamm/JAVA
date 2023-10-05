import java.util.Arrays;

public class StringAnagram {
       static int n=256;
    static boolean isAnagram(char str1[],char str2[]){


        int count1[]=new int[n];
        Arrays.fill(count1,0);
        int count2[]=new int[n];
        Arrays.fill(count2,0);
        int i;

        for(i=0;i<str1.length && i<str2.length;i++){
             count1[str1[i]]++;
             count2[str2[i]]++;
        }
        if(str1.length!=str2.length){
            return false;
        }
        for(i=0;i<n;i++){
            if(count1[i]!=count2[i]){
                return false;
            }
        }
         return true;

    }
    public static void main(String[] args) {
        
        char str1[]=("vaibhavkadam").toCharArray();
        char str2[]=("vaibhavkadam").toCharArray();

    if(isAnagram(str1, str2)){
        System.out.println("Two Strings Are Anagram of each other");
    }
    else{
        System.out.println("Two Strings Are Not Anagram of each other");
    }
    }
}
