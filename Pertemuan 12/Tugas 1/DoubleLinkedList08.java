public class DoubleLinkedList08 {
    Node08 head, tail;
    int size;

    public DoubleLinkedList08() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(int no, String nama) {
        if (isEmpty()) {
            head = new Node08(no, nama);
        } else {
            Node08 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node08 newNode08 = new Node08(no, nama);
            current.next = newNode08;
            tail = newNode08;

        }
        size++;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 0) {
            removeLast();
        } else {
            System.out.println(head.nama + " Sudah divaksin");
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            System.out.println(head.nama + " Sudah divaksin");
            head = null;
            tail = null;
            size--;
            return;
        }
        Node08 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void enqueue(int no, String nama) {
        if (isEmpty()) {
            addLast(no, nama);
        } else {
            Node08 newNode08 = new Node08(no, nama);
            tail.next = newNode08;
            newNode08.prev = tail;
            tail = newNode08;
        }
        size++;
    }

    void Dequeue() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node08 removedNode08 = head;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            System.out.println(removedNode08.nama + " Sudah Divasksin");
        }
    }

    public void printQueue() {
        System.out.println("========================================");
        System.out.println(" DAFTAR PENGANTRI VAKSIN ");
        System.out.println("========================================");
        System.out.println(" | No \t | Nama" + " | ");
        if (!isEmpty()) {
            Node08 tmp = head;
            while (tmp != null) {
                System.out.print(" | " + tmp.no + "\t | " + tmp.nama + "\t | ");
                tmp = tmp.next;
            }
            System.out.println("Sisa Antrian " + size);
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
