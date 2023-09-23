package Reboot;

public class binarysearch2 {
    static int bsearch2(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= (end+start)/2;
            if(arr[mid]>target){
                start=mid+1;
            }
            else if(target>arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(bsearch2(arr,3));;
    }
}

