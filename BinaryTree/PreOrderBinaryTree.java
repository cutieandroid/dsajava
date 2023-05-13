package BinaryTree;


 public class PreOrderBinaryTree {

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

    public void PreOrder(TreeNode node){

        if(node==null){ //terminating condition
            return;
        }
        System.out.print(node.data+" ");
        PreOrder(node.left);
        PreOrder(node.right);



    }


    public static void main(String[] args) {
        PreOrderBinaryTree binaryTree= new PreOrderBinaryTree();
        binaryTree.createbinarytree();
        System.out.println("Created a Binary Tree");
        binaryTree.PreOrder(binaryTree.root);
    }

    

    
}