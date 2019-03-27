package cn.westlife.sort;

/**
 * 快速排序
 * 1. 选择一个基准元素,通常选择第一个元素或者最后一个元素
 * 2. 通过一趟排序讲待排序的记录分割成独立的两部分，其中一部分记录的元素值均比基准元素值小。另一部分记录的 元素值比基准值大。
 * 3. 然后分别对这两部分记录用同样的方法继续进行排序，直到整个序列有序。
 * 分治思想
 *
 * @author westlife
 * @date 2018/3/3
 */
public class QuickSortStrategy implements Sort {
    @Override
    public void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private void quickSort(int[] arr, int left, int right) {
        //直到 left + 1 = right
        if (left < right) {
            //获取枢纽值，并将其放在当前待处理序列末尾
            dealPivot(arr, left, right);
            //枢纽值被放在序列末尾
            int pivot = right - 1;
            //左指针
            int i = left;
            //右指针
            int j = right - 1;
            while (true) {
                while (arr[++i] < arr[pivot]) {
                }
                while (j > left && arr[--j] > arr[pivot]) {
                }
                if (i < j) {
                    //这里的交换相当于两次交换
                    swap(arr, i, j);
                } else {
                    break;
                }
            }
            if (i < right) {
                swap(arr, i, right - 1);
            }
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }

    private void dealPivot(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (arr[left] > arr[mid]) {
            swap(arr, left, mid);
        }
        if (arr[left] > arr[right]) {
            swap(arr, left, right);
        }
        if (arr[right] < arr[mid]) {
            swap(arr, right, mid);
        }
        swap(arr, right - 1, mid);
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
