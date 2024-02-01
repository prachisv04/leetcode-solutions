package top_interview_150;

public class SymmetricTree {
	
	public boolean isSymmetric(TreeNode root) {
        
        return isMirror(root , root);

    }

    public boolean isMirror(TreeNode left , TreeNode right){
        if(left == null && right==null) return true;
        if(left == null || right==null) return false;
        
        return (left.val == right.val) && isMirror(left.left,right.right) && isMirror(left.right,right.left);
    }

}
