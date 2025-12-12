package h2;

public class SimpleList {

    private Node head;

    public SimpleList() {
        head = new Node(Integer.MIN_VALUE);
        head.next = null;
    }

    public Node getFirst() {
        if (head.next == null) {
            return null;
        }
        return head.next;
    }

    public Node getLast() {
        if (head.next == null) {
            return null;
        }

        Node current = head.next;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public void append(int newValue) {
        Node newNode = new Node(newValue);

        if (head.next == null) {
            head.next = newNode;
            return;
        }

        Node last = head.next;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public Node findFirst(int value) {
        Node current = head.next;
        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public boolean insertAfter(int preValue, int newValue) {
        Node current = head.next;

        while (current != null) {
            if (current.value == preValue) {
                Node newNode = new Node(newValue);
                newNode.next = current.next;
                current.next = newNode;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean delete(int value) {
        if (head.next == null) {
            return false;
        }

        Node previous = head;
        Node current = head.next;

        while (current != null) {
            if (current.value == value) {
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;
        }

        return false;
    }

    public void printList() {
        Node current = head.next;
        if (current == null) {
            System.out.println("(Liste ist leer)");
            return;
        }

        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
