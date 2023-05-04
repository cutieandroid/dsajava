package LInkedlist;

public class Sortedlistinsert {

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

    private void insert_in_sorted(int data) {
        listnode current = ghead;
        // iterate the list till the second last element( not last because next of last
        // is null and we cannot comapare data with null node)
        while (current != null && current.next != null) {
            // if the current node data is less then the given data and given data is less
            // then the immediate next node the insert the node in between them
            if (current.data <= data && data <= current.next.data) {
                listnode newnode = new listnode(data);
                listnode innode = current.next;
                current.next = newnode;
                newnode.next = innode;
                return;

            }
            current = current.next;

        }
        // if the if condition is not satisfied that means the data is either less then
        // the first element or greater than the last element
        if (data < ghead.data) {
            listnode newnode = new listnode(data);
            newnode.next = ghead;
            ghead = newnode;
            return;

        } else {
            // for data greater then the last element
            listnode newnode = new listnode(data);
            gend.next = newnode;
            gend = newnode;
        }
    }

    public static void main(String[] args) {

        // creating an object of the Linkedlist class
        Sortedlistinsert ll = new Sortedlistinsert();

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

        // printing the linked list

        ll.printList();
        ll.insert_in_sorted(5);
        System.out.println("new list after adding a new node in a sorted list:");
        ll.printList();

    }
}
