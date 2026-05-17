class Solution {
    public int search(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left + (right-left)/2;

            if(nums[mid] == target) return mid;
            if(nums[mid] > nums[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        index=left;
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int mid1=(mid+index)%nums.length;
            if(nums[mid1]==target){
                return mid1;
            }else if(nums[mid1]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}