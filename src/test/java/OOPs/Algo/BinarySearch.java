package OOPs.Algo;

public class BinarySearch {
    public int binarySearch(int arr[], int left, int right, int key){

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSortArr(arr);
        if(right >= left){
            int mid = left + (right - left)/2;
            if (arr[mid] == key)
                return mid; 
            if (arr[mid] > key)
                return binarySearch(arr, left, mid -1, key);
        }
        System.out.println("your searching keyword " + key + " not found!");
        return -1;
    }

}
