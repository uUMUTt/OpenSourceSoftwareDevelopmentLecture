public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        BinarySearch bs = new BinarySearch();
        int arr[] = {4,8,6,9,3};
        int n = arr.length;
        int x = 6;
        int result = bs.binarySearch(arr,x);
        if (result == -1){
            System.out.println("Element not present");
        }
        else{
            System.out.println("Element found at"+ "index"+ result);
        }

    }

    
}
