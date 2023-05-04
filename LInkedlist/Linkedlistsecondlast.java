package LInkedlist;

public class Linkedlistsecondlast {

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

    private listnode secondlast() {

        listnode counter = ghead;
        while (counter.next != gend) { // itereate till the second last node of the list
            counter = counter.next;

        }
        return counter;
    }

    public static void main(String[] args) {

        // creating an object of the Linkedlist class
        Linkedlistsecondlast ll = new Linkedlistsecondlast();

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

        System.out.println("second last node of the lu=ist is :" + ll.secondlast().data);

    }
}
