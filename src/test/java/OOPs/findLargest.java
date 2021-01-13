package OOPs;

public class findLargest {
    public int largestArr(int arr[]){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        System.out.println("your largest number found: " + max);
                return max;
    }
}
