package Tree.BST;

public class Convert_Sorted_Array_to_BST {
    static TreeNode helper(int[] nums, int left, int right){
        if( left > right) {
            return null;
        }
        int mid = left + (right - left)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, left, mid-1);
        node.right = helper(nums, mid+1, right);
        return node;
    }
    static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length);
    }
}
