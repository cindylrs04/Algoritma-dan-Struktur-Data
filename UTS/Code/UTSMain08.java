package Code;

import java.util.Scanner;

public class UTSMain08 {
    public static void main(String[] args) {
        int[] angka = {31, 39, 40, 23, 39, 15, 28, 35, 47, 32, 22, 29, 23, 25, 24, 7, 42};

        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih :");
        System.out.println("1. Cari Nilai");
        System.out.println("2. Pengurutan Ascending");
        System.out.println("3. Pengurutan Descending");
        System.out.print("Masukkan pilihan : ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nilai yang dicari: ");
                int nilaiCari = sc.nextInt();
                UTS08.cariNilai(angka, nilaiCari);
                    break;

            case 2:
            UTS08.selectionSortAscending(angka);
            System.out.println("Data setelah pengurutan ascending:");
            for (int i = 0; i < angka.length; i++) {
                System.out.print(angka[i] + " ");
            }
            System.out.println();
            System.out.print("Masukkan nilai yang dicari setelah pengurutan ascending: ");
            int nilaiCariAscending = sc.nextInt();
            UTS08.cariNilai(angka, nilaiCariAscending);   
                    break;

            case 3:
                UTS08.selectionSortDescending(angka);
                System.out.println("Data setelah pengurutan descending:");
                for (int i = 0; i < angka.length; i++) {
                    System.out.print(angka[i] + " ");
                }
                System.out.println();
                System.out.print("Masukkan nilai yang dicari setelah pengurutan descending: ");
                int nilaiCariDescending = sc.nextInt();
                UTS08.cariNilai(angka, nilaiCariDescending);
                    break;
        
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
