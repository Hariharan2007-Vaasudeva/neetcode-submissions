class Solution {
    public void sortColors(int[] nums) {
      int z = 0;  
      int o = 0; 
      int t = 0;
      int n = nums.length;

      for(int i = 0; i < n; i++){
        if(nums[i] == 0){
            z++;
        }
        else if(nums[i] == 1){
            o++;
        }
        else{
            t++;
        }
      }
      int p = 0;
      for(int i = 0; i < z; i++){
        nums[p] = 0;
        p++;
      }
      for(int j = 0; j < o; j++){
        nums[p] = 1;
        p++;
      }
      for(int k = 0; k < t; k++){
        nums[p] = 2;
        p++;
      }
    }
}