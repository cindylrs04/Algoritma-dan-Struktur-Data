# Laporan Jobsheet XIII Algoritma dan Struktur Data
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
<p>1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding
binary tree biasa?</p>
<p>jawab : arena setiap node memiliki nilai yang terorganisir, di mana nilai di subtree kiri lebih kecil dan nilai di subtree kanan lebih besar. Hal ini memungkinkan pencarian menggunakan metode pencarian biner, di mana pencarian hanya perlu dilakukan pada satu sisi subtree tergantung pada perbandingan nilai dengan node saat ini.</p>
<p>2. Untuk apakah di class Node, kegunaan dari atribut left dan right?</p>
<p>jawab : pada struktur pohon biner, atribut left dan right digunakan untuk menunjukkan node anak kiri dan node anak kanan dari node saat ini, secara berurutan</p>
<p>3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?</p>
<p>jawab : digunakan untuk menunjukkan akar (root) dari pohon biner. Root adalah node pertama dari pohon biner, dan semua node lainnya diakses melalui root</p>
<p>b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?</p>
<p>jawab : Ketika objek tree pertama kali dibuat, nilai dari root akan null, karena pada awalnya pohon tersebut belum memiliki node apa pun</p>
<p>4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?</p>
<p>jawab : node baru akan menjadi root dari pohon, dan nilai dari root akan ditetapkan sebagai node baru yang akan ditambahkan</p>
<p>5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan
secara detil untuk apa baris program tersebut?</p>
 <p>if(data<current.data){</p>
 <p>if(current.left!=null){</p>
 <p>current = current.left;</p>
 <p>}else{</p>
 <p>current.left = new Node(data);</p>
 <p>break;</p>
 <p>}</p>
<p>}</p>
<p>jawab : Baris program tersebut bertanggung jawab untuk menambahkan node baru ke dalam pohon biner. Pada setiap langkah, algoritma menelusuri pohon berdasarkan nilai data yang akan ditambahkan, membandingkannya dengan nilai node saat ini. Jika nilai data kurang dari nilai node saat ini, maka algoritma bergerak ke anak kiri dari node saat ini. Jika node anak kiri sudah ada, algoritma memperbarui node saat ini menjadi anak kiri dan melanjutkan pencarian. Jika node anak kiri belum ada, algoritma menambahkan node baru sebagai anak kiri dari node saat ini dan menghentikan proses</p>
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
<p>1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?</p>
<p>jawab : </p>
<p>- Atribut data digunakan untuk menyimpan nilai-nilai yang mewakili node-node dalam pohon biner yang diimplementasikan sebagai array</p>
<p>- Atribut idxLast digunakan untuk menyimpan indeks terakhir dari array data yang berisi data aktual dalam pohon biner</p>
<p>2. Apakah kegunaan dari method populateData()?</p>
<p>jawab : digunakan untuk mengisi array data dalam objek BinaryTreeArray dengan nilai-nilai yang diberikan</p>
<p>3. Apakah kegunaan dari method traverseInOrder()?</p>
<p>jawab : digunakan untuk melakukan traversal inorder pada pohon biner yang direpresentasikan dalam bentuk array, dimulai dari indeks idxStart. Traversal inorder mengunjungi node-node dalam pohon secara berurutan mulai dari node kiri, kemudian node saat ini, dan terakhir node kanan</p>
<p>4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi
left child dan rigth child masin-masing?</p>
<p>jawab : </p>
<p>- Left child: 2 * 2 + 1 = 5</p>
<p>Right child: 2 * 2 + 2 = 6</p>
<p>5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?</p>
<p>jawab : digunakan untuk menunjukkan bahwa indeks terakhir dari data yang valid dalam array adalah 6</p>
<hr>
<b>Tugas</b>
<p>1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara
rekursif.</p>
<p align="center">
    <img src="Gambar/KodePrak1_2.png">
</p>
<p>2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang
paling besar yang ada di dalam tree.</p>
<p align="center">
    <img src="Gambar/KodeTugas2.png">
</p>
<p>3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf.</p>
<p align="center">
    <img src="Gambar/KodeTugas3.png">
</p>
<p>4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada
di dalam tree.</p>
<p align="center">
    <img src="Gambar/KodeTugas4.png">
</p>
<p>5. Modifikasi class BinaryTreeArray, dan tambahkan :</p>
<p>• method add(int data) untuk memasukan data ke dalam tree</p>
<p>• method traversePreOrder() dan traversePostOrder()</p>
<p align="center">
    <img src="Gambar/KodeTugas5.png">
</p>