package easy;

/**
 * @author linyilong
 * @createTime 2020/7/17 4:17 下午
 * @description
 */

/*
给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。

 说明:

 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。

 示例:
 输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]
 Related Topics 数组 双指针 */

public class Subject88 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,7,12,65,765};
        int[] nums2 = {1,2,3,5,6,9,45,333};
        merge0(nums1,3,nums2,3);
    }

    /**
     * 双指针 666 我自己写的！
     */
    public static void merge0(int[] nums1, int m, int[] nums2, int n) {
        while (n > 0) {
            int p = m + n - 1;
            if (m > 0 && nums1[m - 1] > nums2[n - 1]) {
                nums1[p] = nums1[m - 1];
                m--;
            } else {
                nums1[p] = nums2[n - 1];
                n--;
            }
        }
    }

    /**
     * 别人写的
     */
     public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int p = m-- + n-- - 1;
        while (m >= 0 && n >= 0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        // 原nums1没了，把nums2装进去
        while (n >= 0) {
            nums1[p--] = nums2[n--];
        }
    }
}
