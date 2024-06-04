public class Sizell {
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
    public static int size;

    public void addFirst(int data) {
        
        // Step1 - create new node
        Node newNode = new Node(data);
        size++;
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
        size++;
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
    public void addMiddle(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0 ;

        while(i<idx-1) {
            temp = temp.next;
            i++;
        }
        // i = idx-1 temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main (String args []) {
        Sizell ll = new Sizell();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMiddle(2, 3);

        ll.print();
        System.out.println(ll.size);
    }
}
