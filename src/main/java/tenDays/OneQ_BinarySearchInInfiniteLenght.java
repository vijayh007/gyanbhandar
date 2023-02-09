package tenDays;

public class OneQ_BinarySearchInInfiniteLenght {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88};
        System.out.println(searchInfinite(arr, 44));
    }
    public static int searchInfinite(int[] arr, int key){
        int low = 0;
        int high = 1;
        while (arr[high] < key){
            low = high;
            high = 2+high;
        }
        return OneP_BinarySearch.binarySearch(arr,key,low,high);
    }
}
