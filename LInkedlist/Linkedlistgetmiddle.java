package LInkedlist;
public class Linkedlistgetmiddle {

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

    private listnode middlenode() {
        listnode slowpointer = ghead; // slowpointer which only moves one position
        listnode fastpointer = ghead; // fast pointer which mover two position

        // we will move fast pointer by two pos as long as it is not null or the next of
        // it is not null (to avoid null pointer exception).
        // when fast pointer moves two position ,slow will move only one, this will
        // result in while loop to iterate only half of the length of whole linkedlist
        // and ultimately the slowpointer will be at our desired middle postition

        while (fastpointer != null && fastpointer.next != null) {
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next.next;
        }
        return slowpointer;
    }

    public static void main(String[] args) {

        // creating an object of the Linkedlist class
        Linkedlistgetmiddle ll = new Linkedlistgetmiddle();

        // creating nodes using listnode class
        listnode first = new listnode(10);
        listnode second = new listnode(20);
        listnode third = new listnode(30);
        listnode fourth = new listnode(40);
        listnode fifth = new listnode(50);

        // connecting all the nodes

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next=fifth;
        ll.ghead = first;
        ll.gend = fifth;

        // printting the linked list

        ll.printList();
        System.out.println("The middle node is:" + ll.middlenode().data);

    }

}
