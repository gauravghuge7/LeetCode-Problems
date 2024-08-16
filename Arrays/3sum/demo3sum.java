import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class demo3sum {
   public List<List<Integer>> threeSum(int[] nums) {
       
       int n = nums.length;

       List<List<Integer>> ans = new ArrayList()<>();

       Arrays.sort(nums);
       
       

       
       
       for(int i=0; i<n; i++) {

           for(int j=i+1; j<n; j++) {

               for(int k = j+1; k<n; k++) {

                   if(nums[i] + nums[j] + nums[k] == 0) {

                       List<Integer> temp = new ArrayList<>();
                       temp.add(nums[i]);
                       temp.add(nums[j]);
                       temp.add(nums[k]);

                       ans.add(temp);

                   }

               }
           }
       }



     
       
       return ans;
   }
}