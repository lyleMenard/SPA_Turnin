package src;

public class MyLinkedList {

    Node head;

    public MyLinkedList() {
        head = new Node(0);
    }

    public MyLinkedList(int n) {
        head = new Node(n);
    }

    public MyLinkedList(Node h) {
        head = h;
    }

    void add(int k) {
        Node newHead = new Node(k);
        newHead.next = this.head;
        this.head = newHead;
    }

    void removeItem(int index) {
        Node in = this.head;
        if(index == 0) {
            this.head = this.head.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                in = in.next;
            }
            in.next = in.next.next;
        }
    }

    void insert(int k, int index) {
        Node in = this.head;
        for(int i = 0; i < index-1; i++) {
            in = in.next;
        }
        Node ins = new Node(k);
        ins.next = in.next;
        in.next = ins;
    }

    void swap(int index1, int index2) {
        if(index1 == index2) {
            return;
        }
        Node in1 = this.head;
        Node prev1 = null;
        Node in2 = this.head;
        Node prev2 = null;
        for(int i = 0; i < index1; i++) {
            prev1 = in1;
            in1 = in1.next;
        }
        for(int i = 0; i < index2; i++) {
            prev2 = in2;
            in2 = in2.next;
        }
        prev2.next = in1;
        prev1.next = in2;
        Node buffer = in1.next;
        in1.next = in2.next;
        in2.next = buffer;
    }

    void printList() {
        String out = "(";
        Node index = this.head;
        while(index != null) {
            out = out + index.data + ", ";
            index = index.next;
        }
        out = out + ")";
        System.out.println(out);
    }

/*    int getLength() {
        Node index = new Node(0);
        int count = 0;
        while(index != null) {
            count++;
            index = index.next;
        }
        return count;
    }*/
}
