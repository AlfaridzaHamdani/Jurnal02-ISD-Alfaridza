public class Jurnal2 {
    public static void main(String[] args) {
        GenArrList<ATK> atkInven = new GenArrList<>();
        GenArrList<Bag> bagInven = new GenArrList<>();

        atkInven.addItems(new ATK("A001", "Pensil", "Pensil 2B", 100));
        atkInven.addItems(new ATK("A002", "Pulpen", "Pulpen 0.5", 100));
        atkInven.addItems(new ATK("B001", "Buku", "Buku Gambar", 100));
        atkInven.addItems(new ATK("B002", "Buku", "Buku Tulis", 100));
        atkInven.addItems(new ATK("A003", "Pensil", "Pensil Warna", 100));
        atkInven.deleteItems(1);

        bagInven.addItems(new Bag("C001", "Bag", "Tas Selempang", 100));
        bagInven.addItems(new Bag("C002", "Bag", "Tas Gendong", 100));
        bagInven.addItems(new Bag("C003", "Bag", "Totebag", 100));
        bagInven.addItems(new Bag("C004", "Bag", "Koper", 100));
        bagInven.addItems(new Bag("C005", "Bag", "Waist Bag", 100));
        bagInven.editItems(2, new Bag("null", "null", "null", 0));

        for (ATK atk : atkInven.displayData()) {
            System.out.println("============================");
            System.out
                    .println("Kode barang: " + atk.getKode() + "\nJenis barang: " + atk.getJenis() + "\nNama barang: "
                            + atk.getNama() + "\nStok barang: " + atk.getStok());
        }

        for (Bag bag : bagInven.displayData()) {
            System.out.println("============================");
            System.out.println("Kode barang: " + bag.getKode() + "\nJenis barang: " + bag.getJenis() + "\nNama barang: "
                    + bag.getNama() + "\nStok barang: " + bag.getStok());
        }
        System.out.println("============================");
    }
}
