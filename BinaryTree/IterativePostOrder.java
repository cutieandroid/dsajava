package BinaryTree;

import java.util.Stack;

public class IterativePostOrder{

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

   private void PostOrder(TreeNode node){
    //explore left then explore right then visit root

    if(node==null){ //if given node is null return
        return;
    } 
    //create a stack to store nodes
    Stack<TreeNode> s= new Stack<>();
    TreeNode temp = node; //temp node to keep track of nodes 
    while(!s.isEmpty() || temp!=null){
        if(temp!=null){ //if temp is not null then push into stack
           s.push(temp);
           temp=temp.left; //as we  are exploring left first, traverse all left
            }

            //if after traversing to left , null occurs then it is a terminating condition for that expansion
           
        else{
            TreeNode current=s.peek().right; //if left is null then check for the right subtree, is it also null
            if(current==null){
             current=s.pop(); //if it is then pop the current stack top, current stack top is the root node of these two null nodes
             System.out.print(current.data+" ");

             //check if the poped node is to the right or left of a root node
             //if it was a right node, this means we visited left abd now poped a right node, so now the time  is to visit thier root node
             while(!s.empty() && current==s.peek().right){ //we are using a while loop because there are chances that the root node we removed in the below while loop may be was to the right of some other root node, so we used a while loop
                current=s.pop(); //if it was a right node pop the current stak top i.e thier parent
                System.out.print(current.data+" ");
             }
                 
            }
            else{
                temp=current;
            }
            
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
        IterativePostOrder binaryTree= new IterativePostOrder();
        binaryTree.createbinarytree();
        System.out.println("Created a Binary Tree");
        binaryTree.PostOrder(binaryTree.root);
    }


    
}