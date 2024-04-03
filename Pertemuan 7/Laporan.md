# Laporan Jobsheet VII Algoritma dan Struktur Data
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
    <img src="Gambar/KodePercobaan1Class.png">
    <img src="Gambar/KodePercobaan1PencarianBuku.png">
    <img src="Gambar/KodePercobaan1Main.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPercobaan1_1.png">
    <img src="Gambar/HasilPercobaan1_2.png">
    <img src="Gambar/HasilPercobaan1_3.png">
    <img src="Gambar/HasilPercobaan1_4.png">
</p>
<p>Pertanyaan</p>
<p>1. Jelaskan fungsi break yang ada pada method FindSeqSearch!</p>
<p>jawab : untuk menghentikan perulangan ketika telah menemukan nilai cari pada kumpulan atribut kode buku di array of object</p>
<p>2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih
dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti
dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?</p>
<p>jawab : program yang diberikan akan tetap berjalan meskipun data kode buku yang dimasukkan tidak terurut dari kecil ke besar</p>
<p>3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe
method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method
tersebut pada class BukuMain seperti gambar berikut :</p>
<p align="center">
    <img src="Gambar/SoalNo3Percobaan1.png">
</p>
<p>jawab :<p>
<hr>
<b>Percobaan 2</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodePercobaan2.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPercobaan2.png">
</p>
<p>Pertanyaan</p>
<p>1. Tunjukkan pada kode program yang mana proses divide dijalankan!</p>
<p>jawab : if(right >= left) {mid = (left + right) / 2}</p>
<p>2. Tunjukkan pada kode program yang mana proses conquer dijalankan!</p>
<p>jawab : if (cari == listBk[mid].kodeBuku) { return (mid); } else if (listBk[mid].kodeBuku > cari) { return FindBinarySearch(cari, left, mid); } else { return FindBinarySearch(cari, mid, right); }</p>
<p>4. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan
Mengapa hal tersebut bisa terjadi?</p>
<p>jawab : Program masih akan berjalan meskipun data Kode Buku yang dimasukkan tidak urut. karena pencarian dilakukan baik dengan pencarian berurutan (sequential search) maupun pencarian biner (binary search)</p>
<p>3. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214,
20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search?
Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!</p>
<p>jawab :</p>
<hr>
<b>Percobaan 3</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodePercobaan3Class.png">
    <img src="Gambar/KodePercobaan3Main.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPercobaan3.png">
</p>
<hr>
<b>Latihan</b>
<p>1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini</p>
<p>- Ubah tipe data dari kode Buku yang awalnya int menjadi String</p>
<p>- Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan
sequential search dan binary search.</p>
<p>jawab : </p>
<p>2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini</p>
<p>- Tambahkan method pencarian judul buku menggunakan sequential search dan binary
search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan
dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga
ketika input data acak, maka algoritma searching akan tetap berjalan</p>
<p>- Buat aturan untuk mendeteksi hasil pencarian judul buku yang lebih dari 1 hasil dalam
bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang
diberikan!</p>
<p>jawab : </p>