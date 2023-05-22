package BinaryTree;


 public class MaxValueInBinaryTree {

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
        TreeNode first= new TreeNode(25);
        TreeNode sec= new TreeNode(15);
        TreeNode third= new TreeNode(20);
        TreeNode fourth= new TreeNode(10);
        TreeNode fifth= new TreeNode(22);
        TreeNode six= new TreeNode(35);
        TreeNode sev= new TreeNode(70);
        TreeNode ate= new TreeNode(4);
        TreeNode nine= new TreeNode(12);
        TreeNode ten= new TreeNode(18);
        TreeNode elv= new TreeNode(24);
        TreeNode twelve= new TreeNode(31);
        TreeNode thirteen= new TreeNode(44);
        TreeNode fourteen= new TreeNode(66);
        TreeNode fiftheen= new TreeNode(90);


        root=first; //first node as the root
        first.left=sec; // set left of first node as second node
        first.right=third; //set right of the first node as the third node

        //joining other nodes of the tree in the similar way
        sec.left=fourth;
        sec.right=fifth;

        third.left=six;
        third.right=sev;

        fourth.left=ate;
        fourth.right=nine;

        fifth.left= ten;
        fifth.right=elv;

        six.left=twelve;
        six.right=thirteen;

        sev.left=fourteen;
        sev.right=fiftheen;




    }


    //this is a recursive approach, we will first check the left subtree then the right subtree
    // at each node we will compare values of left subtree and right subtree with the parent node
    //if left value is more then the parent we will rewrite value of result  as lefts value
    //on moving forward if we encounter rights value to be more then the left then we wil rewrite and pass on the max value to the parent call


    //this is similar to preorder traversal where we first visit root node print it , then left node and lastly right node
    public int findmax(TreeNode node){

      if(node==null){
        //if null is reached that is terminating condition return min value of integer
        return Integer.MIN_VALUE;
      }
      int result= node.data; //store parents data to compare
      int leftres=findmax(node.left); //explore left tree
      int rightres= findmax(node.right);//ecplore right tree
      if(result<leftres){
        result=leftres; //check value of left tree
      }
      if(result<rightres){
        result=rightres; //check value of right tree 
      }

      return result; //return which is max left right or unchanged




    }


    public static void main(String[] args) {
        MaxValueInBinaryTree binaryTree= new MaxValueInBinaryTree();
        binaryTree.createbinarytree();
        System.out.println("Created a Binary Tree");
        System.out.println("The max value of the binary tree is: "+binaryTree.findmax(binaryTree.root));
        
    }

    

    
 }