public class Buku08 {

        String judul, pengarang;
        int halaman, stok, harga, terjual;
    
        public Buku08() {

        }

        public Buku08(String jud, String pg, int hal, int stok, int har) {
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;


        }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jml) {
        if (stok > 0 && jml < stok) {
            terjual= jml;
            stok -= jml;
        } else {
            System.out.println("Jumlah terjual melebihi stok");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        int hargaTotal = terjual * harga;
        return hargaTotal;
    }

    int hitungDiskon() {
        int total = hitungHargaTotal();
        if (total > 150000) {
            return (total * 12 / 100);
        } else if (total >= 75000 && total <= 150000) {
            return (total * 5 / 100);
        } else {
            return 0;
        }
    }

    int hitungHargaBayar() {
        int total = hitungHargaTotal();
        int diskon = hitungDiskon();
        int bayar = total - diskon;
        return bayar;
    }
}