package src;

public class main {
    public static void main(String[] args) {
        MyLinkedList lst = new MyLinkedList(1);
        for(int i = 3; i < 10; i+=2) {
            lst.add(i);
        }
        MyLinkedList lst2 = new MyLinkedList(0);
        for(int i = 2; i < 10; i+=2) {
            lst2.add(i);
        }
        lst.printList();
        lst2.printList();
        MyLinkedList srtdLst = new MyLinkedList();
        srtdLst = merge(lst, lst2);
        srtdLst.printList();
        srtdLst.removeItem(5);
        srtdLst.printList();
        srtdLst.insert(5,5);
        srtdLst.printList();
        srtdLst.swap(2,8);
        srtdLst.printList();
    }

    public static MyLinkedList merge(MyLinkedList lst1, MyLinkedList lst2) {

        //merge the two lists by sticking them together
        Node mergeLists = lst1.head;
        while(mergeLists.next != null) {
            mergeLists = mergeLists.next;
        }
        mergeLists.next = lst2.head;
        //return the result
        MyLinkedList result = new MyLinkedList(sortList(lst1.head));
        return result;
    }

    public static Node sortList(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        //implemented mergesort
        Node temp = head;
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = null;

        Node leftSide = sortList(head);
        Node rightSide = sortList(slow);

        return merge(leftSide, rightSide);
    }

    public static Node merge(Node l1, Node l2) {
        Node sortedTemp = new Node(0);
        Node currentNode = sortedTemp;

        while(l1 != null && l2 != null) {
            if(l1.data < l2.data) {
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }
            currentNode = currentNode.next;
        }

        if(l1 != null) {
            currentNode.next = l1;
            l1 = l1.next;
        }

        if(l2 != null) {
           currentNode.next = l2;
           l2 = l2.next;
        }
        return sortedTemp.next;
    }
}
