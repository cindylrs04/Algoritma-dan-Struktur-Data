import java.util.Scanner;

public class DoubleLinkedListMain08 {
    public static void menu() {
        System.out.println("========================================");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("========================================");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("========================================");
    }

    public static void main(String[] args) throws Exception {
        try (Scanner sc08 = new Scanner(System.in)) {
            DoubleLinkedList08 dll = new DoubleLinkedList08();

            int pilih;
            do {
                menu();
                pilih = sc08.nextInt();
                sc08.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.println("---------------------------------------");
                        System.out.println("Masukkan Data Penerima Vaksin");
                        System.out.println("---------------------------------------");
                        System.out.println("Nomor Antrian\t: ");
                        int nim = sc08.nextInt();
                        System.out.println("Nama Penerima \t:");
                        String nama = sc08.next();
                        dll.addLast(nim, nama);
                        sc08.nextLine();
                        dll.printQueue();
                        break;

                    case 2:
                        dll.Dequeue();
                        // dll.printQueue();

                    case 3:
                        dll.printQueue();
                        break;

                    case 4:
                        System.exit(0);
                        break;

                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
        }
    }
}
