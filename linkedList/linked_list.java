import javax.swing.plaf.basic.BasicTreeUI;
import java.io.StringReader;
import java.util.LinkedList;

class linked_list
{
    Node head;
    private int size;
    linked_list()
    {
        this.size=0;
    }

    class Node<T>
        {
//            T data;

            String data;
            Node next;  //reference variable
            Node(String data)
            {
                this.data =  data;
                this.next = null;
                size++;
            }
        }

        //add first
        public void addFirst(String data)
        {
            Node newNode= new Node(data);
            if (head == null)
            {
                head = newNode ;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //add last
        public void addLast(String data)
        {

            Node newNode= new Node(data);
            if (head == null)
            {
                head = newNode;
                return;
            }

            Node currNode = head;
            while (currNode.next != null)
            {
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }

        //print list
    public void printList()
    {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");

    }

    //delete from first
    public void deleteFirst()
    {
        if (head ==null)
        {
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last
    public void deleteLast()
    {
        if (head==null)
        {
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next==null)
        {
            head = null;
            return;
        }

        Node seclast = head;
        Node lastnode = head.next;
        while (lastnode.next != null)
        {
            lastnode=lastnode.next;
            seclast= seclast.next;
        }
        seclast.next=null;
    }

    public static int checkIfPresent(Node head, int desiredElement) {
        Node temp = head;
        while (temp != null) {
            if (temp.data .equals(desiredElement)){
                return 1;
            }
            temp = temp.next;
        }
        return 0;  // Return 0 if the element is not found in the linked list
    }

    public int getSize()
    {
        return size;
    }


//    reversing a linked list
    public void reverseItrate()
    {
        if (head == null || head.next == null)
        {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null)
        {
            Node nextNode =currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next=null;
        head = prevNode;
    }

    public Node reverserecursive(Node head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        Node newHead = reverserecursive(head.next);
        head.next.next=head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args)
    {
//        linked_list list  = new linked_list();
//        list.addFirst("a");
//        list.addFirst("is");
//
//        list.printList();
//
//        list.addLast("linked");
//        list.printList();
//
//        list.addLast("list");
//        list.addFirst("this");
//
//        list.deleteLast();
//        list.printList();
//
//        System.out.println(list.getSize());

        //reversing a linked list
        linked_list list = new linked_list();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.printList();
        System.out.println(list.getSize());

//        list.reverseItrate();
//        list.printList();

//        list.head = list.reverserecursive(list.head);
//        list.printList();









        //all function are already present in java packages in the form  of libraries

//        LinkedList<String> list = new LinkedList<String>();   //empty list has been created using this
//
//        list.addFirst("is");
//        list.addFirst("this");
//        list.addLast("a");
//
//        list.add("list");  //default at the last
//        System.out.println(list);
//
//        System.out.println(list.size());
//
//        for (int i=0;i<list.size();i++)
//        {
//            System.out.print(list.get(i)+" -> ");
//        }
//        System.out.println("null");
//
//        list.removeFirst();
//        list.removeLast();
//
//        list.remove(1);
//        System.out.println(list);

    }

}
