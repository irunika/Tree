package tree;

/**
 *
 * @author Irunika Weeraratne
 * @version 1.0
 * @param <T>
 * 
 */
public class TreeNode<T extends Comparable>{
    
    public T key;
    public TreeNode left , right;
    
    public TreeNode(T key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

   
    
    
}
