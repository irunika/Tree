/**
 * This is a implementation of a binary search tree without recursion approach
 */

package tree;

import java.util.Stack;

/**
 *
 * @author Irunika Weeraratne
 * @version 1.0
 * @param <T>
 * 
 */

public class BinaryTree<T extends Comparable>{
    
    private TreeNode root;

    public BinaryTree(T key) {
        root = new TreeNode(key);
    }

    public BinaryTree() {
        this.root = null;
    }
    
    
    
    public void add(T value){
        
        if(root == null){
            root = new TreeNode(value);
            return;
        }
        
        TreeNode curNode = root;
        TreeNode parent = null;
        boolean isLeft = false;
        
        while(curNode != null){
            if(curNode.key.compareTo(value)>0){
                parent = curNode;
                curNode = curNode.left;
                isLeft = true;
            }
            else if(curNode.key.compareTo(value)<0){
                parent = curNode;
                curNode = curNode.right;
                isLeft = false;
            }
            else return;
        }
        
        if(isLeft) parent.left = new TreeNode(value);
        else parent.right = new TreeNode(value);
    }
    
    
    /**
     * Here lets use a stack as the DS for the implementation of traversal
     */
    
    public void inOrder(){
        if(root != null) inOrder(root);
        else System.err.println("Empty tree no elements");
    }
    
    private void inOrder(TreeNode root){
        Stack<TreeNode> stk = new Stack<>();
        
       stk.push(root);
       TreeNode curNode = root.left;
       boolean rightAdded = false; // Check whether a right node is added to the stack
       
       while(!stk.isEmpty()){
          while(curNode != null){
             if(!rightAdded){
                stk.push(curNode);
             }
             curNode = curNode.left;
             rightAdded = false;
          }
          
          curNode = stk.pop();
          System.out.print(curNode.key + " ");
          
          if(curNode.right != null){
              stk.push(curNode.right);
              curNode = curNode.right;
              rightAdded =true;
          }
          else curNode = null;
       }
        
    }
    
}

    
