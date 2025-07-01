public class App {
    public static void main(String[] args) {
        // Membuat pengguna baru
        Pengguna pengguna1 = new Pengguna("Udin", "udinpangan@gmail.com");

        // Menampilkan data pengguna
        pengguna1.tampilkanInfo();

        // Membuat donasi baru
        Donasi donasi1 = new DonasiMakanan("Beras", 10, "Kg", "2025-07-01");
        Donasi donasi2 = new DonasiPakaian("Baju Hangat", 5, "Layak Pakai");

        // Menampilkan detail donasi
        donasi1.tampilkanDetail();
        donasi2.tampilkanDetail();

        // Menambahkan donasi ke pengguna
        pengguna1.tambahDonasi(donasi1);
        pengguna1.tambahDonasi(donasi2);

        // Menampilkan semua donasi pengguna
        pengguna1.lihatRiwayatDonasi();
    }
}