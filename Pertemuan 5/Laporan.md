# Laporan Jobsheet V Algoritma dan Struktur Data
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
    <img src="Gambar/KodePercobaan1_Main.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPercobaan1.png">
</p>
<p>Pertanyaan</p>
<p>1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
perbedaan bagian kode pada penggunaan if dan else!</p>
<p>jawab : if menentukan kondisi batas dan menghentikan rekursi sedangkan else memecah masalah dan melanjutkan rekursi</p>
<p>2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan
for?Buktikan!</p>
<p>jawab : perulangan dapat di gantikan dengan menggunakan perluangan while</p>
<p>3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !</p>
<p>jawab : Pada fakto *= i dilakukan operasi assignment dalam iterasi namun pada fakto = n * faktorialDC(n-1) dilakukan proses rekursif</p>
<hr>
<b>Percobaan 2</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodePercobaan2.png">
    <img src="Gambar/KodePercobaan2_Main.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPercobaan2.png">
</p>
<p>Pertanyaan</p>
<p>1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!</p>
<p>jawab : method PangkatBF merupakan perhitungan pangkat yang menggunakan algoritma Brute Force dengan menerapkan perhitungan per indeks pada perulangan. pada method PangkatDC menggunakan algortima Divide Conquer yang membagi tiap bagian pangkat kemudian di hitung per bagian kemudian di combine</p>
<p>2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!</p>
<p>jawab : Terdapat dalam method PangkatDC di bagian rekursif berikut :

 if(n%2==1) { // bilangan ganjil 
    return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
    } else {
        return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
    }</p>
<p>3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan
konstruktor.</p>
<p>jawab :</p>
<p>4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan
switch-case!</p>
<p>jawab :</p>
<hr>
<b>Percobaan 3</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodePercobaan3.png">
    <img src="Gambar/KodePercobaan3_Main.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPercobaan3.png">
</p>
<p>Pertanyaan</p>
<p>1. Mengapa terdapat formulasi return value berikut?Jelaskan!</p>
<p>jawab : untuk menggabungkan hasil penjumlahan sisi kiri (lsum), sisi kanan (rsum), dan bagian tengah (arr[mid])</p>
<p>2. Kenapa dibutuhkan variable mid pada method TotalDC()?</p>
<p>jawab : untuk membagi array menjadi dua bagian sama panjang</p>
<p>3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja.
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan
dengan program!</p>
<p>jawab :</p>
<p align="center">
    <img src="Gambar/KodeSumModifikasi.png">
</p>
<hr>
<b>Latihan</b>
<p>1. Sebuah showroom memiliki daftar mobil dengan data sesuai tabel di bawah ini</p>
<p align="center">
    <img src="Gambar/SoallatihanJobsheet5.png">
</p>
<p>Tentukan:</p>
<p>a. top_acceleration tertinggi menggunakan Divide and Conquer!</p>
<p>b. top_acceleration terendah menggunakan Divide and Conquer!</p>
<p>c. Rata-rata top_power dari seluruh mobil menggunakan Brute Force!</p>
<p>jawab :</p>
<p align="center">
    <img src="Gambar/KodeLatihanMobil.png">
    <img src="Gambar/KodeLatihanMobilMain.png">
</p>