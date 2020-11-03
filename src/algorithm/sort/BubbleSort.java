package algorithm.sort;

import java.util.Arrays;

/**
 * @description: 冒泡排序，稳定的
 * @author: l1usy
 * @time: 2020/11/3 9:26
 */
public class BubbleSort  implements IArraySort{
    @Override
    public  int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        boolean flag = false;
        //第一层循环表示第几次遍历
        for(int i=1;i<arr.length;i++){
            flag = true;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] toDo = {1,4,2,9,5,1,6,99,0,-4,14};
        toDo = bubbleSort.sort(toDo);
        for(int i :toDo){
            System.out.print(i + ",");
        }
    }

}
