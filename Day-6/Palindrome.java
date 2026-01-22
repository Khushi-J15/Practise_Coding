// James found a love letter that his friend Harry has written to his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

// Two rules:

// He can only reduce the value of a letter by 1, i.e. he can change d to c, but he cannot change c to d or d to b.
// The letter a  may not be reduced any further.
// Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.

// Example : s = cde

// The following two operations are performed: cde → cdd → cdc. Return 2.

import java.util.*;

class Palindrome {
    
    public static int theLoveLetterMystery(String s) {
        int left = 0;
        int right = s.length() - 1;
        int operations = 0;

        while (left < right) {
            operations += Math.abs(s.charAt(left) - s.charAt(right));
            left++;
            right--;
        }

        return operations;

    }


    public static void main(String[] args){

        int ans = theLoveLetterMystery("abcd");
        System.out.println(ans);
    }

}

