package LInkedlist;
public class Linkedlistdelatpos {

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

    private void printlist() { // function to print the linked list
        listnode current = ghead;

        while (current != null) { // print the data of the linked list while we reach null. linked list's last
                                  // node points to null
            System.out.print(current.data + "---->");
            current = current.next;
        }
        System.out.println("null");

    }

    private void deleteatpos(int position) {
        if (position == 1) {
            deletefirst();
            return;

        }
        int counter = 1; // create a counter to have controlw of while loop
        listnode prev; // previous that points at the immediate previous node, with respect to the node
                       // that is to be deleted
        listnode current = ghead; // current node as head node
        listnode next; // points to the immediate next node of the node which is to be deleted

        // run a while loop to get to the node which is to the immediate previous of the
        // target node
        while (counter < position - 1) {
            current = current.next;
            counter++;

        }
        prev = current; // assign previous node
        current = current.next; // assign target node
        next = current.next; // assign immediate next of the target node
        prev.next = next; // link the prev node with the next node removing the target node
        // dettach and delete the target node
        current.next = null;
        current = null;

    }

    private void deletefirst() {
        if (ghead == null) {
            System.out.println("your linked list is already empty");
            return;
        }
        listnode temp = ghead;// we will first store our current first node in a temp node
        ghead = ghead.next;

        // detaching and deleting the previously first node
        temp.next = null;
        temp = null;

    }

    public static void main(String[] args) {

        // creating an object of the Linkedlist class
        Linkedlistdelatpos ll = new Linkedlistdelatpos();

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

        ll.printlist();
        System.out.println("After deleting at a given postion");
        ll.deleteatpos(1);
        ll.printlist();

    }

}
