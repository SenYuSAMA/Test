package algorithm.sort;

import java.util.Arrays;

/**
 * @description: 选择排序，不稳定的，因为在交换的过程中，本来在前的可能会到后面去
 * @author: l1usy
 * @time: 2020/11/3 14:14
 */
public class SelectSort implements IArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        for(int i =0;i<arr.length-1;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        int[] toDo = {1,-2,4,2,9,5,1,6,99,0,-4,14};
        toDo = selectSort.sort(toDo);
        for(int i :toDo){
            System.out.print(i + ",");
        }
    }
}
