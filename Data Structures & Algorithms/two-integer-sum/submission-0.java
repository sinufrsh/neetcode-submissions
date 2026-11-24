class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            int complement=target-nums[i];
            int j=i+1;
            while(j<nums.length){
 if(nums[j]==complement){
                return new int[]{i,j};
            }
            else{
                j++;
            }
            }
           
 
        }
        return new int[]{-1,-1};
    }
}
