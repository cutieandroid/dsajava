package LInkedlist;

import javax.swing.text.Position;

public class Linkedlistinsertatpos {
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

    private void insertatpos(int data, int pos) {
        if (pos == 1) {
            insertbeg(data);
            return;
        }

        listnode currentpointer = ghead;
        int poscounter = 1;

        while (poscounter < pos - 1) { // reach till the immediate prev position of the targetr position
            currentpointer = currentpointer.next;
            poscounter++;

        }
        listnode prevnode = currentpointer; // prev node as the node at position immediate prev
        listnode nextnode = currentpointer.next; // next node as the node at current target position
        listnode newnode = new listnode(data); // create new node
        prevnode.next = newnode;// point the prev node to the newly created node
        newnode.next = nextnode;// point the new node to the next node

    }

    private void insertbeg(int data) {

        listnode newnode = new listnode(0); // create a node
        newnode.next = ghead; // point the next of the node to the current head of the list
        ghead = newnode; // make the new node as the head of the list
    }

    public static void main(String[] args) {

        // creating an object of the Linkedlist class
        Linkedlistinsertatpos ll = new Linkedlistinsertatpos();

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
        ll.insertatpos(15, 5);
        System.out.println("list after inserting a new node at given position:");
        ll.printList();

    }
}
