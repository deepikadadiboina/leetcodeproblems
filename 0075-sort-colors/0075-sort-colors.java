class Solution {
    public int[] sortColors(int[] nums) {
        List<Integer> zeros = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();

        for (int num : nums) {
            if (num == 0) zeros.add(num);
            else if (num == 1) ones.add(num);
            else twos.add(num);
        }

        List<Integer> sorted = new ArrayList<>();
        sorted.addAll(zeros);
        sorted.addAll(ones);
        sorted.addAll(twos);

        // Copy back into nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sorted.get(i);
        }

        return nums;
    }
}
