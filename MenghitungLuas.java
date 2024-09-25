import java.util.Scanner;

public class MenghitungLuas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan bangun datar
        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan Anda: ");

        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1: // Persegi
                System.out.print("Masukkan sisi persegi: ");
                double sisi = scanner.nextDouble();
                double luasPersegi = sisi * sisi;
                double kelilingPersegi = 4 * sisi;

                System.out.printf("Luas persegi: %.1f%n", luasPersegi);
                System.out.printf("Keliling persegi: %.1f%n", kelilingPersegi);
                break;

            case 2: // Persegi Panjang
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebar = scanner.nextDouble();
                double luasPersegiPanjang = panjang * lebar;
                double kelilingPersegiPanjang = 2 * (panjang + lebar);

                System.out.printf("Luas persegi panjang: %.1f%n", luasPersegiPanjang);
                System.out.printf("Keliling persegi panjang: %.1f%n", kelilingPersegiPanjang);
                break;

            case 3: // Lingkaran
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = scanner.nextDouble();
                double luasLingkaran = Math.PI * jariJari * jariJari;
                double kelilingLingkaran = 2 * Math.PI * jariJari;

                System.out.printf("Luas lingkaran: %.1f%n", luasLingkaran);
                System.out.printf("Keliling lingkaran: %.1f%n", kelilingLingkaran);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
