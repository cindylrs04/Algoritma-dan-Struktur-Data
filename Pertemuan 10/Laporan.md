# Laporan Jobsheet X Algoritma dan Struktur Data
<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558 " alt="Logo Polinema" width="30%"> 
</p>
<hr>
<p align="center">Nama : Cindy Laili Larasati</p>
<p align="center">NIM : 2341720038</p>
<hr>
<b>Praktikum 1</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/QueuePrak1.png">
    <img src="Gambar/QueueMainPrak1.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPrak1.png">
</p>
<p>Pertanyaan</p>
<p>1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size
bernilai 0?</p>
<p>2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!</p>
<p>if (rear == max - 1)</p>
<p>rear = 0;</p>
<p>3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!</p>
<p>if (front == max - 1)</p>
<p>front = 0;</p>
<p>4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
melainkan int i=front?</p>
<p>5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!</p>
<p>i = (i + 1) % max;</p>
<p>6. Tunjukkan potongan kode program yang merupakan queue overflow!</p>
<p>7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
queue overflow dan queue underflow, program dihentikan!</p>
<hr>
<b>Praktikum 2</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/Nasabah.png">
    <img src="Gambar/QueueNasabahClass.png">
    <img src="Gambar/QueueNasabahMain.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPrak2.png">
    <img src="Gambar/HasilPrak2_2.png">
</p>
<p>Pertanyaan</p>
<p>1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!</p>
<p align="center">
    <img src="Gambar/PertanyaanNo2Prak2.png">
</p>
<p>2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
dapat dipanggil!</p>
