class Solution {
    public boolean uniqueOccurrences(int[] n) {
                HashMap<Integer, Integer> hsp = new HashMap<>();
        for (int i : n) {
            hsp.put(i, (hsp.getOrDefault(i, 0) + 1));
        }
        HashSet<Integer> map = new HashSet<>();
        for (int value : hsp.values()) {
            if (!map.add(value)) {
                return false;
            }
        }

        return true;
    }
}