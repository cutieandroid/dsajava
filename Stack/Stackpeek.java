package Stack;

public class Stackpeek {

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

    private Stackpeek(){
        //when we will create a stack instance, top will be bydeafault null and length will be bydefault 0
        this.top=null;
        this.length=0;
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

    private int  peek(){ //the peek function peeks into the stack and returns the stack top
        return top.data;
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

        Stackpeek s= new Stackpeek();
        s.push(10);
        
        s.push(15);
        s.push(9);
        s.push(69);

        System.out.println("The content of stack is:");
        s.printStack();
        System.out.println("Element at the peek is : "+s.peek());
       
        
    }
    
}
