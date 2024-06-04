public class Palindrome {
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
    public void deleteNthfromEnd(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp =temp.next;
            sz++;
        }
        if(n == sz) {
            head = head.next;
            return;
        }
        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    // Slow-Fast Approach
    public Node findMid(Node head) { // helper fuction
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is my midNode
    }
    public boolean checkpalindrome() {
        if (head == null || head.next == null ){
            return true;
        }
        // step 1  - find mid
        Node midNode = findMid(head);
        // step 2 - reverse 2nd Half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next =curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }
        Node right= prev;// right half head
        Node left = head;
        // step 3 - Compare 1st (Left) half with 2nd Half (Right)
        while(right!= null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main (String args[]) {
        Palindrome ll = new Palindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print(); // 1->2->2->1
        System.out.println(ll.checkpalindrome());

        
    } 
}
