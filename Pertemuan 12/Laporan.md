# Laporan Jobsheet XII Algoritma dan Struktur Data
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
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPrak1.png">
</p>
<p>Pertanyaan</p>
<p>1. Jelaskan perbedaan antara single linked list dengan double linked lists!</p>
<p>jawab :</p>
<p>2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut
tersebut?</p>
<p>jawab :</p>
<p>3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan
size seperti pada gambar berikut ini?</p>
<p>public DoubleLinkedList() {</p>
        <p>head = null;</p>
        <p>size = 0;</p>
    <p>}</p>
<p>jawab :</p>
<p>4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev
dianggap sama dengan null?</p>
<p>Node newNode = new Node(null, item, head);</p>
<p>jawab :</p>
<P>5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?</p>
<p>jawab :</p>
<p>6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan
parameter prev dengan current, dan next dengan null?</p>
<p>Node newNode = new Node(current, item, null);</p>
<p>jawab: </p>
<p>7. Pada method add(), terdapat potongan kode program sebagai berikut:</p>
<p align="center">
    <img src="Gambar/SoalNo7.png">
</p>
<p>jelaskan maksud dari bagian yang ditandai dengan kotak kuning</p>
<p>jawab :</p>
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
<p>1. Apakah maksud statement berikut pada method removeFirst()?</p>
<p>head = head.next;</p>
<p>head.prev = null;</p>
<p>jawab :</p>
<p>2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?</p>
<p>jawab :</p>
<p>3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!</p>
<p align="center">
    <img src="Gambar/SoalNo3.png">
</p>
<p>jawab :</p>
<p>4. Jelaskan fungsi kode program berikut ini pada fungsi remove!</p>
<p align="center">
    <img src="Gambar/SoalNo4.png">
</p>
<p>jawab :</p>
<hr>
<b>Praktikum 3</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodePrak3.png">
    <img src="Gambar/KodePrak3_2.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPrak3.png">
    <img src="Gambar/HasilPrak3_2.png">
</p>
<p>Pertanyaan</p>
<p>1. Jelaskan method size() pada class DoubleLinkedLists!</p>
<p>2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke1!</p>
<p>3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists!</p>
<p>4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!</p>
<p align="center">
    <img src="Gambar/SoalNo4Prak3.png">
</p>
<hr>
<b>Tugas</b>
<p>1. Buat program antrian vaksinasi menggunakan queue berbasis double linked list sesuai ilustrasi 
dan menu di bawah ini! (counter jumlah antrian tersisa di menu cetak(3) dan data orang yang 
telah divaksinasi di menu Hapus Data(2) harus ada)</p>
<p>2. Buatlah program daftar film yang terdiri dari id, judul dan rating menggunakan double linked 
lists, bentuk program memiliki fitur pencarian melalui ID Film dan pengurutan Rating secara 
descending. Class Film wajib diimplementasikan dalam soal ini. </p>