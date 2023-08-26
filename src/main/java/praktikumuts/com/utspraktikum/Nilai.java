package praktikumuts.com.utspraktikum;

public class Nilai {
    public static void main(String[] args) {

        double nilai = 79.99;

        String range = "";

        if (nilai >= 0 && nilai < 40.00) {
            range = "E";
        } else if (nilai >= 40.00 && nilai < 44.99) {
            range = "D";
        } else if (nilai >= 45.00 && nilai <= 49.99) {
            range = "D+";
        } else if (nilai >= 50.00 && nilai <= 54.99) {
            range = "C/D";
        } else if (nilai >= 55.00 && nilai <= 59.99) {
            range = "C-";
        } else if (nilai >= 60.00 && nilai <= 62.49) {
            range = "C";
        } else if (nilai >= 62.50 && nilai <= 64.99) {
            range = "C+";
        } else if (nilai >= 65.00 && nilai <= 67.49) {
            range = "B/C";
        } else if (nilai >= 67.50 && nilai <= 69.99) {
            range = "B-";
        } else if (nilai >= 70.00 && nilai <= 72.49) {
            range = "B";
        } else if (nilai >= 72.50 && nilai <= 74.49) {
            range = "B+";
        } else if (nilai >= 75.00 && nilai <= 77.49) {
            range = "A/B";
        } else if (nilai >= 77.50 && nilai <= 79.99) {
            range = "A-";
        } else if (nilai >= 80.00 && nilai <= 100) {
            range = "A";
        } else {
            range = "Nilai tidak valid";
        }

        System.out.println("Nilai: " + nilai);
        System.out.println("Range: " + range);

    }
}
