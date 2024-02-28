package Code;

public class ArrayBalok08 {
    public static void main(String[] args) {
        Balok08[] blArray = new Balok08[3];
        blArray[0] = new Balok08(100, 30, 12);
        blArray[1] = new Balok08(120, 40, 15);
        blArray[2] = new Balok08(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
            
        }
    }

}
