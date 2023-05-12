package BinaryTree;


 public class BinaryTree {

    private TreeNode root;

    private  class TreeNode{  
        //a binary tree has a left and right node along with data
        
        private int data;
        private TreeNode left;
        private TreeNode right;



        public  TreeNode(int data){
        this.data=data;

    }
    }

    public void createbinarytree(){
        TreeNode first= new TreeNode(20);
        TreeNode sec= new TreeNode(21);
        TreeNode third= new TreeNode(22);

        root=first; //first node as the root
        first.left=sec; // set left of first node as second node
        first.right=third; //set right of the firs node as the third node

    }

    public static void main(String[] args) {
        BinaryTree binaryTree= new BinaryTree();
        binaryTree.createbinarytree();
        System.out.println("Created a Binary Tree");
    }

    

    
}