class Node {
    int data;
    Node next;
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }
    Node(int data1) {
        data = data1;
        next = null;
    }
}
public class Linked_list_striver_medium {

    //to give the length of loop in a linked list
    public class LinkedListLoopLength {
        static int findLength(Node slow, Node fast) {
            int cnt = 1;
            fast = fast.next;
            while (slow != fast) {
                cnt++;
                fast = fast.next;
            }
            return cnt;
        }
        static int lengthOfLoop(Node head) {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return findLength(slow, fast);
                }
            }

            return 0;
        }

        public static void main(String[] args) {
            Node head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node fourth = new Node(4);
            Node fifth = new Node(5);

            // Create a loop from fifth to second
            head.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            // This creates a loop
            fifth.next = second;

            int loopLength = lengthOfLoop(head);
            if (loopLength > 0) {
                System.out.println("Length of the loop: " + loopLength);
            } else {
                System.out.println("No loop found in the linked list.");
            }
        }
    }

}







  