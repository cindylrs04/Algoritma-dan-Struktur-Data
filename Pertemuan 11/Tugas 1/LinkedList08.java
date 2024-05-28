public class LinkedList08 {
    Mahasiswa08 head;

    public LinkedList08() {
        this.head = null;
    }

    void addFirst(int NIM, String Nama) {
        Mahasiswa08 input = new Mahasiswa08(NIM, Nama);
        input.next = head;
        head = input;
    }

    void addLast(int NIM, String Nama) {
        Mahasiswa08 input = new Mahasiswa08(NIM, Nama);
        if (head == null) {
            head = input;
            return;
        }
        Mahasiswa08 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = input;
    }

    public void insertAfter(int key, int NIM, String Nama) {
        Mahasiswa08 input = new Mahasiswa08(NIM, Nama);
        Mahasiswa08 temp = head;
        while (temp != null && temp.NIM != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Data dengan NIM " + key + " tidak ditemukan.");
            return;
        }
        input.next = temp.next;
        temp.next = input;
    }

    public void insertAt(int posisi, int NIM, String Nama) {
        if (posisi < 0) {
            System.out.println("Posisi tidak boleh negatif!");
            return;
        }
        if (posisi == 0) {
            addFirst(NIM, Nama);
            return;
        }
        Mahasiswa08 input = new Mahasiswa08(NIM, Nama);
        Mahasiswa08 temp = head;
        for (int i = 0; i < posisi - 1; i++) {
            if (temp == null) {
                System.out.println("Posisi melebihi panjang linked list!");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Posisi melebihi panjang linked list!");
            return;
        }
        input.next = temp.next;
        temp.next = input;
    }

    public void print() {
        Mahasiswa08 temp = head;
        System.out.println("Isi Linked List:");
        while (temp != null) {
            System.out.println("NIM: " + temp.NIM + ", Nama: " + temp.Nama);
            temp = temp.next;
        }
        System.out.println();
    }
}
