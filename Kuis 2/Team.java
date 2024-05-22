public class Team {
    String namaTim;
    int main;
    int menang;
    int kalah;
    int poin;

    public Team(String namaTim) {
        this.namaTim = namaTim;
        this.main = 0;
        this.menang = 0;
        this.kalah = 0;
        this.poin = 0;
    }

    public void catatPertandingan(boolean menang) {
        this.main++;
        if (menang) {
            this.menang++;
            this.poin += 2;
        } else {
            this.kalah++;
            this.poin += 1;
        }
    }

    public String toString() {
        return String.format("%-35s %2d %6d %6d %6d", namaTim, main, menang, kalah, poin);
    }
}