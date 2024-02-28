package Code;

public class Limas08 {
    int Sisialas;
    int tinggi;

    Limas08(int a, int t) {
        Sisialas = a;
        tinggi = t;
    }
    
    double hitungLuas() {
        double Sisimiring = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(Sisialas / 2, 2));
        return (Sisialas * Sisialas) + (4 * (Sisialas * Sisimiring / 2));
    }

    double hitungVolume() {
        return (Sisialas * Sisialas * tinggi / 3);
    }
}
