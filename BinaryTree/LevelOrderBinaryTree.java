package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderBinaryTree {

    private TreeNode root;

    private class TreeNode {
        // a binary tree has a left and right node along with data

        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;

        }
    }

    public void createbinarytree() {
        TreeNode first = new TreeNode(25);
        TreeNode sec = new TreeNode(15);
        TreeNode third = new TreeNode(20);
        TreeNode fourth = new TreeNode(10);
        TreeNode fifth = new TreeNode(22);
        TreeNode six = new TreeNode(35);
        TreeNode sev = new TreeNode(70);
        TreeNode ate = new TreeNode(4);
        TreeNode nine = new TreeNode(12);
        TreeNode ten = new TreeNode(18);
        TreeNode elv = new TreeNode(24);
        TreeNode twelve = new TreeNode(31);
        TreeNode thirteen = new TreeNode(44);
        TreeNode fourteen = new TreeNode(66);
        TreeNode fiftheen = new TreeNode(90);

        root = first; // first node as the root
        first.left = sec; // set left of first node as second node
        first.right = third; // set right of the first node as the third node

        // joining other nodes of the tree in the similar way
        sec.left = fourth;
        sec.right = fifth;

        third.left = six;
        third.right = sev;

        fourth.left = ate;
        fourth.right = nine;

        fifth.left = ten;
        fifth.right = elv;

        six.left = twelve;
        six.right = thirteen;

        sev.left = fourteen;
        sev.right = fiftheen;

    }

    // start with root node at it to queue then remove it and add the next level
    // nodes that is the recently removed nodes child nodes,as we have implemented
    // queue the new nodes added wil be served after serving current level nodes
    // which were added first

    private void levelorder(TreeNode node) {

        // if given node is null return function
        if (node == null) {
            return;
        }
        // level order traversal traverse all nodes of a level then moves to next level
        // like breadth first traversal
        //we use queue in this method so implement fifo mechanism, as new childs will keep on adding, but we first have to serve the parent nodes
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);// add root node to start with
        while (!q.isEmpty()) { // unless queue is empty do the following
            TreeNode temp = q.remove(); // remove head of queue
            System.out.print(temp.data + " "); // printit
            if (temp.left != null) {
                q.add(temp.left); // add the left child to queue
            }
            if (temp.right != null) {
                q.add(temp.right); // add right child to queue
            }

        }

    }

    public static void main(String[] args) {
        LevelOrderBinaryTree binaryTree = new LevelOrderBinaryTree();
        binaryTree.createbinarytree();
        System.out.println("Created a Binary Tree");
        binaryTree.levelorder(binaryTree.root);
    }

}