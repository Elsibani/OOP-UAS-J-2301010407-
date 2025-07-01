public class DonasiMakanan extends Donasi {
    private String satuan;
    private String tanggalKadaluwarsa;

    public DonasiMakanan(String namaBarang, int jumlah, String satuan, String tanggalKadaluwarsa) {
        super(namaBarang, jumlah);
        this.satuan = satuan;
        this.tanggalKadaluwarsa = tanggalKadaluwarsa;
    }

    @Override
    public void tampilkanDetail() {
        System.out.println("- Donasi Makanan: " + namaBarang + " (" + jumlah + " " + satuan + "), Exp: " + tanggalKadaluwarsa);
    }
}