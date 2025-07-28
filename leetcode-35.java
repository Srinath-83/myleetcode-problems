class Solution {
    public int searchInsert(int[] nums, int target) {
      int mid = nums.length/2;
      int j=nums.length;
      if(target==nums[mid]){
        j = mid;
      }else if(target>nums[mid]){
        for(int i = mid+1 ; i<nums.length;i++){
            if(nums[i]==target){
                j = i;
                break;
            }else if(nums[i]>target){
                j= i;
                break;
            }
            }
        }
        else{
        for(int i = 0 ; i<=mid;i++){
            if(nums[i]==target){
                j = i;
                break;
            }else if(nums[i]>target){
                j = i;
                break;
            }
           }  
    }
return j;
}
}