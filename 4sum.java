class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int num1=nums[i];
                int num2=nums[j];
                int start=j+1;
                int end=n-1;
                while(start<end){
                    if(num1+num2+nums[start]+nums[end]==target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(num1);
                        temp.add(num2);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        list.add(temp);
                        start++;
                    }
                    else if(num1+num2+nums[start]+nums[end]>target){
                        end--;
                    }
                    else{
                        start++;
                    }
                }
            }
        }
        HashSet<List<Integer>> res=new HashSet<>(list);
        return new ArrayList<>(res);
    }
}