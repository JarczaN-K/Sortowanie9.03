package JK;

public class BubbleSorting implements SortingStrategy {

    @Override
    public DataSet sort(DataSet data) {
        for (int i = 0; i < data.getSize(); i++) {
            for (int j = i + 1; j < data.getSize(); j++) {
                if (data.get(i) > data.get(j)) {
                    data.swap(i, j);
                }
            }
        }
        return data;
    }
}
