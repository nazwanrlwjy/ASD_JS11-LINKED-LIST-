public class LinkedList23 {
    Node23 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node23 currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input) {
        Node23 newNode = new Node23(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node23 newNode = new Node23(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node23 currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void insertAt(int index, int key) {
        Node23 newNode = new Node23(key, null);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node23 temp = head;
        int count = 0;
        while (temp != null) {
            if (count == index - 1) {
                break;
            }
            temp = temp.next;
            count++;
        }

        if (count == index - 1) {
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Index tidak valid");
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            if (head.next == null) {
                head = null;
            } else {
                Node23 currentNode = head;

                while (currentNode.next.next != null) {
                    currentNode = currentNode.next;
                }

                currentNode.next = null;
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void remove(int key) {
        if (!isEmpty()) {
            if (head.data == key) {
                removeFirst();
            } else {
                Node23 currentNode = head;

                while (currentNode.next != null) {
                    if (currentNode.next.data == key) {
                        currentNode.next = currentNode.next.next;
                        break;
                    }
                    currentNode = currentNode.next;
                }
            }
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public int getData(int index) {
        Node23 currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public int indexOf(int key) {
        Node23 currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }
}