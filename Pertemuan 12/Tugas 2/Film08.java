public class Film08 {
    int id;
    String judul;
    double rating;
    Film08 prev, next;
    
    Film08(Film08 prev, int id, String judul, double rate, Film08 next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        rating = rate;
        this.next = next;
    }
}
