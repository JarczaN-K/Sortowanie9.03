package JK;

import java.util.Arrays;

public class DataSet {
    public int[] data;

    public DataSet(int x) {
        data = new int[x];
    }

    public DataSet(DataSet proxy) {
        this.data = proxy.data;
    }

    public int get(int x) {
        return data[x];
    }

    public void set(int x, int y) {
        data[x] = y;
    }

    public int getSize() {
        return data.length;
    }

    public void swap(int x, int y) {
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;

    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }
}
