class Solution {
    public boolean containsDuplicate(int[] n) {
        HashMap<Integer, Integer> hsp = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            int tempfreq = hsp.getOrDefault(n[i], 0) + 1;
            hsp.put(n[i], tempfreq);
            if (tempfreq >= 2) {
                return true;
            }
        }
        return false;
    }
    }
