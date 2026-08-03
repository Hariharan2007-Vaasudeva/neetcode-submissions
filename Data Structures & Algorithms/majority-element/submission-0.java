class Solution {
    public int majorityElement(int[] nums) {
        int start = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                start = nums[i];
                count = 1;
            }
            else if(nums[i] == start){
                count++;
            }
            else{
                count--;
            }
        }
        return start;
    }
}