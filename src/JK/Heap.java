package JK;


import java.util.Arrays;

public class Heap extends DataSet{
    private int[] data = new int[]{4, 1, 3, 2, 16, 9, 10, 14, 8, 7};

    private int heapSize = data.length;

    public Heap(DataSet proxy) {
        super(proxy);

        for (int i = heapSize - 1; i >= 0; i--){
            heapify(i);
        }
    }

    public int parent(int i) {
        int result = (i - 1) / 2;

        return result;
    }

    public int left(int i) {
        int result = (i + 1) * 2 - 1;

        return result;
    }

    public int right(int i) {
        int result = (i + 1) * 2;

        return result;
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }


    public void swap(int x, int y) {
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;

    }


    public void heapify(int i) {

        int l = left(i);
        int r = right(i);
        int largest = getLargest(i, l, r);
        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

    //    public int getLargestIndex(int i, int l, int r) {
//        int result = 0;
//        if (i < data.length && l < data.length && r < data.length && data[i] > data[l] && data[i] > data[r]) {
//            result = i;
//        } else if (l < data.length && r < data.length && data[l] > data[r]) {
//            result = l;
//        } else {
//            result = r;
//        }
//        return result;
//    }
    private int getLargest(int i, int left, int right) {
        int largest;

        if (left < heapSize && data[left] > data[i]) {
            largest = left;
        } else {
            largest = i;
        }

        if (right < heapSize && data[right] > data[largest]) {
            largest = right;
        }

        return largest;
    }

    public int decrease(){
        int result = heapSize--;
        return result;
    }
}
