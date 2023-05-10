package Stack;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class ValidParenthesisStack {

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

    private ValidParenthesisStack(){
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

    private void pop(){
        if(length==0){
            System.out.println("cannot pop element from the stack, the stack is already empty");
            return;      
        }
        listnode temp= top; //store top in temp
        top = top.next; // make the next element as the new top
        temp= null; //making temp as null
        length--; // decrementing length
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

        ValidParenthesisStack s = new ValidParenthesisStack();

        String parenthesis="({)}"; //take the input as a String
        for(char c : parenthesis.toCharArray()){ //iterate the string 
            if(c=='(' || c=='[' || c== '{'){

                s.push(c); //if any opening parenthesis, push it to the stack

            }
            else{
                //if not opening parenthesis then check if top is not null i.e length is not zero
                if(s.length==0){
                    //if it is zero and a closed parenthesis is occuring then it is not a valid string
                    System.out.println("The String is not valid");
                    return;
                }
                //if it is not zero and the stack top is same as the current closing parenthesis then 
                if((c==')' && s.top.data=='(') || (c==']' && s.top.data=='[') || (c== '}' && s.top.data=='{')){

                    s.pop();  //pop the element
                    
                }
                else{
                    //else in any other condition the string is not valid
                    System.out.println("The String is not valid");
                    return;
                }
            }
        }


        //at last check if the stack is empty, if it is then the string is a valid string

        if(s.length==0){
            System.out.println("The String is valid");
        }

       
       
        
    }
    
}
