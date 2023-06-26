package BinarySearchTree;

public class SearchInBst {
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
    private static TreeNode searchinbst(TreeNode root, int key){
        if(root==null || root.data==key){
            return root;
        }
        if(key<root.data){
            return searchinbst(root.left, key);
        }
        else {
            return searchinbst(root.right, key);
        }

    }

     public static void main(String[] args) {
    SearchInBst bst= new SearchInBst();
    bst.Root=bst.insert(bst.Root, 5);
    bst.Root=bst.insert(bst.Root, 3);
    bst.Root=bst.insert(bst.Root, 7);
    bst.Root=bst.insert(bst.Root, 1);
    if(searchinbst(bst.Root, 10)==null){
        System.out.println("Key not found in the treee");

    }
    else{
        System.out.println("key found in the tree");
    }
    

    

    
    
}
    
}
