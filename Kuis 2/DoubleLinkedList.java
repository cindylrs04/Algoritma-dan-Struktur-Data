public class DoubleLinkedList {
    Node head;
    Node tail;
    MatchNode matchHead;
    MatchNode matchTail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        matchHead = null;
        matchTail = null;
    }

    public void tambahTim(Team tim) {
        Node newNode = new Node(tim);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Team cariTim(String namaTim) {
        Node current = head;
        while (current != null) {
            if (current.tim.namaTim.equalsIgnoreCase(namaTim)) {
                return current.tim;
            }
            current = current.next;
        }
        return null;
    }

    public void urutkanTim() {
        if (head == null) {
            return;
        }
        Node current = head;
        Node index;
        Team temp;

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.tim.poin < index.tim.poin) {
                    temp = current.tim;
                    current.tim = index.tim;
                    index.tim = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    public void cetakKlasemen() {
        System.out.printf("%-35s %2s %6s %6s %6s%n", "NAMA TIM", "MP", "MENANG", "KALAH", "POINTS");
        Node current = head;
        while (current != null) {
            System.out.println(current.tim);
            current = current.next;
        }
    }

    public void tambahPertandingan(String tim1, String tim2, String hasil) {
        Match match = new Match(tim1, tim2, hasil);
        MatchNode newNode = new MatchNode(match);
        if (matchHead == null) {
            matchHead = matchTail = newNode;
        } else {
            matchTail.next = newNode;
            newNode.prev = matchTail;
            matchTail = newNode;
        }
    }

    public void cetakRiwayatPertandingan() {
        System.out.printf("%-35s %-35s %s%n", "TIM 1", "TIM 2", "HASIL");
        MatchNode current = matchHead;
        while (current != null) {
            System.out.println(current.match);
            current = current.next;
        }
    }

    private class Match {
        String tim1;
        String tim2;
        String hasil;

        public Match(String tim1, String tim2, String hasil) {
            this.tim1 = tim1;
            this.tim2 = tim2;
            this.hasil = hasil;
        }

        public String toString() {
            return String.format("%-35s vs %-35s %s", tim1, tim2, hasil);
        }
    }

    private class MatchNode {
        Match match;
        MatchNode prev;
        MatchNode next;

        public MatchNode(Match match) {
            this.match = match;
            this.prev = null;
            this.next = null;
        }
    }
}
