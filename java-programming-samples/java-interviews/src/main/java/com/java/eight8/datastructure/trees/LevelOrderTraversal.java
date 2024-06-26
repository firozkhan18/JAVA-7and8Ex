package com.java.eight8.datastructure.trees;
class Node3
{
    int data;
    Node3 left, right;
    public Node3(int item)
    {
        data = item;
        left = right = null;
    }
}
 
public class LevelOrderTraversal
{
    // Root of the Binary Tree
    Node3 root;
 
    public LevelOrderTraversal()
    {
        root = null;
    }
 
    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }
 
    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node3 root)
    {
        if (root == null)
           return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
             
            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1); 
        }
    }
 
    /* Print nodes at the given level */
    void printGivenLevel (Node3 root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
     
    /* Driver program to test above functions */
    public static void main(String args[])
    {
       LevelOrderTraversal tree = new LevelOrderTraversal();
       tree.root= new Node3(1);
       tree.root.left= new Node3(2);
       tree.root.right= new Node3(3);
       tree.root.left.left= new Node3(4);
       tree.root.left.right= new Node3(5);
        
       System.out.println("Level order traversal of binary tree is ");
       tree.printLevelOrder();
    }
}