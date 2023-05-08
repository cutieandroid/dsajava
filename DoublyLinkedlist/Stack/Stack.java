package DoublyLinkedlist.Stack;

public class Stack {

    //our stack has one element which is stack top and a length to keep track of the length

    private listnode top;
    private int length;


    //we will be implementing stack using linkedlist

    private static class listnode{

        listnode next;
        int data;


        //constructor to assign value to the node as soon as it is created
        private listnode(int data){
            this.data=data;

        }


    }
    private int getLength(){
        return length;
    }

    private void push(int data){
        listnode newnode= new listnode(data);// create a new listnode
        newnode.next= top;// point the newly created node to the current top
        top=newnode;//make the newly added node as top
        length++;//increment the stack length
    }
    
    private Stack(){
        //when we will create a stack instance, top will be bydeafault null and length will be bydefault 0
        this.top=null;
        this.length=0;
    }
    private void printStack(){
        listnode current= top;
    
        while(current !=null){ //print the data of the linked list while we reach null. linked list's last node points to null
            System.out.print(current.data+"---->");
            current=current.next;
        }
        System.out.println("null");

    }


    public static void main(String[] args) {

        Stack s= new Stack();
        s.push(10);
        s.printStack();
        s.push(15);
        s.printStack();
        
    }
    
}
