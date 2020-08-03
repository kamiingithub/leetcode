package basic.tree.sort;

import java.util.Arrays;

/**
 * @author linyilong
 * @createTime 2020/8/3 6:03 下午
 * @description
 */
public class Insertion{
    public static void main(String[] args) {
        int[] arr = { 1, 0, 3, 4, 5, -6, 7, 8, 9, 10 };
        System.out.println("原始数据: " + Arrays.toString(arr));
        arr = insertion(arr);
        System.out.println("插入排序: " + Arrays.toString(arr));
    }
    public static int[] insertion(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
