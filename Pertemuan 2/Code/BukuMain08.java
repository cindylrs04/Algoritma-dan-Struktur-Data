public class BukuMain08 {
    public static void main(String[] args) {
        Buku08 bk1 = new Buku08();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1. harga = 71000;
    
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi(); 

        Buku08 bk2 = new Buku08("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku08 bkCindy = new Buku08("Matematika Cindy", "Cindy", 90, 50, 54000);
        bkCindy.tampilInformasi();
        bkCindy.terjual(10);
        System.out.println("Harga total : " + bkCindy.hitungHargaTotal());
        System.out.println("Harga diskon : " + bkCindy.hitungDiskon());
        System.out.println("Harga bayar : " + bkCindy.hitungHargaBayar());
    
    }
}
