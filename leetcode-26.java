class Solution {
    public int removeDuplicates(int[] nums) {
        int i;
        int j=0;
        int n= nums.length;
        if(n==1){
            return 1;
        }
        for(i=0;i<n;i++){
                
            if(nums[j]!=nums[i]){
               nums[++j] = nums[i];
                }
            }
        
        int k = j+1;
        return k;
    }
}