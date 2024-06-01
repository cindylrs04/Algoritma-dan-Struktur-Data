# Laporan Jobsheet XI Algoritma dan Struktur Data
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
    <img src="Gambar/NodeClass.png">
    <img src="Gambar/SingleLinkedListClass.png">
    <img src="Gambar/SLLMain.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPrak1.png"> 
</p>
<p>Pertanyaan</p>
<p>1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?</p>
<p>jawab : karena kode tersebut menghasilkan "Linked List Kosong" karena kondisi di metode print() adalah if (isEmpty()), yang mengembalikan true jika head bernilai null</p>
<p>2. Jelaskan kegunaan variable temp secara umum pada setiap method!</p>
<p>jawab : Variabel temp digunakan sebagai pointer untuk menelusuri linked list, variabel temp biasanya dimulai dari head dan kemudian dipindahkan ke node berikutnya hingga mencapai node yang diinginkan</p>
<p>3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut</p>
<p>if (temp.next.next==null) tail= temp.next;</p>
<p>jawab : Kode tersebut digunakan untuk menyisipkan node baru ke dalam linked list pada posisi tertentu (ditentukan oleh index). kode ini mengganti referensi temp.next dengan node baru (new Node08(input, temp.next))
</p>
<hr>
<b>Praktikum 1</b>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/KodePrak2_1.png">
    <img src="Gambar/KodePrak2_2.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilPrak2.png">
</p>
<p>Pertanyaan</p>
<p>1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!</p>
<p>jawab : digunakan dalam fungsi remove(int key) untuk menghentikan iterasi saat elemen yang ingin dihapus ditemukan.</p>
<p>2. Jelaskan kegunaan kode dibawah pada method remove</p>
<p>else if (temp.next.data == key)</p>
<p>temp.next = temp.next.next;</p>
<p>Kode temp.next = temp.next.next; digunakan untuk menghapus elemen setelah elemen yang ditunjuk oleh temp</p>
<hr>
<b>Tugas</b>
<p>1. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah
dipelajari sebelumnya untuk menginputkan data.
</p>
<p>Kode Program</p>
<p align="center">
    <img src="Gambar/KodeTugas1.png">
    <img src="Gambar/KodeTugas1_2.png">
    <img src="Gambar/KodeTugas1_3.png">
</p>
<p>Hasil Program</p>
<p align="center">
    <img src="Gambar/HasilTugas1.png">
</p>
<p>2. Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan kondisi yang
ditunjukkan pada soal nomor 1! Ketentuan</p>
<p>a. Implementasi antrian menggunakan Queue berbasis Linked List!</p>
<p>b. Program merupakan proyek baru, bukan modifikasi dari soal nomor 1!</p>
<p>Kode Program</p>
<p align="center">
    <img src="Gambar/KodeTugas2.png">
    <img src="Gambar/KodeTugas2_2.png">
    <img src="Gambar/KodeTugas2_3.png">
</p>
<p>Hasil Program</p>
<p align="center">
    <img src="Gambar/HasilTugas2.png">
</p>