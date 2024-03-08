public class buku {
    private String judulBuku;
    private String penulisBuku;
    private String tahunTerbit;

    public buku(String judulBuku, String penulisBuku, String tahunTerbit) {
        this.judulBuku = judulBuku;
        this.penulisBuku = penulisBuku;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    @Override
    public String toString() {
        return "\nJudul buku: " + judulBuku + "\nPenulis Buku: " + penulisBuku + "\nTahun Terbit: " + tahunTerbit
                + "\n";
    }
}