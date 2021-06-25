class Solution {
    public int[] twoSum(int[] nums, int target) {
            int size = nums.length;
    
    int[] output = new int[2];
    
    for(int i = 0; i < size; i++) {
        
        int e1 = nums[i];
        
        for(int j = i + 1; j < size; j++) {
            
            int e2 = nums[j];
            int sum = e1 + e2;

            if(sum == target) {

                output[0] = i;
                output[1] = j;
            }
        }
     }
    
    return output;
    }
}