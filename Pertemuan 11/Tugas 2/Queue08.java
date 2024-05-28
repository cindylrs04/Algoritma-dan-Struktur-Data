public class Queue08 {
    MahasiswaQueue08 front, rear;

    Queue08() {
        this.front = this.rear = null;
    }

    void enqueue(int NIM, String nama) {
        MahasiswaQueue08 newNode = new MahasiswaQueue08(NIM, nama);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    MahasiswaQueue08 dequeue() {
        if (this.front == null)
            return null;
        MahasiswaQueue08 temp = this.front;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
        return temp;
    }

    void printQueue() {
        MahasiswaQueue08 current = front;
        while (current != null) {
            System.out.println("NIM: " + current.NIM + ", Nama: " + current.nama);
            current = current.next;
        }
    }
}
