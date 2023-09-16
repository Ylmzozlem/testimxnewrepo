package Question43;

public class MinJumpsToReachEnd {
    public static int minJumps(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return 0;
        }

        int maxReach = nums[0];
        int steps = nums[0];
        int jumps = 1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                return jumps;
            }

            maxReach = Math.max(maxReach, i + nums[i]);
            steps--;

            if (steps == 0) {
                jumps++;
                if (i >= maxReach) {
                    return -1; // Cannot reach the end
                }
                steps = maxReach - i;
            }
        }

        return -1; // Cannot reach the end
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        int minJumps = minJumps(nums);
        System.out.println("Minimum jumps needed to reach the end: " + minJumps);
    }
}
