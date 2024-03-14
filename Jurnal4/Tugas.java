class Tugas {
    public String mataKuliah;
    public String namaTugas;
    public String deadline;

    public Tugas(String mataKuliah, String namaTugas, String deadline) {
        this.mataKuliah = mataKuliah;
        this.namaTugas = namaTugas;
        this.deadline = deadline;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Mata Kuliah: " + mataKuliah + ", Nama Tugas: " + namaTugas + ", Deadline: " + deadline;
    }
}
