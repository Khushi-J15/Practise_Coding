
// import java.util.*;

 class Kadane {
    public static int maxSubarraySum(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            tempStart = i;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum > maxi) {
                    maxi = sum;
                    start = tempStart;
                    end = j;
                }
            }
        }

        // Print the subarray
        System.out.print("The maximum subarray is: ");
        for (int k = start; k <= end; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println(); // For newline

        return maxi;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

}

