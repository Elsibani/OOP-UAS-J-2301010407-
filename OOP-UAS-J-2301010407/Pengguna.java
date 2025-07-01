import java.util.ArrayList;
import java.util.List;

public class Pengguna {
    private String nama;
    private String email;
    private List<Donasi> daftarDonasi;

    public Pengguna(String nama, String email) {
        this.nama = nama;
        this.email = email;
        this.daftarDonasi = new ArrayList<>();
    }

    public void tampilkanInfo() {
        System.out.println("=== Informasi Pengguna ===");
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }

    public void tambahDonasi(Donasi donasi) {
        daftarDonasi.add(donasi);
        System.out.println("Donasi berhasil ditambahkan.\n");
    }

    public void lihatRiwayatDonasi() {
        System.out.println("=== Riwayat Donasi " + nama + " ===");
        for (Donasi d : daftarDonasi) {
            d.tampilkanDetail();
        }
    }
}