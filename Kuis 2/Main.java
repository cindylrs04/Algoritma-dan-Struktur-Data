import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList daftarTim = new DoubleLinkedList();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan klub ke dalam daftar
        String[] namaTimArray = {
            "Prawira Harum Bandung", "Satria Muda Pertamina Jakarta", "Pelita Jaya Jakarta",
            "Dewa United Banten", "RANS PIK Basketball Club", "Bima Perkasa Jogja",
            "Bali United Basketball", "Bumi Borneo Basketball Pontianak", "Tangerang Hawks Basketball",
            "Indonesia Patriots", "Amartha Hangtuah Jakarta", "Evos Thunder Bogor",
            "West Bandits Solo", "Mountain Gold Timika", "Elang Pacific Caesar Surabaya",
            "Satya Wacana Salatiga"
        };

        for (String nama : namaTimArray) {
            daftarTim.tambahTim(new Team(nama));
        }

        // Input hasil pertandingan
        String tim1, tim2, hasil;
        boolean selesai = false;

        while (!selesai) {
            System.out.println("\nMasukkan hasil pertandingan (Format: [Tim1] [Tim2] [W/L]): ");
            System.out.println("Contoh: \"Prawira Harum Bandung Satria Muda Pertamina Jakarta W\"");
            System.out.println("Ketik 'klasemen' menampilkan klasemen.");
            System.out.println("Ketik 'riwayat' untuk menampilkan riwayat pertandingan.");
            System.out.println("Ketik 'keluar' untuk keluar.");

            tim1 = scanner.next();
            if (tim1.equalsIgnoreCase("klasemen")) {
                daftarTim.urutkanTim();
                System.out.println("\nKlasemen IBL:");
                daftarTim.cetakKlasemen();
                continue;
            } else if (tim1.equalsIgnoreCase("riwayat")) {
                daftarTim.cetakRiwayatPertandingan();
                continue;
            } else if (tim1.equalsIgnoreCase("keluar")) {
                selesai = true;
                continue;
            }
            tim2 = scanner.next();
            hasil = scanner.next();

            Team timA = daftarTim.cariTim(tim1);
            Team timB = daftarTim.cariTim(tim2);

            if (timA != null && timB != null) {
                if (hasil.equalsIgnoreCase("W")) {
                    timA.catatPertandingan(true);
                    timB.catatPertandingan(false);
                    daftarTim.tambahPertandingan(tim1, tim2, "W");
                } else if (hasil.equalsIgnoreCase("L")) {
                    timA.catatPertandingan(false);
                    timB.catatPertandingan(true);
                    daftarTim.tambahPertandingan(tim1, tim2, "L");
                } else {
                    System.out.println("Hasil tidak valid. Gunakan 'W' untuk menang atau 'L' untuk kalah.");
                }
            } else {
                System.out.println("Nama tim tidak ditemukan. Pastikan memasukkan nama tim dengan benar.");
            }
        }

        // Mengurutkan dan menampilkan klasemen
        daftarTim.urutkanTim();
        System.out.println("\nKlasemen IBL:");
        daftarTim.cetakKlasemen();
    }
}