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

    public void postorderTraversalDF(NodeTree root){
        /**/
        if (root==null){
            return;
        }
        else{
            postorderTraversalDF(root.left);
            postorderTraversalDF(root.right);
            System.out.println("%d " + root.data);
        }
    }

    public void levelTraversal(NodeTree root){
        /*      Queue implement Breadth First Search*/
        if (root==null){
            return;
        }


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

    public int getMax;

    public static NodeTree createBinaryTree(){

        NodeTree rootNode =new NodeTree(10);
        NodeTree node20=new NodeTree(20);
        NodeTree node30=new NodeTree(30);
        NodeTree node40=new NodeTree(40);
        NodeTree node50=new NodeTree(50);
        NodeTree node60=new NodeTree(60);
        NodeTree node70=new NodeTree(70);
        NodeTree node80=new NodeTree(80);
        NodeTree node90=new NodeTree(90);

        rootNode.left=node20;
        rootNode.right=node30;

        node20.left=node40;
        node20.right=node50;

        node30.left=node60;
        node30.right=node70;

        node70.left=node80;
        node70.right=node90;

        return rootNode;
    }
}
