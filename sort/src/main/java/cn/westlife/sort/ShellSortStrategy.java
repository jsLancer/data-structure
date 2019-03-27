package cn.westlife.sort;

/**
 * 希尔排序
 *
 * @author westlife
 * @date 2018/3/3
 */
public class ShellSortStrategy implements Sort {
    @Override
    public void sort(int[] a) {

        for (int dk = a.length / 2; dk >= 1; dk /= 2) {
            for (int i = dk; i < a.length; i++) {
                int x = a[i];
                int j = i;
                while (j - dk > 0 && x < a[j - dk]) {
                    a[j] = a[j - dk];
                    j -= dk;
                }
                a[j] = x;
            }
        }
    }
}
