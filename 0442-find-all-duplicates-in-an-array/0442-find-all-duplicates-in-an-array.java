class Solution {
    public List<Integer> findDuplicates(int[] nums) {
             List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]); // get actual number
            int index = val - 1; // map to index (1-based to 0-based)

            if (nums[index] < 0) {
                // already visited → duplicate
                result.add(val);
            } else {
                // mark as visited
                nums[index] = -nums[index];
            }
        }

        return result;
    }
}