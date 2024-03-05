package Code;

public class InformasiMahasiswa08 {
    
    public String nama, jenis_kelamin;
    public int nim;
    public double ipk;

    double rataRataIPK(InformasiMahasiswa08[] a) {
        double total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i].ipk;
        }
        return (total / a.length);
    }

    void IPKTerbesar(InformasiMahasiswa08[] a) {
        double max = a[0].ipk;
        InformasiMahasiswa08 mhs = null;
        for (int i = 0; i < a.length; i++) {
            if (a[i].ipk > max) {
                max = a[i].ipk;
                mhs = a[i];
            }
        }
        System.out.println("Mahasiswa dengan nilai IPK tertinggi");
        System.out.println("Nama : " + mhs.nama);
        System.out.println("Nim : " + mhs.nim);
        System.out.println("Jenis Kelamin : " + mhs.jenis_kelamin);
        System.out.println("Nilai IPK : " + mhs.ipk);

    }
}