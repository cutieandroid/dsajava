package LInkedlist;
public class Linkedlistrev {

    private listnode ghead; // head of the linked list
    private listnode gend; // tail of the linked list

    public static class listnode { // a static class for nodes of the linked list

        // a node consist of two components := head and the pointer to next node

        private int data;
        private listnode next; // pointer to next node

        private listnode(int data) { // a constructor to assign data and next node as soon as the node object is
                                     // create

            this.data = data;
            this.next = next;

        }

    }

    private void printList() { // function to print the linked list
        listnode current = ghead;

        while (current != null) { // print the data of the linked list while we reach null. linked list's last
                                  // node points to null
            System.out.print(current.data + "---->");
            current = current.next;
        }
        System.out.println("null");

    }

    private void reverse() { // function to reverse the linkedlist
        // 1.To reverse the linked list we wiil have to reverse the original links that
        // we made to each node
        // 2.To do so we will require two more pointers(prev and next) along with the
        // current pointer
        // 3.starting with the first node of our original list we will point it to next
        // as it will be the last node after reversing
        // 4.In the same way in next iteration we will point second node to the first
        // and so on using our prev counter
        listnode current = ghead;
        listnode prev = null;
        listnode next = null;

        while (current != null) {
            next = current.next; // we will store the next node in next pointer
            current.next = prev; // now our current node will point to the previous node
            prev = current;// we will now set our previous node as the current node for the next node
            current = next; // to increment the current pointer to the next nocde we will set it to the next
                            // node. if we dont do this step our main thread will get stuck in a while loop

        }
        // now we will update our global variables ghead and gend for our new reversed
        // list
        gend = ghead;
        current = prev; // prev pointer has the last node of our list so we will take the last node from
                        // there
        ghead = current;
    }

    public static void main(String[] args) {

        // creating an object of the Linkedlist class
        Linkedlistrev ll = new Linkedlistrev();

        // creating nodes using listnode class
        listnode first = new listnode(10);
        listnode second = new listnode(20);
        listnode third = new listnode(30);
        listnode fourth = new listnode(40);

        // connecting all the nodes

        first.next = second;
        second.next = third;
        third.next = fourth;
        ll.ghead = first;
        ll.gend = fourth;

        // printting the linked list

        ll.printList();

        // linked list after reversing
        System.out.println("linked list after reversing");
        ll.reverse();
        ll.printList();

    }

}
