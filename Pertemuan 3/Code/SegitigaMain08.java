package Code;

public class SegitigaMain08 {
    public static void main(String[] args) {
       Segitiga08[]sgArray = new Segitiga08[4];

       sgArray[0] = new Segitiga08(10, 4);
       sgArray[1] = new Segitiga08(20, 10);
       sgArray[2] = new Segitiga08(25, 6);
       sgArray[3] = new Segitiga08(25, 10);

       for (int i = 0; i < 4; i++) {
        System.out.println("Segitiga " + i + "\nLuas " + sgArray[i].hitungLuas() + "\nKeliling : " + sgArray[i].hitungKeliling());
        
       }
}
}