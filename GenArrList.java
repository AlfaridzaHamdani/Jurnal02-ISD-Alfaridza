import java.util.ArrayList;

public class GenArrList<E> {
    private ArrayList<E> inven;

    public GenArrList() {
        inven = new ArrayList<>();
    }

    public void addItems(E item) {
        inven.add(item);
    }

    public void deleteItems(int index) {
        inven.remove(index);
    }

    public void editItems(int i, E item) {
        inven.set(i, item);
    }

    public ArrayList<E> displayData() {
        return inven;
    }

}