public class Reverse {
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

    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast (){
        if (size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail= null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i = 0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

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
    }
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp =temp.next;
            i++;
        }
        return-1;
    }
    public int helper(Node head, int key) { // Tc = Sc = O(n)
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
            if (idx == -1) {
                return -1;
            }
            return idx+1;
    }
    public int recSearch(int key) {
        return helper(head, key);

    }
    public void reverse() { // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main (String args[]) {
        Reverse ll = new Reverse();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.reverse();
        ll.print();
        
       



    } 
}
