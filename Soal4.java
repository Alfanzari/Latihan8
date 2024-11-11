public class Soal4 {
    public static void main(String[] args) {
        int hasilKali = 1;
        for (int i = 1; i <= 64; i *= 2) {
            hasilKali *= i;
        }
        System.out.println("Hasil perkalian barisan pangkat dua: " + hasilKali);
    }
}