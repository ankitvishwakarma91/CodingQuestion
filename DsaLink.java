
public class DsaLink {
    class Node {
        Node next;
        String data;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("This is empty List");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }

    public Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

    public static void main(String[] args) {
        DsaLink list = new DsaLink();
        list.addLast("Hello");
        list.addLast("This ");
        list.addLast("is");
        list.addLast("code");

        list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
