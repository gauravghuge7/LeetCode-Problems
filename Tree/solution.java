class Solution {

    public boolean helper(TreeNode root, int targetSum, int total) {
        if(root == null) {
            
            if(total == targetSum) return true;
            return false;
        }

        total += root.val;

        if(root.left != null && root.right == null) {
            return helper(root, targetSum, total);
        }

        return helper(root.left, targetSum, total) ||
        helper(root.right, targetSum, total);
        
    }
    

    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null) return false;
        int total = 0;
        total+=root.val;

        if(root.left == null && root.right ==null) {
            if(targetSum == total) return true;
        } 
        if(root.left == null || root.right == null) {

            if(root.left != null) {
                
                return helper(root.left, targetSum, total);
            }
            if(root.right != null) {
                return helper(root.right, targetSum, total);
            }
        }


        return helper(root.left, targetSum, total) ||
               helper(root.right, targetSum, total);
    }
}