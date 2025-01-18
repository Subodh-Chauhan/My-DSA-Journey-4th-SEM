
public class FindFirstAndLastPositionOfAnElementInASortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 1;
        int start = function(nums, target, true);
        int end = function(nums, target, false);
        System.out.println(start + " " + end);
    }

    static int function(int[] nums, int target, boolean firstIndex) {
        int ans = -1;
        int head = 0;
        int tail = nums.length - 1;
        int midIndex = (head + tail) / 2;
        while (head <= tail) {
            if (target < nums[midIndex]) {
                tail = midIndex - 1;
            } else if (target > nums[midIndex]) {
                head = midIndex + 1;
            } else {
                ans = midIndex;
                if (firstIndex) {
                    tail = midIndex - 1;
                } else {
                    head = midIndex + 1;
                }

            }
            midIndex = (head + tail) / 2;
        }
        return ans;
    }
}
