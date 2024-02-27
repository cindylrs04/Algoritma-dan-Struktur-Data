# Laporan Jobsheet II Algoritma dan Struktur Data
<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558 " alt="Logo Polinema" width="30%"> 
</p>
<hr>
<p align="center">Nama : Cindy Laili Larasati</p>
<p align="center">NIM : 2341720038</p>
<hr>
<b>Percobaan 1</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodePercobaan1.png">
</p>
<p>Hasil program :</p>
<p align="center">
    <img src="Gambar/HasilPercobaan1.png">
</p>
<p>Pertanyaan</p>
<p>1. Sebutkan dua karakteristik class atau object!</p>
<p>jawab : class merupakan konsep suatu objek yang bersifat umum, sedangkan objek merupakan implementasi dari class tersebut yang bersifat spesifik</p>
<p>2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
Buku? Sebutkan apa saja atributnya!</p>
<p> jawab : ada 5 atribut yaitu judul, pengarang, halaman, stok, harga</p>
<p>Ada berapa method yang dimipki oleh class tersebut? Sebutkan apa saja methodnya!</p>
<p>3. Ada berapa method yang dimipki oleh class tersebut? Sebutkan apa saja methodnya!</p>
<p>jawab : ada 4 method yaitu tampil, terjual, restock, gantiHarga</p>
<p>4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!</p>
<p>jawab : </p>
<p>5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?</p>
<p>jawab : agar ada nilai yang bisa di jumlahkan dengan stok</p>
<p>6. Commit dan push kode program ke Github</p>
<hr>
<b>Percobaan 2</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodePercobaan2.png">
</p>
<p>Hasil program :</p>
<p align="center">
    <img src="Gambar/HasilPercobaan2.png">
</p>
<p>Pertanyaan</p>
<p>1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?</p>
<p> jawab : terletak pada baris ke 3 yaitu Buku15 bk1 = new Buku08();. objek yang dihasilkan adalah bk1</p>
<p>2. Bagaimana cara mengakses atribut dan method dari suatu objek?</p>
<p>jawab : dengan cara menyebutkan namaobjek.atribut (bk1.judul) lalu isi juga nilai yang sesuai dengan atribut</p>
<p>3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?</p>
<p>jawab : karena pada method tampilInformasi pertama yang ditampilkan adalah data yang sudah ditambah nilainya. tapi pada method tampilInformasi kedua telah dialakukan pemanggilan fungsi terjual maka akan mengurangi stok dan ganti harga yang mengubah nilai harga</p>
<hr>
<b>Percobaan 3</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodePercobaan3.png">
    <img src="Gambar/KodePercobaan3_2.png">
</p>
<p>Hasil program :</p>
<p align="center">
    <img src="Gambar/KodePercobaan3.png">
</p>
<p>Pertanyaan</p>
<p>1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!</p>
<p>jawab : pada baris ke 10 yaitu  public Buku08(String jud, String pg, int hal, int stok, int har) {}</p>
<p>2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?</p>
<p>jawab :  instansiasi objek dengan mengakses atribut objek melalui konstruktor berparameter dan memberi nilai atribut pada konstruktor berparameter</p>
<p>3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!</p>
<p>jawab : Akan terjadi error pada instansiasi objek yang menggunakan konstruktor default, karena saat instansiasi tersebut tidak ada parameter dalam konstruktor buku yang sesuai pada class buku</p>
<p>4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses secara berurutan? Jelaskan alasannya!</p>
<p>jawab : Tidak, karena method adalah hal hal yang bisa dilakukan oleh objek dan pemrogrmanan berbasis objek tidak bersifat struktural jadi pemanggilan method bebas seperti pada contoh pemanggilan informasi buku setelah merubah harga</p>
<p>5. Buat object baru dengan nama buku menggunakan konstruktor berparameter dari class Buku!</p>
<p>jawab : Buku15 bkInnama = new Buku15("Biografi Innama Maesa", "Innama Maesa", 100, 50, 73000);
dan jika ingin menampilkan objek tersebut bisa dipanggil dengan menggunakan bkInnama.tampilInformasi();</p>
<b>Latihan</b>
<p>1. Membuat method baru pada class Buku</p>
<p>Kode Program : </p>
<p>Hasil Program : </p>
<p>1. Membuat method baru pada class Buku</p>
<p>Kode Program : </p>
<p>Hasil Program : </p>

