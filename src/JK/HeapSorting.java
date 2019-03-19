package JK;

public class HeapSorting implements SortingStrategy {
    @Override
    public DataSet sort(DataSet data) {
        Heap heap = new Heap(data);
        for (int i = heap.getSize() - 1; i >= 0; i--) {
            heap.swap(0, i);
            heap.decrease();
            heap.heapify(0);
        }
        return data;
    }
}
