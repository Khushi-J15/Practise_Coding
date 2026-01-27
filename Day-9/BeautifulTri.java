// A triplet  is beautiful if:
// i < j < k
// arr[j] - arr[i] = d
// arr[k] - arr[j] = d
// Given an increasing sequenc of integers and the value of d, count the number of beautiful triplets in the sequence.

import java.util.*;

class BeautifulTri {
      
    public static int beautifulTriplets(int d, List<Integer> arr) {
        Set<Integer> set = new HashSet<>(arr);
        int count = 0;

        for (int x : arr) {
            if (set.contains(x + d) && set.contains(x + 2 * d)) {
                System.out.println(x + " " + (x + d) + " " + (x + 2 * d));
                count++;
            }
        }

        return count;

    }

     public static void main(String[] args) {

        int ans = beautifulTriplets(3, Arrays.asList(1, 2, 4, 5, 7, 8, 10));
        System.out.println(ans);
    }
}
