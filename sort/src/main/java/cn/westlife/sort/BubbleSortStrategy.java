package cn.westlife.sort;

/**
 * 冒泡排序
 * @author westlife
 * @date 2018/3/3
 */
public class BubbleSortStrategy implements Sort {
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }
}
