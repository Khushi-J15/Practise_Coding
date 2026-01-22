// SEPARATING NUMBERS : You need to check whether String can be split into 2 or more numbers such that:

// Numbers are strictly increasing by 1

// No leading zeros

// Order cannot be changed

// note : Assume first number length, then verify the forced sequence

import java.util.*;

class Separating_Numbers{
    
    public static void separateNumbers(String s) {
        int n = s.length();
        
        for(int len=1; len<=n/2; len++){
            long first = Long.parseLong(s.substring(0, len));
            long next = first;
            
            StringBuilder sb = new StringBuilder();
            
            while(sb.length() < n){
                sb.append(next);
                next++;
            }
            
            if(sb.toString().equals(s)){
                System.out.println("YES " + first);
                return;
            }
        }
        
        System.out.println("NO");

    }

    public static void main(String[] args){
        
        separateNumbers("910911");

    }
}
 
