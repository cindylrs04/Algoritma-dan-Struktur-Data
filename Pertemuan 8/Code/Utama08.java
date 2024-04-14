package Code;

import java.util.Scanner;

public class Utama08 {
    public static void main(String[] args) {
        Gudang08 gudang = new Gudang08(7);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kapasitas gudang : ");
        int kapasitas = scanner.nextInt();
        scanner.nextLine();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi:");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = scanner.nextLine();
                    Barang08 barangBaru = new Barang08(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
            
                case 2:
                    gudang.ambilBarang08();
                    break;

                case 3:
                    gudang.lihatBarangTeratas();
                    break;

                case 4:
                    gudang.lihatBarangTerbawah();
                    break;

                case 5:
                System.out.print("Masukkan kode barang : ");
                kode = scanner.nextInt();
                scanner.nextLine();
                Barang08 barangDitemukan = gudang.cariBarangKode(kode);
                if (barangDitemukan != null) {
                    System.out.println("Barang dengan kode " + kode + "ditemukan : " + barangDitemukan.nama);
                } else {
                    System.out.println("Barang dengan kode " + kode + "tidak ditemukan.");
                }
                break;

                case 6:
                System.out.print("Masukkan nama barang : ");
                nama = scanner.nextLine();
                barangDitemukan = gudang.cariBarangNama(nama);
                if (barangDitemukan != null) {
                    System.out.println("Barang dengan nama " + nama + "ditemukan : " + barangDitemukan.nama);
                } else {
                    System.out.println("Barang dengan nama " + nama + "tidak ditemukan.");
                }
                break;

                case 7:
                    gudang.tampilkanBarang();
                
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}
