class Solution {
    public int removeElement(int[] nums, int target) {
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]!=target){
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}