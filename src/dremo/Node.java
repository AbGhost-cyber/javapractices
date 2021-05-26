package dremo;

public class Node<T> {
    T value = null;
    Node<T> next = null;

    Node(T val, Node<T> next) {
        this.value = val;
        this.next = next;
    }

    Node() {

    }

    Node(T val) {
        this.value = val;
    }

    @Override
    public String toString() {
        if (next != null) {
            return value + "->" + next.toString();
        } else {
            return value.toString();
        }
    }

    public static void main(String[] args) {
        Node<Integer> me = new Node<>();
        Node<Integer> me1 = new Node<>();
        Node<Integer> me2 = new Node<>();
        me.value = 1;
        me1.value = 2;
        me2.value = 3;
        me.next = me1;
        me1.next = me2;

        System.out.println(me);
    }
}

