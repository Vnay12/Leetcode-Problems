class Solution {
    public int sumOfUnique(int[] n) {
         int sum = 0;
        HashMap<Integer, Integer> hsp = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            int tempfreq = hsp.getOrDefault(n[i], 0) + 1;
            hsp.put(n[i], tempfreq);
        }

        for (int key : hsp.keySet()) {
            if (hsp.get(key) == 1) {
                sum = sum + key;
            }
        }
        return sum;
    }
}