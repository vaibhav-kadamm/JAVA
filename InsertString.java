import java.util.*;

public class InsertString {
    
    static String insert(String original,String toinsert,int index){

        String newstring=new String();
        for(int i=0;i<original.length();i++){
              newstring+=original.charAt(i);

              if(i==index){
                newstring+=toinsert;
              }
        }
        return newstring;
    }
    public static void main(String[] args) {
        String originalString = "VaibhavKadam"; 
        String stringToBeInserted = "Annasaheb"; 
        int index = 6; 
  
        System.out.println("Original String: "
                           + originalString); 
        System.out.println("String to be inserted: "
                           + stringToBeInserted); 
        System.out.println("String to be inserted at index: "
                           + index); 
  
        System.out.println("Modified String: "
                           + insert(originalString,stringToBeInserted,index)); 
    
    }
}
