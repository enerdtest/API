package OOPs;

public class quickSort {
    private int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for (int j = low; j<high; j ++){
            // If current element is smaller than the pivot
            if (arr[j]<pivot){
                i++;
                //swap a[i] vs a[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and a[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public void sort(int arr[], int low, int high){
        if(low < high){
            int partition = partition(arr, low, high);
            sort(arr, low, high-1);
            sort(arr, partition+1, high);
        }
    }
}
