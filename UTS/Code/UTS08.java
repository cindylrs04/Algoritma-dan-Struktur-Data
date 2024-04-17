package Code;

public class UTS08 {
    int[] angka;

    public static void cariNilai(int[] angka, int nilaiCari) {
        int indexAwal = cariIndex(angka, nilaiCari);
        System.out.println("\nNilai " + nilaiCari + " ditemukan pada indeks awal: " + indexAwal);

           // Melakukan pengurutan ascending
           selectionSortAscending(angka);

           // Mencari nilai setelah pengurutan ascending
           int indexAscending = cariIndex(angka, nilaiCari);
           System.out.println(
                   "Nilai " + nilaiCari + " ditemukan pada indeks setelah pengurutan ascending: " + indexAscending);
   
           // Melakukan pengurutan descending
           selectionSortDescending(angka);
   
           // Mencari nilai setelah pengurutan descending
           int indexDescending = cariIndex(angka, nilaiCari);
           System.out.println(
                   "Nilai " + nilaiCari + " ditemukan pada indeks setelah pengurutan descending: " + indexDescending);
    }

    public static int cariIndex(int[] angka, int nilaiCari) {
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == nilaiCari) {
                return i;
            }
        }
        return -1;
    }

    public static void selectionSortAscending(int[] angka) {
        for (int i = 0; i < angka.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < angka.length; j++) {
                if (angka[j] < angka[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = angka[minIndex];
            angka[minIndex] = angka[i];
            angka[i] = temp;
        }
    }
    
    public static void selectionSortDescending(int[] angka) {
        for (int i = 0; i < angka.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < angka.length; j++) {
                if (angka[j] > angka[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = angka[maxIndex];
            angka[maxIndex] = angka[i];
            angka[i] = temp;
        }
    }
    
}