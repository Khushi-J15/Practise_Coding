// find the longest subarray where the absolute difference between any two elements is less than or equal to 1.
// You must pick the largest possible subarray (or multiset) such that:

// The absolute difference between any two elements in it is ≤ 1

import java.util.*;

public class Counting{

    public static int pickingNumbers(List<Integer> a) {
        int[] freq = new int[101]; /// Counting / Frequency Counting Approach
        
        int maxLength = 0;

        for (int num : a) {
            freq[num]++;
        }
        
        for (int i = 0; i < 100; i++) {
            maxLength = Math.max(maxLength, freq[i] + freq[i + 1]);
        }

        return maxLength;

    }

    public static void main(String[] args) {

        System.out.println(pickingNumbers(Arrays.asList(1,1,2,2,4,4,5,5,5)));

    }

}

// Collections.sort(a); // 2 pointer (naive)
//         int len = 0;
        
//         for(int i=0; i<a.size(); i++){
//             for(int j=i+1; j<a.size(); j++){
//                 if(a.get(j) - a.get(i) <= 1)
//                 len = Math.max(len, j-i+1);
//             }
//         }
        
//         return len;
