package BinaryTree;

import java.util.Stack;

public class IterativeInorder{

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

    private void inorder(TreeNode node)
    //in inorder traversal we first visit the left subtreee
    //then we visit the root node
    //then we visit the right subtree
    
    {
        if(node==null){
            return;
        }
        Stack<TreeNode> s= new Stack<>();
        TreeNode temp= node; //we will keep a pointer to the provided root node
        while(!s.isEmpty() || temp!=null){ //we will check the condition if stack is empty or not
                                           //along with that we will also check if temp is not null
                                           //because stack is empty initially
                                           //and we have to stop the loop online when we have explored 
                                           //right and left of the root node,and this will only happen 
                                           //if the stack is empty and temp is null 
            if(temp!=null) //if temp is not null 
            {
                s.push(temp); //we have to push the temp into the stack
                temp=temp.left; //this means now temp is the root node and we will have to explore its left
                                //untill a null node occurs
            }
            else{
                temp=s.pop(); //if temp is null then pop the stack top , i.e we have explored everything in left now we visit root node which is in stack and remove it 
                System.out.print(temp.data+" "); //print the node
                temp=temp.right; // now make temp as the right of the poped node 

            }
            
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



    public static void main(String[] args) {
        IterativeInorder binaryTree= new IterativeInorder();
        binaryTree.createbinarytree();
        System.out.println("Created a Binary Tree");
        binaryTree.inorder(binaryTree.root);
    }


    
}