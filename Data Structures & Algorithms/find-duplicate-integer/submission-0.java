class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] s = new int[n + 1];
        for(int i = 0; i < n; i++){
            if(s[nums[i]] == -1)
              return nums[i];
            else
              s[nums[i]] = -1;
        }
        return -1;
    }
}
