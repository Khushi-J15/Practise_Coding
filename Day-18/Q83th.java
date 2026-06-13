// Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.

// Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

 
class Q83th {
    public int getCommon(int[] nums1, int[] nums2) {
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        
        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }

        for(int j=0; j<nums2.length; j++){
            set2.add(nums2[j]);
        }

        set1.retainAll(set2);
        
        if(set1.isEmpty()) return -1;
        return set1.first();
        
    }
}

// Input: nums1 = [1,2,3], nums2 = [2,4]
// Output: 2
// Explanation: The smallest element common to both arrays is 2, so we return 2.
