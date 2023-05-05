package LInkedlist;

public class Linkedlistloopstart {
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

    private int loop_detector() {
        // point both fast and slowpointer to head
        listnode slowpointer = ghead;
        listnode fastpointer = ghead;
        // fasatpointer moves two steps, slow moves one, if there is a loop inside the
        // list they will meet once in their lifetime :)
        while (fastpointer != null && fastpointer.next != null) {
            fastpointer = fastpointer.next.next;
            slowpointer = slowpointer.next;
            if (slowpointer == fastpointer) {

                int pos = loopstart(slowpointer);
                return pos;

            }
        }
        return 0;

    }

    private int loopstart(listnode slowpointer) {
        listnode temp = ghead;
        int pos = 1;
        // iterate temp as well as slowpointer , the poistion they meet is the loop
        // start
        while (temp != slowpointer) {
            slowpointer = slowpointer.next;
            temp = temp.next;
            pos++;
        }
        return pos;

    }

    public static void main(String[] args) {

        // creating an object of the Linkedlist class
        Linkedlistloopstart ll = new Linkedlistloopstart();

        // creating nodes using listnode class
        listnode first = new listnode(10);
        listnode second = new listnode(20);
        listnode third = new listnode(30);
        listnode fourth = new listnode(40);
        listnode fifth = new listnode(50);

        // connecting all the nodes to form loop

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = second;
        ll.ghead = first;
        // we wont be having gend as the linked list with loop cannot have ending node
        // ll.gend = fifth;

        System.out.println("The list contains a loop start  at position:" + ll.loop_detector());

    }

}
