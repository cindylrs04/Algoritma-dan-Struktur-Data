package Code;

import java.util.Scanner;

class BangunRuangMain08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program hitung volume dan luas permukaan");
        System.out.println("==========================================");
        System.out.println("Pilih menu : ");
        System.out.println("1. Hitung kerucut");
        System.out.println("2. Hitung limas");
        System.out.println("3. Hitung bola");
        System.out.print("==> ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("======================================");
                System.out.print("Masukkan banyak kerucut : ");
                int jmlKerucut = sc.nextInt();
                Kerucut08[] listKerucut = new Kerucut08[jmlKerucut];
                for (int i = 0; i < listKerucut.length; i++) {
                    System.out.print("Mauskkan jari-jari kerucut ke " + i + " : ");
                    int jariJari = sc.nextInt();
                    System.out.print("Masukkan sisi miring kerucut : ");
                    int sisiMiring = sc.nextInt();
                    listKerucut[i] = new Kerucut08(jariJari, sisiMiring);
                }
                for (int i = 0; i < listKerucut.length; i++) {
                    System.out.println(
                            "Kerucut ke " + i + "\nLuas Permukaan : " + listKerucut[i].hitungLuas() + "\nVolume : "
                                    + listKerucut[i].hitungVolume());
                }
                System.out.println("======================================");
                break;
            case 2:
                System.out.println("======================================");
                System.out.print("Masukkan banyak limas : ");
                int jmlLimas = sc.nextInt();
                Limas08[] listLimas = new Limas08[jmlLimas];
                for (int i = 0; i < listLimas.length; i++) {
                    System.out.print("Mauskkan panjang sisi alas Limas ke " + i + " : ");
                    int sisiAlas = sc.nextInt();
                    System.out.print("Masukkan tinggi Limas : ");
                    int tinggi = sc.nextInt();
                    listLimas[i] = new Limas08(sisiAlas, tinggi);
                }
                for (int i = 0; i < listLimas.length; i++) {
                    System.out
                            .println("Limas ke " + i + "\nLuas Permukaan : " + listLimas[i].hitungLuas() + "\nVolume : "
                                    + listLimas[i].hitungVolume());
                }
                System.out.println("======================================");
                break;
            case 3:
                System.out.println("======================================");
                System.out.print("Masukkan banyak bola : ");
                int jmlBola = sc.nextInt();
                Bola08[] listBola = new Bola08[jmlBola];
                for (int i = 0; i < listBola.length; i++) {
                    System.out.print("Mauskkan jari-jari bola ke " + i + " : ");
                    int jariBola = sc.nextInt();
                    listBola[i] = new Bola08(jariBola);
                }
                for (int i = 0; i < listBola.length; i++) {
                    System.out.println("Bola ke " + i + "\nLuas Permukaan : " + listBola[i].hitungLuas() + "\nVolume : "
                            + listBola[i].hitungVolume());
                }
                System.out.println("======================================");
                break;
            default:
                break;
        }
    }
}