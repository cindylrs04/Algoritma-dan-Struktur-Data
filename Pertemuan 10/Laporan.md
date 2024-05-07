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
<p>jawab : nilai awal atribut front dan rear digunakan untuk menunjukkan bahwa antrian kosong dan ketika kedua atribut memiliki nilai -1 maka tidak ada elemen dalam antrian. sedangkan atribut size ditetapkan sebagai 0 karena saat awal antrian dibuat tidak ada elemen, dan jumlah elemen diwakilin oleh size</p>
<p>2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!</p>
<p>if (rear == max - 1)</p>
<p>rear = 0;</p>
<p>jawab : kode tersebut digunakan untuk mengatasi kondisi ketika antrian penuh, jika rear = max 1 maka antriannya penuh. dan kode tersebut mengatur ulang rear ke posisi awal, juga memastikan bahwa elemen baru dapat dimasukkan ke awal antrian jika masih ada ruang yang kososng</p>
<p>3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!</p>
<p>if (front == max - 1)</p>
<p>front = 0;</p>
<p>jawab : kode tersebut digunakan untuk mengelola front dalam strutur data circular queue, dan memastikan jika elemen telah diambil, front akan kembali ke posisi awal antrian unutk menangmbil elemen baru</p>
<p>4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
melainkan int i=front?</p>
<p>jawab : metode print dari struktur data circular queue, memulai perulangan dengan i = front memiliki tujuan dapat mencetak elemen-elemen antrian secara berurutan, dimulai dari posisi pertama dalam antrian.</p>
<p>5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!</p>
<p>i = (i + 1) % max;</p>
<p>jawab : digunakan dalam metode print untuk memperbarui nilai i agar bergerak maju ke elemen berikutnya dalam struktur data circular queue.</p>
<p>6. Tunjukkan potongan kode program yang merupakan queue overflow!</p>
<p>public boolean IsFull() { //queue overflow</p>
        <p>if (size == max) {</p>
           <p> return true;</p>
       <p> } else { </p>
            <p>return false;</p>
        <p>}</p>
    <p>}</p>
<p>7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
queue overflow dan queue underflow, program dihentikan!</p>
<p>jawab : </p>
<p>void enqueue(int dt) { if (isFull()) { System.out.println("Queue sudah penuh"); System.exit(1); } else { if (isEmpty()) { front = rear = 0; } else { if (rear == max - 1) { rear = 0; } else { rear++; } } data[rear] = dt; size++; } }</p>

<p>public int dequeue() { int dt = 0; if (isEmpty()) { System.out.println("Queue masih kosong"); System.exit(1); } else { dt = data[front]; size--; if (isEmpty()) { front = rear = -1; } else { if (front == max - 1) { front = 0; } else { front++; } } } return dt; }</p>
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
<p>jawab : untuk memeriksa apakah pengambilan elemen dari antrian berhasil dilakukan</p>
<p>2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
dapat dipanggil!</p>
<p>jawab :</p>
<p>void peekRear() { if (!isEmpty()) { System.out.println("Elemen terdepan : " + data[rear].norek + " " + data[rear].nama + " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo); } else { System.out.println("Queue masih kosong"); } }</p>
<p>case 5: System.out.println("5. Cek antrian belakang");</p>
<hr>
<b>Tugas</b>
<p>1. Buatlah program antrian untuk mengilustasikan pesanan disebuah warung. Ketika seorang pembeli akan mengantri, maka dia harus mendaftarkan nama, dan nomor HP seperti yang digambarkan pada Class diagram</p>
<p>Kode program :</p>
<p align="center">
    <img src="Gambar/Pembeliclass.png">
    <img src="Gambar/QueuePembeliClass.png">
    <img src="Gambar/QueuePembeliMain.png">
</p>
<p>Hasil Program :</p>
<p align="center">
    <img src="Gambar/HasilTugas1.png">
    <img src="Gambar/HasilTugas2.png">
    <img src="Gambar/HasilTugas3.png">
    <img src="Gambar/HasilTugas4.png">
</p>