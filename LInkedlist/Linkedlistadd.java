package LInkedlist;

//given two non-empty linkedlists representing two non- negative integers. The digits are stored reverse order, and each of their nodes contains a single digit. Add the two numbers and return sum as a linkedlist.
public class Linkedlistadd {

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

    private static void addlists(listnode a, listnode b) {

        listnode dummy = new listnode(0);
        int carry = 0;
        int ans = 0;
        int x, y = 0;
        listnode result_list = dummy;
        // as the list is in reverse order we will start addition of digits from start
        // of the list, addition will be tradition method addition that we do using
        // carry
        while (a != null || b != null) { // both shouldnt be null
            if (a != null) {
                x = a.data;
            } else {
                x = 0; // if a becomes null before b then consider value of a's node as 0
            }
            if (b != null) {
                y = b.data;
            } else {
                y = 0; // if b becomes null before a then consider value of b's node as 0
            }

            ans = carry + x + y; // ans will be carry + value of a's current node and b's current node
            carry = ans / 10; // if ans is greater then 10 then or equal to 10 value of carry will be 1
            result_list.next = new listnode(ans % 10); // as we only have to add a single digit in node we have to take
                                                       // modulus so that if it is greater then 10 then we will only get
                                                       // one digit
            result_list = result_list.next;

            if (a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }

            if (carry != 0) {
                result_list.next = new listnode(carry); // if we have any carry remaining after the loop is over then
                                                        // add it as it is to the answer
            }

        }

        System.out.println("the new  list is:");
        listnode current = dummy.next;

        while (current != null) { // print the data of the linked list while we reach null. linked list's last
                                  // node points to null
            System.out.print(current.data + "---->");
            current = current.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {

        Linkedlistadd ll1 = new Linkedlistadd();
        /*
         * listnode list1first = new listnode(7);
         * listnode list1second = new listnode(4);
         * listnode list1third = new listnode(9);
         * 
         * list1first.next = list1second;
         * list1second.next = list1third;
         */

        listnode list1first = new listnode(8);
        listnode list1second = new listnode(2);
        listnode list1third = new listnode(5);
        listnode list1fourth = new listnode(1);

        list1first.next = list1second;
        list1second.next = list1third;
        list1third.next = list1fourth;

        ll1.ghead = list1first;
        ll1.gend = list1fourth;

        /// creating second sorted list
        Linkedlistadd ll2 = new Linkedlistadd();

        /*
         * listnode list2first = new listnode(5);
         * listnode list2second = new listnode(6);
         * list2first.next = list2second;
         */

        listnode list2first = new listnode(1);
        listnode list2second = new listnode(6);
        listnode list2third = new listnode(2);
        listnode list2fourth = new listnode(9);
        listnode list2fifth = new listnode(3);
        listnode list2sixth = new listnode(4);
        listnode list2seventh = new listnode(5);
        listnode list2eight = new listnode(8);

        list2first.next = list2second;
        list2second.next = list2third;
        list2third.next = list2fourth;
        list2fourth.next = list2fifth;
        list2fifth.next = list2sixth;
        list2sixth.next = list2seventh;
        list2seventh.next = list2eight;

        ll2.ghead = list2first;
        ll2.gend = list2eight;

        // order is reversed so we have to add 85439261+4528

        ll1.printList();
        ll2.printList();

        addlists(list1first, list2first);

    }

}
