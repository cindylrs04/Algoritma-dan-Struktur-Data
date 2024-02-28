package Code;

import java.util.Scanner;

public class ArrayObjects08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array : ");
        int panjangArray = sc.nextInt();
        PersegiPanjang08 [] ppArray = new PersegiPanjang08[panjangArray];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang08();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
            
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
        }
    }
}
