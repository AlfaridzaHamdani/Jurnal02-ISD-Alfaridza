public class Bag {

    private String kode;
    private String jenis;
    private String nama;
    private int stok;

    public Bag(String kode, String jenis, String nama, int stok) {
        this.kode = kode;
        this.jenis = jenis;
        this.nama = nama;
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public int getStok() {
        return stok;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Kode: " + kode + " Jenis: " + jenis + " Nama: " + nama + " Stok: " + stok;
    }

}