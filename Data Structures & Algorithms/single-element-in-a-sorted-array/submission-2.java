class Solution {
    public int singleNonDuplicate(int[] nums) {
        // int n = nums.length;
        // if(n == 1 || nums[0] != nums[1])
        //     return nums[0];
        // if(nums[n - 1] != nums[n - 2])
        //     return nums[n - 1];
        // int i = 1;
        // int j = n - 2;
        // while(i <= j){
        //     int mid = (i + j) / 2;
        //     if(nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1])
        //         return nums[mid];
        //     else if(mid % 2 == 0){
        //         if(nums[mid] == nums[mid + 1])
        //             i = mid + 1;
        //         else
        //             j = mid - 1;
        //     }else{
        //         if(nums[mid] == nums[mid + 1])
        //             j = mid - 1;
        //         else
        //             i = mid + 1;
        //     }
        // }
        // return -1;


        int i = 0;
        int j = nums.length -1;

        while(i < j){
            int mid = (i + j) / 2;
            if(mid % 2 == 1){
                mid--;
            }
            if(nums[mid] == nums[mid + 1]){
                i = mid + 2;
            }
            else{
                j = mid;
            }
        }
        return nums[i];
    }
}