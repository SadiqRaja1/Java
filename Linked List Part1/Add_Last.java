public class Add_Last {
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

    public static void main (String args[]) {
        Add_Last ll = new Add_Last();
        ll.addLast(3);
        ll.addLast(4);
    }  
}
