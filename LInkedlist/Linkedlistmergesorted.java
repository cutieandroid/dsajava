package LInkedlist;

public class Linkedlistmergesorted {
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

    private static void merge_list(listnode a, listnode b) { // take both the list as argument
        listnode dummynode = new listnode(0); // initialize a dummy node which represents start of the result list to
                                              // avoid null pointer
        listnode result_list = dummynode; // start node of result list as dummy node
        // start a while loop and compare the data of both the list one by one and stop
        // if any of the list comes to end
        while (a != null && b != null) {
            if (a.data <= b.data) { /// attach a's node from a to the result list if a is samller
                result_list.next = a;
                a = a.next;
                
            } else { // else attach the b's node

                result_list.next = b;
                b = b.next;
                

            }
            result_list = result_list.next; // point result list to next node so that the upcoming node will be attached
                                            // to the recently added node
        }
        if (a == null) { // if a list comes to end attach all the remaining b nodes
            result_list.next = b;
        } else { // else attach all the remaining a nodes
            result_list.next = a;
        }
        // print the result list
        System.out.println("the merged sorted list is:");
        listnode current3 = dummynode.next;

        while (current3 != null) { // print the data of the linked list while we reach null. linked list's last
                                   // node points to null
            System.out.print(current3.data + "---->");
            current3 = current3.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {

        // creating first sorted list
        Linkedlistmergesorted ll1 = new Linkedlistmergesorted();
        listnode list1first = new listnode(10);
        listnode list1second = new listnode(20);
        listnode list1third = new listnode(30);
        listnode list1fourth = new listnode(40);

        list1first.next = list1second;
        list1second.next = list1third;
        list1third.next = list1fourth;

        ll1.ghead = list1first;
        ll1.gend = list1fourth;

        /// creating second sorted list
        Linkedlistmergesorted ll2 = new Linkedlistmergesorted();
        listnode list2first = new listnode(12);
        listnode list2second = new listnode(16);
        listnode list2third = new listnode(28);
        listnode list2fourth = new listnode(29);
        listnode list2fifth = new listnode(35);
        listnode list2sixth = new listnode(49);
        listnode list2seventh = new listnode(59);
        listnode list2eight = new listnode(69);

        list2first.next = list2second;
        list2second.next = list2third;
        list2third.next = list2fourth;
        list2fourth.next = list2fifth;
        list2fifth.next = list2sixth;
        list2sixth.next = list2seventh;
        list2seventh.next = list2eight;

        ll2.ghead = list2first;
        ll2.gend = list2eight;

         ll1.printList();
         ll2.printList();
        System.out.println("Executing merge_list function");

        merge_list(list1first, list2first);

    }

}
