# Laporan Jobsheet III Algoritma dan Struktur Data
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
    <img src="Gambar/KodePercobaan1_ArrayObjects.png">
    <img src="Gambar/KodePercobaan1_PersegiPanjang.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPercobaan1_AOPP.png">
</p>
<p>Pertanyaan</p>
<p>1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method?Jelaskan!</p>
<p>jawab : tidak karena Class tanpa atribut atau method masih bisa dibuat dan digunakan dalam array of object, tergantung kebutuhan dan fungsinya.</p>
<p>2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan
konstruktur pada baris program berikut :</p>
<p>ppArray[1] = new PersegiPanjang();</p>
<p>jawab : karena butuh konstruktor dalam intansiasi objek</p>
<p>3. Apa yang dimaksud dengan kode berikut ini:</p>
<p>PersegiPanjang[] ppArray = new PersegiPanjang[3]</p>
<p>jawab : intansiasi array</p>
<p>4. Apa yang dimaksud dengan kode berikut ini:</p>
<p>ppArray[1] = new PersegiPanjang()</p>
<p>ppArray[1].panjang = 80;</p>
<p>ppArray[1].lebar = 40;</p>
<p>jawab : pemanggilan atribut</p>
<p>5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?</p>
<p>jawab : agar lebih terstruktur dan kodenya lebih rapi</p>
<hr>
<b>Percobaan 2</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodePercobaan2_ModifikasiArrayObjects.png">
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/hasilPercobaan2_ModifikasiArrayObjects.png">
<p>Pertanyaan</p>
<p>1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?</p>
<p>jawab : iya</p>
<p>2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!</p>
<p>jawab : nama dan umur yang dipisahkan dengan baris</p>
<p>3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode
dibawah ini akan memunculkan error saat dijalankan. Mengapa?</p>
<p>Persegi[] pgArray = new Persegi[100];</p>
<p>pgArray[5].sisi = 20;</p>
<p>jawab : karena belum di instansiasi objeknya</p>
<p>4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!</p>
<p>jawab : </p>
<p align="center">
    <img src="Gambar/KodePertanyaan4_ModifikasiArrayObjects.png">
    <img src="Gambar/hasilPertanyaan4_ModifikasiArrayObjects.png">
<p>5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan
pada ppArray[i] sekaligus ppArray[0]?Jelaskan !</p>
<p>jawab :boleh, tapi nilainya akan tertumpuk</p>
<hr>
<b>Percobaan 3</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodePercobaan3_ArrayBalok.png">
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/hasilPercobaan3_ArrayBalok.png">
<p>Pertanyaan</p>
<p>1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!</p>
<p>jawab : bisa, contohnya konstruktor yang berparameter dan yang tidak berparameter</p>
<p>2. Jika diketahui terdapat class Segitiga seperti berikut ini:</p>
<p>public class Segitiga</p>
<p>public int alas;</p>
<p>public int tinggi;</p>
<p>Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.</p>
<p>jawab : </p>
<p align="center">
    <img src="Gambar/Percobaan3No2.png">
    <img src="Gambar/Percobaan3No2_2.png">
<p>3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan
library Math pada Java untuk mengkalkulasi sisi miring)</p>
<p>jawab : </p>
<p align="center">
    <img src="Gambar/Percobaan3No3.png">
<p>4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing
atributnya sebagai berikut:</p>
<p>sgArray ke-0 alas: 10, tinggi: 4</p>
<p>sgArray ke-1 alas: 20, tinggi: 10</p>
<p>sgArray ke-2 alas: 15, tinggi: 6</p>
<p>sgArray ke-3 alas: 25, tinggi: 10</p>
<p>jawab :</p>
<p align="center">
    <img src="Gambar/Percobaan3No4.png">
<p>5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method
hitungLuas() dan hitungKeliling().</p>
<p>jawab : </p>
<p align="center">
    <img src="Gambar/Percobaan3No5.png">
<hr>
<b>Latihan</b>
<p>1. Menghitung Luas permukaan dan Volumen bangun ruang</p>
<p>Kerucut</p>
<p>jawab : </p>
<p align="center">
    <img src="Gambar/KodeLatihan_Kerucut.png">
<p>Limas</p>
<p>jawab : </p>
<p align="center">
    <img src="Gambar/KodeLatihan_Limas.png">
<p>Bola</p>
<p>jawab : </p>
<p align="center">
    <img src="Gambar/KodeLatihan_Bola.png">
<p>Kode class main</p>
<p>jawab : </p>
<p align="center">
    <img src="Gambar/Kode BangunRuangMain.png">
<p>2. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama,
nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi
tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika
dimisalkan terdapat 3 data mahasiswa yang tersedia.</p>
<p>jawab : </p>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/Kode InformasiMahasiswa.png">
    <img src="Gambar/Kode InformasiMahasiswaMain.png">
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/Hasil InformasiMahasiswaNo2.png">
<p>3. Modifikasi program Latihan no.2 di atas, sehingga bisa digunakan untuk menghitung rata-rata IPK,
serta menampilkan data mahasiswa dengan IPK terbesar! (gunakan method untuk masing-masing
proses tersebut)</p>
<p>jawab : </p>
<p align="center">
    <img src="Gambar/Kode InformasiMahasiswa_Modifikasi.png">
    <img src="Gambar/Kode InformasiMahasiswaMain_Modifikasi.png">
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/Hasil InformasiMahasiswaNo3.png">