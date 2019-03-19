package JK;

import java.util.Random;

public class NumberPI {

    public double numberPi(int n) {
        double up = 0;
        double down = 0;
        for (int i = 1; i <= n; i++) {
            Random random = new Random();
            double x = random.nextDouble();
            double y = random.nextDouble();
            if (inRadius(x, y)) {
                up++;
            }
            down++;
        }
        return 4 * (up / down);
    }

    private boolean inRadius(double a, double b) {
        return Math.sqrt((a * a) + (b * b)) < 1;
    }

}
