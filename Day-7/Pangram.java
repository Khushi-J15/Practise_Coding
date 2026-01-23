// A String is Pangram if it contains every letter of the alphabet of english.

import java.util.*;

class Pangram {
    
   public static String pangrams(String s) {
        s = s.toLowerCase();
        Set<Character> uniqueSet = new HashSet<>();
        
        for(char ch : s.toCharArray()){
            if (ch >= 'a' && ch <= 'z'){ // this condition is necessary as the string can contains characters that are not letters
                uniqueSet.add(ch);
            }
        }
        
        return uniqueSet.size() == 26 ? "pangram" : "not pangram";
    }

    public static void main(String[] args){
        
        String ans = pangrams("The Quick brown fox jumps over the lazy dog");

        System.out.println(ans);

    }
}
 
