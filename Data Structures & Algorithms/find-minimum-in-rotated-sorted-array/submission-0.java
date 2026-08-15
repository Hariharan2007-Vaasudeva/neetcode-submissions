class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int n = Integer.MAX_VALUE;

        while(i <= j){
            int mid = (i + j) / 2;
            if(nums[i] <= nums[mid]){
                n = Math.min(n, nums[i]);
                i = mid + 1;
            }
            else{
                n = Math.min(n, nums[mid]);
                j = mid - 1;
            }
        }
        return n;
    }
}
