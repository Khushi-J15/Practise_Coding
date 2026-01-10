// given an array form other array starting from any index moving clockwise or anti-clockwise
// and generating prefix xor of values of res array then total , to get max answer
// we will have to consider starting from each index and each clockwise and anti-clockwise

class MaxXor {
    public static void main(String[] args){
        int[] arr = {7,8,5,5,9,2,2,0,1,6};
        int n = arr.length;
        int maxVal = 0;

        for(int start=0; start<n; start++){
            int[] res = new int[n];

            for(int i=0; i<n; i++){
                res[i] = arr[(start + i) % n]; // clockwise
            } 

            int total = 0, ans = 0;

            for(int val : res){
                ans ^= val;
                total += ans;
            }
            maxVal = Math.max(total, maxVal);

            for(int i=0; i<n; i++){
                res[i] = arr[(start - i + n) % n]; // anti-clockwise
            } 
            
            //imp : reset
            ans = 0;
            total = 0;

            for(int val : res){
                ans ^= val;
                total += ans;
            }

            maxVal = Math.max(total, maxVal);

        }

        System.out.println(maxVal);
    }
}
