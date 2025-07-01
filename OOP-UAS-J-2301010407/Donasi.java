public abstract class Donasi {
    protected String namaBarang;
    protected int jumlah;

    public Donasi(String namaBarang, int jumlah) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
    }

    public abstract void tampilkanDetail(); // Overriding wajib
}