package LInkedlist;

import javax.swing.plaf.ColorUIResource;

public class Linkedlistdelkey {

    private listnode ghead; //head of the linked list
        private listnode gend; //tail of the linked list
     
     
     
        public static class listnode{  // a static class for nodes of the linked list
     
         // a node consist of two components := head and the pointer to next node
     
         private int data;
         private listnode next; //pointer to next node
     
         private listnode(int data){ //a constructor to assign data and next node as soon as the node object is create
     
             this.data=data;
             this.next=next;
     
         }

        }
     
        private void printList(){ //function to print the linked list 
         listnode current= ghead;
         
         while(current !=null){ //print the data of the linked list while we reach null. linked list's last node points to null
             System.out.print(current.data+"---->");
             current=current.next;
         }
         System.out.println("null");
     
        }

        private void del_key(int data){
            listnode current= ghead;
            listnode temp = null; //create the temp node to keep track of the recent visited node
            //initiate while loop which checks if the node is null and the data is matched
            while(current!=null && current.data!=data){
                temp=current;
                current=current.next;
            }

            //if temp node is null that means the data is less then the first node so first node gets deleted if the data matches

            if(temp==null && ghead.data==data){
                ghead=current.next;
                current.next=null;
                current=null;
            }
            //else if current is null that is full list is iterated but key hasnt been found then 
            else if(current==null){
                System.out.println("the given key is not present in the list");
            }
            // else del the key 
            else{
            temp.next=current.next;
            current.next=null;
            current=null;
            }
        }
    public static void main(String[] args) {
         
        //creating an object of the Linkedlist class
        Linkedlistdelkey ll= new Linkedlistdelkey();
    
        //creating nodes using listnode class
        listnode first= new listnode(10);
        listnode second= new listnode(20);
        listnode third = new listnode(30);
        listnode fourth = new listnode(40);
    
        //connecting all the nodes
    
        first.next= second;
        second.next= third;
        third.next= fourth;
        ll.ghead=first;
        ll.gend= fourth;
    
    
        //printting the linked list
    
        ll.printList();
        ll.del_key(340);
        System.out.println("list after deleting the given key:");
        ll.printList();
    
}
}
