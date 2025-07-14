class Node2{
    int data;
    Node2 next ;
    Node2 prev;

    Node2(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList_striver {
//    delete all occurrences of a key in dll
    static class DeleteKeyInDLL {
    public Node2 deleteAllOcc(Node2 head, int key) {
        Node2 current = head;
        while (current != null) {
            if (current.data == key) {
                Node2 nextNode = current.next;

                if (current.prev == null) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    current.prev.next = current.next;
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                }
                current = nextNode;
            } else {
                current = current.next;
            }
        }
        return head;
    }


    //find all pairs of given sum in sorted dll

    public void printList(Node2 head) {
        Node2 current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node2 head = new Node2(10);
        Node2 node2 = new Node2(20);
        Node2 node3 = new Node2(10);
        Node2 node4 = new Node2(40);
        Node2 node5 = new Node2(50);

        head.next = node2;
        node2.prev = head;

        node2.next = node3;
        node3.prev = node2;

        node3.next = node4;
        node4.prev = node3;

        node4.next = node5;
        node5.prev = node4;

        DeleteKeyInDLL solution = new DeleteKeyInDLL();
        System.out.println("Original list: ");
        solution.printList(head);

        head = solution.deleteAllOcc(head, 10);
        System.out.println("Modified list: ");
        solution.printList(head);
    }
}
}
