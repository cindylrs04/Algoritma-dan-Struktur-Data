# Laporan Jobsheet XV Algoritma dan Struktur Data
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
    <img src="Gambar/KodePrak1.png">
    <img src="Gambar/KodePrak1_2.png">
    <img src="Gambar/KodePrak1_3.png">
    <img src="Gambar/KodePrak1_4.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPrak1.png">
</p>
<p>Pertanyaan</p>
<p>1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!</p>
<p>jawab : sudah</p>
<p>2. Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan
variabel tersebut!</p>
<p>jawab : array yang digunakan untuk menyimpan adjacency list dari graf. Setiap elemen dalam array ini merupakan sebuah linked list yang berisi semua node yang terhubung ke node tertentu. Tujuan dari pembuatan variabel ini adalah untuk memodelkan struktur data graf menggunakan adjacency list, yang merupakan salah satu metode yang efisien untuk menyimpan graf terutama ketika graf tersebut adalah graf jarang (sparse graph)</p>
<p>3. Jelaskan alur kerja dari method removeEdge!</p>
<p>jawab : </p>
<p> - Method ini menerima dua parameter, asal (source) dan tujuan (destination), yang menunjukkan edge mana yang akan dihapus</p>
<p> - Method ini memanggil method remove pada adjacency list dari node asal, yang bertujuan untuk menghapus node tujuan dari daftar tetangga node asal</p>
<p> - Jika graf adalah undirected (tidak berarah), biasanya method ini juga akan menghapus node asal dari daftar tetangga node tujuan, tetapi dalam implementasi yang diberikan hanya menghapus satu arah edge</p>
<p>4. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add
jenis lain saat digunakan pada method addEdge pada class Graph?</p>
<p>jawab : Efisiensi waktu dan pengimplementasian yang sederhana</p>
<p>5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara
suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner).</p>
<p align="center">
    <img src="Gambar/SoalNo5.png">
</p>
<p>jawab : </p>
<hr>
<b>Praktikum 2</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodePrak2.png">
    <img src="Gambar/KodePrak2_2.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPrak2.png">
</p>
<p>Pertanyaan</p>
<p>1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!</p>
<p>jawab : sudah</p>
<p>2. Apa jenis graph yang digunakan pada Percobaan 2?</p>
<p>jawab : grap matriks bertipe array</p>
<p>3. Apa maksud dari dua baris kode berikut?</p>
<p align="center">
    <img src="Gambar/SoalNo3.png">
</p>
<p>jawab : Dua baris kode tersebut bertujuan untuk menetapkan hubungan (edge) antara dua gedung dalam suatu graf. Baris pertama, gdg.makeEdge(1, 2, 70);, membuat edge dari gedung 1 ke gedung 2 dengan jarak 70 meter. Sementara baris kedua, gdg.makeEdge(2, 1, 80);, membuat edge dari gedung 2 ke gedung 1 dengan jarak 80 meter. Ini menunjukkan bahwa kedua gedung tersebut saling terhubung dalam graf, dan masing-masing memiliki jarak tertentu antara satu sama lain.</p>
<p>4. Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk
inDegree dan outDegree!</p>
<p>jawab : </p>
<hr>
<b>Latihan</b>
<p>1. Modifikasi kode program pada class GraphMain sehingga terdapat menu program yang bersifat
dinamis, setidaknya terdiri dari:</p>
<p>a. Add Edge</p>
<p>b. Remove Edge</p>
<p>c. Degree</p>
<p>d. Print Graph</p>
<p>e. Cek Edge</p>
<p>Pengguna dapat memilih menu program melalui input Scanner</p>
<p>2. Tambahkan method updateJarak pada Percobaan 1 yang digunakan untuk mengubah jarak
antara dua node asal dan tujuan!</p>
<p>3. Tambahkan method hitungEdge untuk menghitung banyaknya edge yang terdapat di dalam graf!</p>