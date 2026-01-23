import java.util.*;

class Q55th {
    public static int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) list.add(n);
        
        int operations = 0;

        while (!isIncreasing(list)) {
            int minSum = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    minIndex = i;
                }
            }

            int combined = list.get(minIndex) + list.get(minIndex + 1);
            list.remove(minIndex); // remove first
            list.remove(minIndex); // remove second (now at same index)
            list.add(minIndex, combined); // add combined value
            operations++;
        }

        return operations;
    }

    private static boolean isIncreasing(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) > list.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        
        int ans = minimumPairRemoval(new int[]{5,2,3,1});
        System.out.println(ans);

    }
}

// o/p : 2
// The pair (3,1) has the minimum sum of 4. After replacement, nums = [5,2,4].
// The pair (2,4) has the minimum sum of 6. After replacement, nums = [5,6].
// The array nums became non-decreasing(increasing) in two operations.
