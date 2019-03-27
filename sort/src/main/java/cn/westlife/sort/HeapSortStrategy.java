package cn.westlife.sort;

/**
 * 堆排序
 *
 * @author westlife
 * @date 2018/3/3
 */
public class HeapSortStrategy implements Sort {
    @Override
    public void sort(int[] a) {
        //1.构建大顶堆
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(a, i, a.length);
        }
        //2.调整堆结构 + 交换堆顶元素与末尾元素
        for (int j = a.length - 1; j > 0; j--) {
            //将堆顶元素与末尾元素进行交换
            swap(a, 0, j);
            //重新对堆进行调整
            adjustHeap(a, 0, j);
        }
    }

    private void adjustHeap(int[] a, int i, int length) {
        int temp = a[i];
        for (int j = i * 2 + 1; j < length; j = j * 2 + 1) {
            //如果左子结点小于右子结点，k指向右子结点
            if (j + 1 < length && a[j] < a[j + 1]) {
                j++;
            }
            if (a[j] > temp) {
                a[i] = a[j];
                i = j;
            } else {
                break;
            }
        }
        a[i] = temp;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
