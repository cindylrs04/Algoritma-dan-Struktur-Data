# Laporan Jobsheet VIII Algoritma dan Struktur Data
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
    <img src="Gambar/KodeBarangPercobaan1.png">
    <img src="Gambar/KodeGudangPercobaan1.png">
    <img src="Gambar/KodeUtamaPercobaan1.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPercobaan1.png">
    <img src="Gambar/HasilPercobaan1_2.png">
</p>
<p>Pertanyaan</p>
<p>1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi
hasil percobaan! Bagian mana saja yang perlu diperbaiki?</p>
<p>jawab : </p>
<p align="center">
    <img src="Gambar/JawabanNo1Percobaan1.png">
    <img src="Gambar/JawabanNo1Percobaan1_2.png">
    <img src="Gambar/JawabanNo1Percobaan1_3.png">
</p>
<p>2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode
programnya!</p>
<p>jawab : </p>
<p align="center">
    <img src="Gambar/JawabanNo2Percobaan1.png">
</p>
<p>3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi
tersebut dihapus, apa dampaknya?</p>
<p>jawab : karena untuk memastikan bahwa tumpukan barang tidak kososng sebelum mencoba menampilkan isinya. jika kondisi ini dihapus, maka akan terjadi kesalhan saat mencoba mengakses elemen dari tumpukan barang yang kosong, yang dapat menyebabkan program berhenti secara paksa saat di run.</p>
<p>4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat
barang teratas, serta dapat secara bebas menentukan kapasitas gudang!</p>
<p>jawab : </p>
<p align="center">
    <img src="Gambar/JawabanNo4Percobaan1.png">
</p>
<hr>
<b>Percobaan 2</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodeStackKonversiPercobaan2.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPercobaan2.png">
</p>
<p>Pertanyaan</p>
<p>1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0),
bagaimana hasilnya? Jelaskan alasannya!</p>
<p>jawab : </p>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/JawabanNo1Percobaan2.png">
</p>
<p>2. Jelaskan alur kerja dari method konversiDesimalKeBiner!</p>
<p>jawab : mengonversi bilangan desimal menjadi biner menggunakan stack. dilakukan dengan membagi bilangan desimal dengan 2 secara berulang, dan menyimpan sisa pembagian dalam stack, kemudian mengeluarkan sisa sisa tersebut dari stack dan membentuk string biner</p>
<hr>
<b>Percobaan 3</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodePostfixPercobaan3.png">
    <img src="Gambar/KodePostfixMainPercobaan3.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPercobaan3.png">
</p>
<p>Pertanyaan</p>
<p>1. Pada method derajat, mengapa return value beberapa case bernilai sama? Apabila return
value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi?</p>
<p>jawab : yang terjadi adalah urutan operator yang dihasilkan dalam ekspresi positif dapat berubah sesuai dengan prioritas yang ditentukan dalam method derajat</p>
<p>2. Jelaskan alur kerja method konversi!</p>
<p>jawab : mengonversi ekspresi matematika dalam bentuk infix menjadi bentuk posfix</p>
<p>3. Pada method konversi, apa fungsi dari potongan kode berikut?</p>
<p> c = Q.chartAt(i)</p>
<p>jawab : langkah untuk mengambil karakter berdasarkan indeks dalam string Q pada setiap iterasi loop</p>
<hr>
<b>Latihan</b>
<p>Perhatikan dan gunakan kembali kode program pada Percobaan 1. Tambahkan dua method berikut
pada class Gudang:</p>
<p>• Method lihatBarangTerbawah digunakan untuk mengecek barang pada tumpukan terbawah</p>
<p>• Method cariBarang digunakan untuk mencari ada atau tidaknya barang berdasarkan kode
barangnya atau nama barangnya</p>