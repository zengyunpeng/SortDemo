package com.example.administrator.demo;

/**
 * 首页 - 支付
 *
 * @author Zyp
 * @date 2019/3/15
 */
public class Test {
    @org.junit.Test
    public void xuanze() {
        int[] arr = {3, 65, 334, 68, 45, 89, 23, 44};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @org.junit.Test
    public void buble() {
        int arr[] = {3, 65, 334, 68, 45, 89, 23, 44};
        int temp;
        for (int i = arr.length; i >= 0; i--) {
            for (int j = 1; j < i; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //最原始的插入排序
    @org.junit.Test
    public void simpleInsert() {
        int arr[] = {3, 65, 334, 68, 45, 89, 23, 44};
        int temp;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //插入排序
    @org.junit.Test
    public void insert2() {
        int j;
        int arr[] = {3, 65, 334, 68, 45, 89, 23, 44};
        int temp;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {//做一层限制,如果最后一个值是大于前一个值,那就不排序,因为本省就是有序的
                temp = arr[i];
                for (j = i - 1; temp < arr[j]; --j) {//从后面开始排起,第一个值,如果小于带插入的值,就把前一位值赋给后一位,
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @org.junit.Test
    public void insert3() {
        int j;
        int arr[] = {3, 65, 334, 68, 45, 89, 23, 44};
        int temp;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                temp = arr[i];
                for (j = i - 1; arr[j + 1] < arr[j]; j--) {//这种插入排序比上面插入排序多了一个赋值操作,效率稍低
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //折半插入排序,数组长度必须大于三个.
    @org.junit.Test
    public void divisionInsert() {
        int arr[] = {3, 65, 333, 68, 45, 89, 23, 44};
        int i, j, low, high, middle, temp;

        for (i = 2; i < arr.length; i++) {
            low = 0;
            high = i - 1;
            temp = arr[i];
            while (low <= high) {//插入排序+折半
                middle = (low + high) / 2;
                if (temp < arr[middle]) {
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
            }

            for (j = i - 1; j >= high + 1; --j) {
                arr[j + 1] = arr[j];
            }
            arr[high + 1] = temp;

        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

    /**
     * 第一趟增量为5，直接插入排序第1，6个元素，第2，7个元素，第3，8个元素，第4，9个元素，第5，10个元素
     * <p>
     * 第二趟增量为3，直接插入排序第1，3，6，9个元素，第2，5，8个元素，第7，10个元素进行排序
     * <p>
     * 第三趟增量为1，直接插入排序第1到10个元素进行排序。
     */
    @org.junit.Test
    public void shellSort() {
        int a[] = {50, 26, 38, 80, 70, 90, 8, 30, 40, 20};
        int dk;
        int i, j;
        for (dk = a.length / 2; dk >= 1; dk = dk / 2) {        //步长变化,实际上共有dk个分组进行插入排序
            for (i = 0; i < dk; i++) {                    //分别对每个dk分组进行排序
                for (j = i + dk; j < a.length; j += dk) {
                    if (a[j] < a[j - dk]) {
                        int temp = a[j];
                        int k = j - dk;
                        while (k >= 0 && a[k] > temp) {
                            a[k + dk] = a[k];
                            k -= dk;
                        }
                        a[k + dk] = temp;
                    }
                }
            }

        }

        for (int anA : a) {
            System.out.print(anA + " ");
        }
    }

    @org.junit.Test
    public void qucikSort() {//快速排序（Quicksort）是对冒泡排序的一种改进
        int arr[] = {50, 26, 38, 80, 70, 90, 8, 30, 40, 20};
        int standard;//基准数
        int j;
        int k;
        int left;
        int right;
        int temp;
        standard = arr[0];
        j = 0;
        k = arr.length;
        while (j < k) {


        }
    }
}
