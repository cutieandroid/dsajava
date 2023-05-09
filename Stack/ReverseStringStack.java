package Stack;

public class ReverseStringStack {

    //our stack has one element which is stack top and a length to keep track of the length

    private listnode top;
    private int length;


    //we will be implementing stack using linkedlist

    private static class listnode{

        listnode next;
        char data;


        //constructor to assign value to the node as soon as it is created
        private listnode(char data){
            this.data=data;

        }


    }
    private ReverseStringStack(){
        //when we will create a stack instance, top will be bydeafault null and length will be bydefault 0
        this.top=null;
        this.length=0;
    }
    private int getLength(){
        return length;
    }

    private void push(char data){
        listnode newnode= new listnode(data);// create a new listnode
        newnode.next= top;// point the newly created node to the current top
        top=newnode;//make the newly added node as top
        length++;//increment the stack length
    }

    private char pop(){
        char chardata= top.data;
        listnode temp= top; //store top in temp
        top = top.next; // make the next element as the new top
        temp= null; //making temp as null
        length--; // decrementing length
        return chardata;
        
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

        ReverseStringStack s= new ReverseStringStack();
        
        String name= "haagi maaru"; //String that we have to reverse

        char chars[]= name.toCharArray();//convert the string into charachters and store into an array
        

        //push the charachters into a stack
        for(char c: chars){
            s.push(c);
        }
        System.out.println("Stack after pushing the charachters of the string into an array");
        s.printStack();
        
        //pop the charachters from the stack and store into same array
        for(int i=0;i<chars.length;i++){
            chars[i]=s.pop();
            
        }
        System.out.print("The reversed String is:");
        //print the updated array
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]);
        }
        

       


      
        
        

        
    }
    
}
