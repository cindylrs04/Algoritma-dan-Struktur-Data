package Code;

public class DoubleLinkedList08 {

    Node08 head = null;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }
    public void addFisrt(int item, int jarak) {
        if (isEmpty()) {
            head = new Node08(null, item, jarak, null);
        } else {
            Node08 newNode08 = new Node08(null, item, jarak, head);
            head.prev = newNode08;
            head = newNode08;
        }
        size++;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node08 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void updateJarak(int asal, int tujuan, int jarakBaru) {
        try {
            Node08 current = head;
            while (current != null) {
                if (current.data == tujuan) {
                    current.jarak = jarakBaru;
                    System.out.println(
                            "Jarak antara Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan)
                                    + " berhasil diupdate menjadi " + jarakBaru + " meter.");
                    return;
                }
                current = current.next;
            }
            System.out.println("Tidak dapat memperbarui jarak: Gedung " + (char) ('A' + asal)
                    + " tidak terhubung dengan Gedung " + (char) ('A' + tujuan));
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat memperbarui jarak: " + e.getMessage());
        }
    }

    public void remove(int index) {
        Node08 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas.");
        }
        Node08 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }
}
