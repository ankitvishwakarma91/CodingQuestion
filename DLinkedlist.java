
public class DLinkedlist {
    
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    public void addFirst(String data){
        Node newnNode = new Node(data);
        if( head == null){
            head = newnNode;
            return;
        }

        newnNode.next = head;
        head = newnNode;
    }

    public void LastAdd(String data){
        Node newNodeLast = new Node(data);
        if (head == null){
            head = newNodeLast;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;   
        }

        currNode.next = newNodeLast;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst(){
        
        if (head == null){
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        Node secondlast = head;
        Node lastNode = head.next;
        if(head == null){
            System.out.println("This is a empty list.");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }


        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public static void main(String[] args) {
        DLinkedlist list = new DLinkedlist();
        list.LastAdd("This");
        list.LastAdd("is");
        list.LastAdd("a");
        list.LastAdd("dog");
        
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
    }
}
