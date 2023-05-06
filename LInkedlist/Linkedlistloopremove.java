package LInkedlist;

public class Linkedlistloopremove {
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

    private void loop_detector() {
        // point both fast and slowpointer to head
        listnode slowpointer = ghead;
        listnode fastpointer = ghead;
        // fasatpointer moves two steps, slow moves one, if there is a loop inside the
        // list they will meet once in their lifetime :)
        while (fastpointer != null && fastpointer.next != null) {
            fastpointer = fastpointer.next.next;
            slowpointer = slowpointer.next;
            if (slowpointer == fastpointer) {

                loopremover(slowpointer); // call loopremover to remove the loop

            }
        }

    }

    private void loopremover(listnode slowpointer) {
        listnode counter = ghead;
        listnode temp = null;
        // iterate temp as well as slowpointer , the poistion they meet is the loop
        // start
        while (counter != slowpointer) {
            temp = slowpointer; // keep track of the previous node using temp node . The previous node is
                                // immediate previous to the loop start node
            slowpointer = slowpointer.next;
            counter = counter.next;

        }
        temp.next = null; // then we will point that immediate previous node to null so that it will
                          // break the loop

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

    public static void main(String[] args) {

        // creating an object of the Linkedlist class
        Linkedlistloopremove ll = new Linkedlistloopremove();

        // creating nodes using listnode class
        listnode first = new listnode(10);
        listnode second = new listnode(20);
        listnode third = new listnode(30);
        listnode fourth = new listnode(40);
        listnode fifth = new listnode(50);
        listnode sixth = new listnode(60);

        // connecting all the nodes to form loop

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = second;
        ll.ghead = first;
        // we wont be having gend as the linked list with loop cannot have ending node
        // ll.gend = fifth;

        System.out.println("the list after removing the loop is:");
        ll.loop_detector();
        ll.printList(); // use the printlist function to cross check if the loop has been removed if the
                        // loop is not removed then printlist function will go into infinite loop

    }

}
