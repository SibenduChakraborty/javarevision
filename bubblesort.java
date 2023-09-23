package Reboot;

import java.util.Arrays;

public class bubblesort {
    static int[] BubbleSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            boolean swapped= false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={9,1,6,3,5,7};
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }
}
