package OOPs.Algo;

public class PeekElement {
    public int peekElement(int[] arr, int len){
        if (len == 1)
            return arr[0];
        if (arr[0] >= arr[1])
            return arr[0];
        if (arr[len -1] >= arr[len -2])
            return arr[len -1];

        for (int i =1; i < len-1;i++){
            if (arr[i] >= arr[i-1] &&
                    arr[i] >= arr[i+1])
                return arr[i];
        }
        return arr[0];
    }

    public int peekWithBinary(int arr[], int low, int high, int len){

            //Find mid element
        int mid = low +(high -low)/2;
        if ((mid == 0 || arr[mid -1] <= arr[mid]) &&
                (mid == len - 1 || arr[mid + 1] <= arr[mid]))
            return mid;
        else if (mid > 0 && arr[mid -1] > arr[mid])
            return peekWithBinary(arr, low, (mid -1), len);
        else
            return peekWithBinary(arr, (mid + 1), high, len);
    }
    public int findPeek(int arr[], int len){
        return peekWithBinary(arr, 0, len -1, len);
    }

}
