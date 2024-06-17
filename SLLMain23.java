
public class SLLMain23 {
    public static void main(String[] args) {
        LinkedList23 myLinkedList = new LinkedList23();
        myLinkedList.print();
        myLinkedList.addFirst(800);
        myLinkedList.print();
        myLinkedList.addFirst(700);
        myLinkedList.print();
        myLinkedList.addLast(500);
        myLinkedList.print();
        myLinkedList.insertAt(2, 400);
        myLinkedList.print();
        myLinkedList.insertAt(2, 100);
        myLinkedList.print();

        System.out.println("Data pada index ke-1 " + myLinkedList.getData(1));
        System.out.println("Data 300 berada pada index ke: " + myLinkedList.indexOf(300));

        myLinkedList.remove(300);
        myLinkedList.print();
        myLinkedList.removeFirst();
        myLinkedList.print();
        myLinkedList.removeLast();
        myLinkedList.print();
    }
}