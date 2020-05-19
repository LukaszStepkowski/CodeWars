public class GrassHopper {
    public static int findAverage(int[] nums) {
        int opt = 0;
        for (int i = 0; i < nums.length; i++){
            opt += nums[i];
        }
        return opt / nums.length;
    }
}
