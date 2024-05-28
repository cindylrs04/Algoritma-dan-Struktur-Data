public class MahasiswaMain08 {
    public static void main(String[] args) {
        LinkedList08 linkedList = new LinkedList08();

        linkedList.addFirst(111, "Anton");
        linkedList.addLast(112, "Prita");
        linkedList.insertAfter(112, 113, "Yusuf");
        linkedList.insertAfter(113, 114, "Doni");
        linkedList.insertAt(4, 115, "Sari");

        linkedList.print();
    }
}
