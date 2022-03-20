/*      Tree - data structures
*
*
*/
package datastructures;
import java.lang.Math;


public class BinaryTree {
    public static class NodeTree{
        int data;
        NodeTree left;
        NodeTree right;

        NodeTree(int data){
            this.data = data;
        }
    }

    /*          Traversal           */
    public void inorderTraversalDF(NodeTree root){
        /* */
        if (root==null){
            return;
        }
        inorderTraversalDF(root.left);
        System.out.println("%d " + root.data);
        inorderTraversalDF(root.right);
    }

    public void preorderTraversalDF(NodeTree root){
        /**/
        if (root==null){
            return;
        }
        System.out.println("%d " + root.data);
        preorderTraversalDF(root.left);
        preorderTraversalDF(root.right);
    }

    public void postorderTraversal(NodeTree root){

    }

    /*          Properties              */
    public int height(NodeTree root){
        if (root==null){
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public int size(NodeTree root){
        if (root==null){
            return 0;
        }
        return 1 + size(root.right) + size(root.left);
    }
}
