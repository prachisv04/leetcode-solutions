package top_interview_150;

public class CountTreeNode {
	  public int getCount(TreeNode root){
	        if(root==null) return 1;
	        return (getCount(root.left) + getCount(root.right));
	    }
	    public int countNodes(TreeNode root) {
	        int count = getCount(root);
	       return count-1;
	    }
}
