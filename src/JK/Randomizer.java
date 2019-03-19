package JK;

import java.util.Random;

public class Randomizer {

    public DataSet generate() {
        return generate(10);
    }

    public DataSet generate(int x) {
        DataSet dataSet = new DataSet(x);
        Random random = new Random(5);
        for (int i = 0; i < x; i++) {
            int losowa = random.nextInt(1000);
            dataSet.set(i, losowa);
        }
        return dataSet;
    }
}
