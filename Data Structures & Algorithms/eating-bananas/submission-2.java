class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int j = 0;
        for(int pile : piles){
            j = Math.max(pile, j);
        }
        while(i < j){
            int mid = (i + j) / 2;
            long th = 0;
            for(int pile : piles){
                th += (pile + mid - 1) / mid;
            }
            if(th <= h){
                j = mid;
            }
            else{
                i = mid + 1;
            }
        }
        return i;
    }
}
