package DoublyLinkedlist;

public class DLinkedlistdelfirst {
     // create global pointers for head, tail and length of thedlinkedlist

     private listnode ghead;
     private listnode gend;
     private int length;

      // a class of listnode consisting different segments of the node like data, prev
    // and next pointers
    private static class listnode {
        private int data;
        listnode next;
        listnode prev;

        private listnode(int data) {
            this.data = data;
        }

    }
     // initialize ghead and tail to null whenever an object of the dlinkedlist
    // class is created
    // also keep length as 0 which means that the list is empty

    private DLinkedlistdelfirst() {
        this.ghead = null;
        this.gend = null;
        this.length = 0;

    }

    private int getlength() {
        return length;
    }

    //function to insert in begining of the doublylinkedlist

    private void insert_beg(int value) {

        listnode newnode = new listnode(value);

        // if length is 0 that is list is empty make the new node as head of the list
        if (length == 0) {
            ghead = newnode;
            gend =newnode;
            length++;
            return;

        }
        // else append the newnode to the tail of the list
        else {
            // make the prev of ghead as the  newnode
            ghead.prev = newnode;
            //make the next of the newnode as the ghead
            newnode.next=ghead;
            // make the newnode as the new ghead
            ghead = newnode;
            // increment length
            length++;

        }
       

    }
    //function to delete first node of a doublylinkedlist
    private void delfirst(){
        if(length==0){
            System.out.println("The list is empty cannot delete the fist node");
            return;
        }
        listnode temp =ghead; //store ghead in temp

        ghead=null; //make current ghead null
        ghead= temp.next; //nmake next node in list as the ghead
        length--; //decrease the length by one
       
        

    }

    private void printList() {
        listnode counter = ghead;
        System.out.print("null<---->");
        while (counter != null) {
            System.out.print(counter.data + "<--->");
            counter = counter.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DLinkedlistdelfirst dl = new DLinkedlistdelfirst();

        dl.insert_beg(10);
        dl.insert_beg(20);
        dl.insert_beg(30);
        dl.insert_beg(40);
        dl.printList();
        System.out.println("Length of the doubly linked list is:" + dl.getlength());
        System.out.println("After deleting first element of the list:");
        dl.delfirst();
        dl.printList();

        System.out.println("After deleting first element of the list:");
        dl.delfirst();
        dl.printList();
        

        System.out.println("After deleting first element of the list:");
        dl.delfirst();
        dl.printList();
        

        System.out.println("After deleting first element of the list:");
        dl.delfirst();
        dl.printList();


        
        System.out.println("After deleting first element of the list:");
        dl.delfirst();
        dl.printList();

        
        
        
        
    }

    
}
