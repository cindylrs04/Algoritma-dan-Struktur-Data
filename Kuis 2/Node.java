public class Node {
    Team tim;
    Node prev;
    Node next;

    public Node(Team tim) {
        this.tim = tim;
        this.prev = null;
        this.next = null;
    }
}