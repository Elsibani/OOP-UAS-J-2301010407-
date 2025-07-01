public class DonasiPakaian extends Donasi {
    private String kondisi;

    public DonasiPakaian(String namaBarang, int jumlah, String kondisi) {
        super(namaBarang, jumlah);
        this.kondisi = kondisi;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("- Donasi Pakaian: " + namaBarang + " (" + jumlah + " pcs), Kondisi: " + kondisi);
    }
}