package JK;

public class QuickSorting implements SortingStrategy {

    @Override
    public DataSet sort(DataSet data) {
        quicksort(data, 0, data.getSize() - 1);
        return data;
    }

    private void quicksort(DataSet data, int begin, int end) {
        if (begin < end) {
            int q = partition(data, begin, end);
            quicksort(data, begin, q - 1);
            quicksort(data, q + 1, end);
        }
    }

    private int partition(DataSet data, int begin, int end) {
        int pivot = data.get(end);
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (data.get(j) <= pivot) {
                i++;
                data.swap(i, j);
            }
        }
        data.swap(i + 1, end);
        return i + 1;
    }
}
