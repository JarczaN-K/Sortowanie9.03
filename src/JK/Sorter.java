package JK;

import java.time.Duration;
import java.time.Instant;

public class Sorter {

    public Sorter(DataSet data, SortingStrategy sortingStrategy) {
        this.data = data;
        this.sortingStrategy = sortingStrategy;
    }

    private DataSet data;

    private SortingStrategy sortingStrategy;

    public void execute() {
        data.print();
        Instant start = Instant.now();

        DataSet sorted = sortingStrategy.sort(data);

        Instant end = Instant.now();
        long duration = Duration.between(start, end).toMillis();
        System.out.println("*" + duration + "*");
        sorted.print();
    }
}
