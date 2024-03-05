package com.algorithm.leetocde150;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-2-29 13:55
 * @description:
 */
public class Demo01 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        /**
         * 建立临时数组，大小为2个数组之和-1
         * 依次获取最大的数，然后放到数组的末尾 当前数组序号-1，temp数组也-1
         * 0舍弃
         */

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        for (int num : nums1 ) {
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        Demo01 demo01 = new Demo01();
        demo01.merge(nums1,m,nums2,n);
    }
}
