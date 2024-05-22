public class LeagueTable {
    DoubleLinkedList teams;

    public LeagueTable() {
        teams = new DoubleLinkedList();
    }

    public void addTeam(String name) {
        teams.addTeam(new Team(name));
    }

    public void updateMatchResult(String teamA, String teamB, int goalsForA, int goalsForB) {
        teams.updateTeam(teamA, goalsForA, goalsForB);
        teams.updateTeam(teamB, goalsForB, goalsForA);
        System.out.println(teamA + " vs " + teamB + ": " + goalsForA + "-" + goalsForB);
    }

    public void displayTable() {
        System.out.println("\n--- League Table ---");
        teams.printTable();
        displayChampion();
    }

    public void displayChampion() {
        Node champion = teams.head; // Assuming the list is sorted
        System.out.println("\njuaranya adalah: " + champion.team.name + " with " + champion.team.points + " points.");
    }

    public static void main(String[] args) {
        LeagueTable league = new LeagueTable();
        
        // Menambahkan tim-tim basket
        league.addTeam("Pelita Jaya Jakarta");
        league.addTeam("Dewa United Banten");
        league.addTeam("Kesatria Bengawan Solo");
        league.addTeam("Bali United Basketball");
        league.addTeam("Rajawali Medan");
        league.addTeam("Prawira Harum Bandung");
        league.addTeam("RANS Simba Bogor");
        league.addTeam("Satria Muda Pertamina Jakarta");
        league.addTeam("Borneo Hornbills");
        league.addTeam("Amartha Hangtuah Jakarta");
        league.addTeam("Satya Wacana Salatiga");
        league.addTeam("Bima Perkasa Jogja");
        league.addTeam("Tangerang Hawks Basketball Club");
        league.addTeam("Pacific Caesar Surabaya");

        // Contoh hasil pertandingan
        league.updateMatchResult("Pelita Jaya Jakarta", "Dewa United Banten", 89, 76);
        league.updateMatchResult("Kesatria Bengawan Solo", "Bali United Basketball", 67, 71);
        league.updateMatchResult("Rajawali Medan", "Prawira Harum Bandung", 56, 82);
        league.updateMatchResult("RANS Simba Bogor", "Satria Muda Pertamina Jakarta", 77, 80);
        league.updateMatchResult("Borneo Hornbills", "Amartha Hangtuah Jakarta", 65, 69);
        league.updateMatchResult("Satya Wacana Salatiga", "Bima Perkasa Jogja", 72, 60);
        league.updateMatchResult("Tangerang Hawks Basketball Club", "Pacific Caesar Surabaya", 61, 63);
        league.updateMatchResult("Pelita Jaya Jakarta", "Kesatria Bengawan Solo", 90, 85);
        league.updateMatchResult("Dewa United Banten", "Bali United Basketball", 78, 70);
        league.updateMatchResult("Rajawali Medan", "RANS Simba Bogor", 64, 75);
        league.updateMatchResult("Satria Muda Pertamina Jakarta", "Borneo Hornbills", 82, 60);
        league.updateMatchResult("Amartha Hangtuah Jakarta", "Satya Wacana Salatiga", 71, 68);
        league.updateMatchResult("Bima Perkasa Jogja", "Tangerang Hawks Basketball Club", 58, 64);
        league.updateMatchResult("Pacific Caesar Surabaya", "Pelita Jaya Jakarta", 70, 85);

        // Menampilkan tabel klasemen
        league.displayTable();
    }
}
