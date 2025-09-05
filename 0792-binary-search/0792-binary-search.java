class Solution {
    public int search(int[] arr, int key) {
        int left = 0;
        int right = arr.length-1;
      
         while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == key) {
                return middle;
            } else if (key < arr[middle]) {
                right = middle - 1;

            } else {
                left = middle + 1;
            }

        }
        return -1;
    }
}