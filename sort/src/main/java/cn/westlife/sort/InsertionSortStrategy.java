package cn.westlife.sort;

/**
 * 直接插入排序
 *
 * @author westlife
 * @date 2018/3/3
 */
public class InsertionSortStrategy implements Sort {


    @Override
    public void sort(int[] a) {
        // i 位置之前是有序的，之后是无序的，待插入的
        for (int i = 1; i < a.length; i++) {
            //如果 a[i] < a[i-1]，需要移动有序表后插入，否则直接插入，即位置不变
//            if (a[i] < a[i - 1]) {
//                int j = i - 1;
//                int x = a[i];
//                a[i] = a[i - 1];
//                while (x < a[j]) {
//                    a[j + 1] = a[j];
//                    j--;
//                }
//                //插入正确位置
//                a[j + 1] = x;
//            }
//            System.out.println(Arrays.toString(a));
            int x = a[i];
            int j = i;
            while (j - 1 > 0 && x < a[j - 1]) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = x;
        }
    }
}
