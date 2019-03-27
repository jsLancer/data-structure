package cn.westlife.sort;

/**
 * 选择排序
 *
 * @author westlife
 * @date 2018/3/3
 */
public class SelectionSortStrategy implements Sort {
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }
}
