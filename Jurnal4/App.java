import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        LinkedList<Tugas> todo = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Delete Tugas");
            System.out.println("3. Lihat Tugas");
            System.out.println("4. Keluar");

            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Input data tugas");
                    System.out.print("Mata kuliah : ");
                    String mataKuliah = input.nextLine();
                    System.out.print("Tugas : ");
                    String namaTugas = input.nextLine();
                    System.out.print("Deadline (dd-mm-yyyy) : ");
                    String deadline = input.nextLine();
                    todo.add(new Tugas(mataKuliah, namaTugas, deadline));
                    break;
                case 2:
                    System.out.println("Masukkan nama tugas yang ingin dihapus: ");
                    String namaTugasHapus = input.nextLine();
                    ListIterator<Tugas> iterator = todo.listIterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().getNamaTugas().equals(namaTugasHapus)) {
                            iterator.remove();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("1. Print Depan\n2. Print Belakang");
                    int pilih = input.nextInt();
                    input.nextLine(); // Consume newline left-over
                    if (pilih == 1) {
                        for (Tugas tugas : todo) {
                            System.out.println(tugas);
                        }
                    } else if (pilih == 2) {
                        ListIterator<Tugas> it2 = todo.listIterator(todo.size());
                        while (it2.hasPrevious()) {
                            System.out.println(it2.previous());
                        }
                    } else {
                        System.out.println("Error");
                    }
                    break;
                case 4:
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}