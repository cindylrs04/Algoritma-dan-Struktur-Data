package Code;

public class Segitiga08 {
    public int alas;
    public int tinggi;

    public Segitiga08(int a, int t) {
        alas = a;
        tinggi = t;
    }

    int hitungLuas(){
        return alas * tinggi;
    }

    double hitungKeliling(){
        double sisiMiring = Math.sqrt((alas*alas) + (tinggi*tinggi));
        double keliling = alas + tinggi + sisiMiring;
        return keliling;
    }
}
