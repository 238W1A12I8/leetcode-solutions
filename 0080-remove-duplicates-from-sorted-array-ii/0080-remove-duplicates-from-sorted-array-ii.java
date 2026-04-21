class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0);
            if (count < 2) {
                nums[index++] = nums[i];
                map.put(nums[i], count + 1);
            }
        }
        return index;
    }
}