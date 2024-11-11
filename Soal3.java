public class Soal3 {
    public static void main(String[] args) {
        int jumlah = 0;
        for (int i = 1; i <= 99; i += 2) {
            jumlah += i;
        }
        System.out.println("Jumlah bilangan ganjil dari 1 hingga 99: " + jumlah);
    }
}