public class MainHotel08 {
    public static void main(String[] args) {
        HotelService08 list = new HotelService08();
        Hotel08 h1 = new Hotel08("Hotel Cindy", "Kota Pasuruan", 1000000, (byte) 4);
        Hotel08 h2 = new Hotel08("Hotel Innam", "Kota Surabaya", 800000, (byte) 3);
        Hotel08 h3 = new Hotel08("Hotel Mera", "Kota Batu", 600000, (byte) 5);
        Hotel08 h4 = new Hotel08("Hotel Vira", "Kota Blitar", 750000, (byte) 3);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);

        System.out.println("Menampilkan semua hotel");
        list.tampilAll();

        System.out.println("Urutan daftar hotel dengan harga terendah :");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Urutan daftar hotel dengan rating tertinggi : ");
        list.selectionSort();
        list.tampilAll();
    }
}
