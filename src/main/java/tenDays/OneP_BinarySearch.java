package tenDays;

public class OneP_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,13,15,38};
        int t= 15;
        System.out.println(binarySearch(arr, t, 0, arr.length-1));
    }
    public static int binarySearch(int[] arr, int t, int l, int h){
        int mid = (l+h)/2;
        if(arr[mid] == t){
            return mid;
        }else if(arr[mid] < t){
           return binarySearch(arr, t, mid+1, h);
        }else {
          return   binarySearch(arr, t, l, mid-1);
        }
    }
}
