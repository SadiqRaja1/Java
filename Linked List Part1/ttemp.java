public class ttemp {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // Step1 - create new node
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // Step2 - newNode next = head
        newNode.next = head; // link

        //Step3 - head = newNode
        head = newNode;
    }
    public void addLast(int data) {
        // Step1 - create new node
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // Step2 
        tail.next = newNode;

        //Step3 
        tail = newNode;
    }
    public void print () {
        // if (head == null) {
        //     System.out.println("LL is empty");
        //     return;
        // } // we can remove this line now if ll is empty numm will be printed
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main (String args[]) {
        Print_LinkedList ll = new Print_LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        

    }
}
