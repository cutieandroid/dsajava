package Stack;

//For a given Integer array. For each element find the next greater element in the give array.
//The next greater element is the first element to the right which is greater then the current element.
//if no such element is found return -1

public class NextGreaterStack {

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

    private NextGreaterStack(){
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

    private int pop(){
        int element= top.data;
        listnode temp= top; //store top in temp
        top = top.next; // make the next element as the new top
        temp= null; //making temp as null
        length--; // decrementing length
        return element;
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

        NextGreaterStack s= new NextGreaterStack();
        int input[]={8,7,3,4,5,1};
        //Push the input array into stack, such that the first element of the array is the intial stack top

        for(int i=input.length-1;i>=0;i--){
            s.push(input[i]);
        }
        System.out.println("Stack after pushing all the elements into the stack");
        s.printStack();

        //now pop each element from the stack and check its value with remaining elements in stack
        for(int i=0;i<input.length;i++){
            int celement= s.pop();
            if(s.length==0){ //if last element is poped then set -1 and stop the loop as the last element wont be having any element to compare
                input[i]=-1;
                break;
            }

            //compare the poped element with every other element present in the stack
            listnode current= s.top;
            while(current !=null){ 
            if(current.data>=celement){
                //if any element is found greater add it into the array and break the loop
                input[i]=current.data;
                break;
            }
            //else set -1 as no greater element is found
            input[i]=-1;   
            current=current.next;
        }   
        }
        

        //print the array
        System.out.println("The output array is:");
        for(int i:input){
            System.out.println(i);
        }

        
        
        
    }
    
}
