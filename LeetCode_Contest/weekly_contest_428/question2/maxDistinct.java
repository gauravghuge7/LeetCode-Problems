import java.util.HashMap;
import java.util.HashSet;

public class maxDistinct {

//    public static int maxDistinctElements(int[] nums, int k) {
//
//        int n = nums.length;
//
//        /**
//         * Create a HashMap and store the value of the
//         */
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//
//        for(int i=0; i<n; i++) {
//            map.put(i, nums[i]);
//        }
//
//        int value = (-k) + 1;
//
//        for(int i=0; i<n; i++) {
//
//            while(map.containsValue(nums[i]))
//        }
//
//        return map.size();
//    }


//    public static int maxDistinctElements(int[] nums, int k) {
//
//        int n = nums.length;
//
//        HashSet<Integer> set = new HashSet<>();
//
//        int count = 0;
//
//        for(int i=0; i<n; i++) {
//
//            if(nums[i] <= (-k) || nums[i] >= k) {
//
//                if(set.contains(nums[i])) {
//                    count++;
//                }
//                else {
//
//                }
//            }
//        }
//
//        int total_k_values = (k * 2) + 1;
//
//        return total_k_values + count;
//
//    }


    public static int maxDistinctElements(int[] nums, int k) {

        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i : nums) {
            set.add(i);
        }

        for(int i= (-k); i<k; i++) {
            set.add(i);
        }

        return set.size();

    }

    public static void main(String[] args) {

        int[] nums = {4,4,4,4};

        System.out.println(maxDistinctElements(nums, 1));
    }
}
