package algorithm.sort;

import java.util.Arrays;

/**
 * @description: 插入排序，稳定的
 * @author: l1usy
 * @time: 2020/11/3 15:35
 */
public class InsertSort implements IArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        for(int i = 1;i < arr.length;i++){
            int temp = arr[i];
            int j = i;
            while(j > 0 && temp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            if(j!=i){
                arr[j] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        int[] toDo = {1,-2,4,2,9,5,1,6,99,0,-4,14};
        toDo = insertSort.sort(toDo);
        for(int i :toDo){
            System.out.print(i + ",");
        }
    }
}
