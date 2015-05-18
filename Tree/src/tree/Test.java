/**
 * This is the test program for the Implementation
 */
package tree;

import java.util.Random;

/**
 *
 * @author irunika
 * 
 */


public class Test {
    public static void main(String[] args){
        BinaryTree<Integer> bt = new BinaryTree();
       
        Random rn = new Random();
        
        for(int i=0 ; i<20 ; i++){
            int num = rn.nextInt(100);
            bt.add(num);
            System.out.print(num + " ");
        }
        
        System.out.println("");
        
        bt.inOrder();
       
    }
}
