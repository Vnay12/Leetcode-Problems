class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        // Map from value to its index in the array
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            valueToIndex.put(nums[i], i);
        }

        for (int[] op : operations) {
            int oldValue = op[0];
            int newValue = op[1];

            // Get index of the old value
            int index = valueToIndex.get(oldValue);

            // Replace in array
            nums[index] = newValue;

            // Update map
            valueToIndex.remove(oldValue);
            valueToIndex.put(newValue, index);
    }
    return nums;
}
}