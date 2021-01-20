package OOPs.Algo;

public class BubbleSort {

    public void bubbleSortArr(int arr[]){
        int arrLen = arr.length;
        for (int i =0; i < arrLen -1; i++)
            for (int j = 0; j < arrLen - i -1; j++)
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
