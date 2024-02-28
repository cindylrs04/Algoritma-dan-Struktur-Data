package Code;

public class Kerucut08 {
    int Jarijari;
    int Sisimiring;

    Kerucut08(int j, int s){
        Jarijari = j;
        Sisimiring = s;
    }

    double hitungLuas() {
        return (3.14 * Jarijari * Sisimiring) + (3.14 * Jarijari * Jarijari);
    }

    double hitungVolume() {
        double tinggi = Math.sqrt(Math.pow(Sisimiring,2) - Math.pow(Jarijari, 2));
        return 3.14 * Jarijari * Jarijari * tinggi / 3;
    }
    
}