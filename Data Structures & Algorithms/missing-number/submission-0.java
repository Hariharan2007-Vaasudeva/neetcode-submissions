class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int expec = (nums.length + 0) * (nums.length + 1) / 2;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return expec - sum;
    }
}
