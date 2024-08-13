public class CheckSix {
    public boolean firstOrLastIsSix(int[] nums) {

        if (nums.length == 0) {
            return false;
        }

        if (nums[0] == 6) {
            return true;
        }

        if (nums[nums.length - 1] == 6) {
            return true;
        }

        return false;
    }

}
