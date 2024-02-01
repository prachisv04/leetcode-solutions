package top_interview_150;

public class ArrayToBST {
	
	 private TreeNode CreateNode(int[] nums,int l,int r){

	        if(l>r){
	            return null;
	        }

	        int mid = (l+r)/2;
	        TreeNode root = new TreeNode(nums[mid]);

	        root.left = CreateNode(nums, l, mid-1);
	        root.right = CreateNode(nums, mid+1, r);

	        return root;
	    }
	    public TreeNode sortedArrayToBST(int[] nums) {
	         return CreateNode(nums, 0, nums.length-1);
	    }

}
