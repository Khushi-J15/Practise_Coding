// Given an array of non-negative integers arr, you are initially positioned at start index of the array. 
// When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach any index with value 0.
// Notice that you can not jump outside of the array at any time.

class Q82th {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[arr.length];

        queue.offer(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            int index = queue.poll();

            if(arr[index] == 0) return true;

            int forward = index + arr[index];
            int backward = index - arr[index];

            if(forward < arr.length && !visited[forward]){
                queue.offer(forward);
                visited[forward] = true;
            }

            if(backward >= 0 && !visited[backward]){
                queue.offer(backward);
                visited[backward] = true;
            }

        }

        return false;
    }
}

// Example 1:

// Input: arr = [4,2,3,0,3,1,2], start = 5
// Output: true
// Explanation: 
// All possible ways to reach at index 3 with value 0 are: 
// index 5 -> index 4 -> index 1 -> index 3 
// index 5 -> index 6 -> index 4 -> index 1 -> index 3
