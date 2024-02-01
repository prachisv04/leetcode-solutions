package top_interview_150;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
	
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> answer = new ArrayList<Double>();
		
		Queue<TreeNode> pq = new LinkedList<>(List.of(root));
		 
		while(pq.size()>0) {
			double level = 0;
			double len = pq.size();
			for(int i=0;i<len;i++) {
				TreeNode temp = pq.poll();
				level += temp.val;
				
				if(temp.left!=null) pq.add(temp.left);
				if(temp.right!=null) pq.add(temp.right);
				
			}
			answer.add(level/len);
		}
		return answer;
    }

}
