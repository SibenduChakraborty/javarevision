package Reboot;

public class binarysearch {
    static int bsearch(int[] arr, int start, int end, int target){
        int mid= (end+start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(start==end){
                if (arr[start]==target){
                    return start;
                }
                return -1;
            }
            if(arr[mid]>target){
                return bsearch(arr, start, mid-1, target);
            }
            else if(target>arr[mid]){
                return bsearch(arr, mid+1, end, target);
            }
            return -1;
        }
    public static void main(String[] args) {
         int[] arr={1,2,3,4,5,6};
        System.out.println(bsearch(arr, 0, arr.length-1, 4));
    }
}
