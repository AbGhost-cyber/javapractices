package dremo;

public class MyLinkedList<T> {
    Node<T> head, tail;
    int size = 0;

    //append, insertAt,push

    MyLinkedList<T> push(T value) {
        head = new Node<>(value, head);
        if (tail == null) tail = head;
        size++;
        return this;
    }

    MyLinkedList<T> append(T value) {
        //check if list is empty, then insert in front rather
        if (isEmpty()) push(value);
        //so we get the tail and add update it's next
        tail.next = new Node<>(value);
        //update tail to be it's next;
        tail = tail.next;
        //update size;
        size++;
        return this;
    }

    Node<T> nodeAt(int index) {
        Node<T> currentHead = this.head;
        int currentIndex = 0;
        while (currentHead != null && currentIndex < index) {
            currentHead = currentHead.next;
            currentIndex++;
        }
        return currentHead;
    }

    Boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public String toString() {
        return head.toString();
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.push(1).push(2).
                push(3).push(4);
        System.out.println(linkedList.nodeAt(3).value);
    }
}
