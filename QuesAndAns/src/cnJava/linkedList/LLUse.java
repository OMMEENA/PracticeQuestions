package cnJava.linkedList;

public class LLUse {
    Node head;
    private int size;

    LLUse() {

        this.size = 0;
    }

    class Node<T> {
        T data;
        Node<T> next;
        Node<T> head;

        Node(T data) {
//            this.head = null;
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public static void main(String[] args) {
        LLUse list = new LLUse();
        list.addFirst("MY");
        list.addFirst("name");
//        list.deleteFirst();
        list.addLast("Om");
        list.printList();

        System.out.println(list.getSize());
    }

    //add - first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

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

    //Delete first
    public void deleteFirst(){
        if (head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    // delete last
    public void deleteLast(){
        if (head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        if(head.next  == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastnode = head.next;
        while (lastnode.next != null){
            lastnode = lastnode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }
}

