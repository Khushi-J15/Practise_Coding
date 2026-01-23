// The distance between two array values is the number of indices between them. Given a, find the minimum distance between any pair of equal elements in the array. If no such value exists, return -1

import java.util.*;

class Q54th {
    public static int minimumDistances(List<Integer> a) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i).equals(a.get(j))) {
                    ans = Math.min(ans, j - i);
                }
            }
        }

        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    
    }

    public static void main(String[] args){
        
        int ans = minimumDistances(Arrays.asList(3,2,1,2,3));

        System.out.println(ans);

    }
}
