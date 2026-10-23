

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        for (int num : set) {
            // Start only from the smallest number
            if (num != Integer.MIN_VALUE && set.contains(num - 1)) {
                continue;
            }

            int l = num;
            int count = 1;

            while (l != Integer.MAX_VALUE && set.contains(l + 1)) {
                l++;
                count++;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
