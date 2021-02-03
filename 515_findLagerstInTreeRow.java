/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        //binary tree is a recursive structure
        List<Integer> ans = new ArrayList<Integer>();
        largestValues(root,ans,0);
        return ans;
    }
    
    public void largestValues(TreeNode root,List<Integer> ans,int height){
        if(root==null){
            return;
        }
        
        if(height==ans.size()){
            ans.add(root.val);
        }else{
            ans.set(height,Math.max(ans.get(height),root.val));
        }
        
        largestValues(root.left,ans,height+1);
        largestValues(root.right,ans,height+1);
        
        
    }
}