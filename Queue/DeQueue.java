package Queue;

public class DeQueue {

    // we are implementing queue using a linkedlist

    private listnode ghead;
    private listnode gend;
    private int length;

    private static class listnode {

        // model of linked list which has data and pointer to next node

        int data;
        listnode next;

        // constructot to assign data to the node as soon as it is created

        private listnode(int data) {
            this.data = data;
        }

    }

    // constructor of queue class to assign ghead as null and gend as null as well
    // as length as 0 as soon as instance of the class is created

    private DeQueue() {
        this.ghead = null;
        this.gend = null;
        this.length = 0;
    }

    private void enqueue(int data) {
        //queue follows first in first out scheme, so we will add the new nodes to the end of the list
        listnode newnode = new listnode(data);
        if (length == 0) {
            ghead = newnode;
            gend = newnode;
            length++;

        } else {
            gend.next = newnode; // point new node to the end of the current end 
            gend = newnode; //make new node as the new end
            length++;//increment the length
        }


    }

    private void dequeue(){
        if(length==0){
            System.out.println("The queue is empty, cannot dequeue a node");
        }
        else{
            //our first entered node is till at the first, so to use fifo we will remove first node
            listnode temp= ghead; ///create temp to store current ghead
            ghead=null; // make the current ghead null so that ghead is deleted
            ghead=temp.next; //make the next element as ghead
            temp=null; //delete temp 
            length--;//decrement length
        }
    }

  

    private void PrintQueue() {
        listnode current = ghead;

        while (current != null) { // print the data of the linked list while we reach null. linked list's last
                                  // node points to null
            System.out.print(current.data + "---->");
            current = current.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {

        DeQueue q = new DeQueue();
        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.enqueue(15);
        q.PrintQueue();
        q.dequeue();
        q.dequeue();
        q.PrintQueue();
    

    }

}
