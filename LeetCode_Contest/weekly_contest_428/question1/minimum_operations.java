import java.util.HashSet;

public class minimum_operations {

    /**
     *
     * checking whether is duplicate present in array or not
     * @param nums
     * @return
     */
    private static boolean isDuplicate(int[] nums, int start, int end) {

        HashSet<Integer> set = new HashSet<>();


        for(int i=start; i<end; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            else {
                set.add(nums[i]);
            }
        }

        return false;
    }
    public static int minimumOperations(int[] nums) {

        /**
         *  Base Cases
         */

        if(nums == null || nums.length == 0) return 0;

        if(nums.length <= 3) {

            HashSet<Integer> set = new HashSet<>();
            int count = 0;
            for(int i=0; i<nums.length; i++) {

                if(set.contains(nums[i])) {
                    count++;
                }
                else {
                    set.add(nums[i]);
                }
            }
            return  count;
        }

        if(!isDuplicate(nums, 0, nums.length)) return 0;



        return solve(nums, 0, nums.length);

    }

    public static int solve(int[] nums, int start, int end) {
        if(start >= nums.length) return 0;

        if(!isDuplicate(nums, start, end)) return 0;

        return solve(nums, start + 3, end) + 1;

    }


    public static void main(String[] args) {

        int[] nums = {1,2,3,4,2,3,3,5,7};

        System.out.println(minimumOperations(nums));
    }
}
