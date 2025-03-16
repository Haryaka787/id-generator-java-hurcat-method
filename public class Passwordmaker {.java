import java.util.Random;
import java.util.Scanner;
import java.util.Stringbuilder;
class GeneratorWords {

    // Method void untuk menghasilkan dan menampilkan kata acak
    public static void generate(int length) {
        Random random = new Random();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a'); // Generate huruf kecil acak
            word.append(randomChar);
        }

        System.out.println("Kata acak: " + word.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the word:");
        int length = scanner.nextInt(); // Input panjang kata
        

        generate(length); // Panggil method void

        StringBuilder sb = new StringBuilder()  ;

        System.out.print("masukkan kata ya");
        String kata = scanner.nextLine();
        String revervion = sb.reverse().toString();
        scanner.close();
        System.out.println("Kata yang anda masukkan: " + kata);
        System.out.print("Masukkan jumlah anak anda: ");
        int jumlahAnak = scanner.nextInt();
        scanner.nextLine(); // Bersihkan buffer

        // Langkah 2: Masukkan nama anak satu per satu
        String[] namaAnak = new String[jumlahAnak];
        for (int i = 0 ; i < namaAnak.length ; i++) {
            System.out.print("Masukkan nama anak " + (i + 1) + ": ");
            namaAnak[i] = scanner.nextLine();
        }

        // Langkah 3: Cetak daftar absen
        System.out.println("\n=== Daftar Absen ===");

        for (int i = 0 ; i < jumlahAnak ; i++) {
            System.out.println((i + 1) + " : " + namaAnak[i]);
        }

        scanner.close();
    }
}