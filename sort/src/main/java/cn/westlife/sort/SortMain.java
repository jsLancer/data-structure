package cn.westlife.sort;

import java.util.Arrays;

/**
 * @author westlife
 * @date 2018/3/3
 */
public class SortMain {

    public static void main(String[] args) {
//        Sort sort = new InsertionSortStrategy();
//        Sort sort = new BubbleSortStrategy();
//        Sort sort = new ShellSortStrategy();
//        Sort sort = new SelectionSortStrategy();
//        Sort sort = new HeapSortStrategy();
//        Sort sort = new QuickSortStrategy();
        Sort sort = new MergeSortStrategy();

        int[] a = new int[]{1, 6, 5, 2, 3, 4, 9, 7, 8};
        sort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
