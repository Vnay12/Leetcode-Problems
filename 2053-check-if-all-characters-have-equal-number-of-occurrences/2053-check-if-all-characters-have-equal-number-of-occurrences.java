class Solution {
    public boolean areOccurrencesEqual(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            int freq = map.getOrDefault(c, 0) + 1;
            map.put(c, freq);
        }
        int freq = 0;
        for (int value : map.values()) {
            freq = value;
            break;
        }

        for (int value : map.values()) {
            if (value != freq) {
                return false;
            }
        }
        return true;
    }
}