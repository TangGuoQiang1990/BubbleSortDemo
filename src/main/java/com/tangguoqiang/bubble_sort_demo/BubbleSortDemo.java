package com.tangguoqiang.bubble_sort_demo;
/**
 * 冒泡排序
 * @author TangGuoQiang
 *
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,9,0,4,6,2,8,7,3};
        boolean flag = true;
        for(int i = 0; i < arr.length-1&&flag ; i++){
            flag = false;
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //数组没有重写toString方法
        System.out.println(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
