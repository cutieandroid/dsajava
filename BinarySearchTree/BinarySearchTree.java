package BinarySearchTree;


public class BinarySearchTree {

    private TreeNode Root; //root of our bst 

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }


    //if we have to insert a node we will require the root node and the data we want to insert

    private TreeNode insert(TreeNode root, int data){
        //first check if the root is null or not, if it is then create a root
        if(root==null){
            root= new TreeNode(data);
            return root;
        }
        ///if a root already exist, then compare the data
        //if it is less then root's data we need to insert it in the left subtree
        if(data<root.data){

          root.left= insert(root.left, data);
          
        }
        ///if greater then roots data insert in right subtree
        else{
            root.right=insert(root.right,data);

        }
        return root;

    }
    public void PreOrder(TreeNode node){

        //in preorder traversal we first visit the root node
        //then explore the left subtree
        //then explore the right subtree

        if(node==null){ //terminating condition
            return;
        }
        System.out.print(node.data+" "); 
        PreOrder(node.left);
        PreOrder(node.right);



    }

    

public static void main(String[] args) {
    BinarySearchTree bst= new BinarySearchTree();
    bst.Root=bst.insert(bst.Root, 10);
    bst.Root=bst.insert(bst.Root, 8);
    bst.Root=bst.insert(bst.Root, 12);
    System.out.println("The inorder traversal is");
    bst.PreOrder(bst.Root);
}
}
