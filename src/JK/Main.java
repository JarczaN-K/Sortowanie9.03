package JK;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Randomizer randomizer = new Randomizer();
        DataSet data = randomizer.generate(1000);
//
//
//        Sorter sorter = new Sorter(data, new HeapSorting());
//        sorter.execute();
//        DataSet dataSet = new Randomizer().generate(10);
//        Heap heap = new Heap(dataSet);
//        Sorter sorter = new Sorter(heap, new HeapSorting());
//        sorter.execute();
//        heap.heapify(0);
//        heap.print();
        //BalancedParenthesis.algorithm("()(()())(");
        NumberPI number = new NumberPI();
        System.out.format("%.2f",number.numberPi(100));
        System.out.println();
        Tree tree = new Tree();
        tree.add(5);
        tree.add(1);
        tree.add(6);
        tree.add(3);
        tree.add(10);
        tree.add(90);
        tree.add(8);
        tree.add(0);
        System.out.println();
        Sorter sorter = new Sorter(data, new QuickSorting());
        sorter.execute();


    }
}
