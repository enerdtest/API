package OOPs.Algo;

import java.util.HashSet;

public class FindPairEqualSum {
    //Find by hashing
    public void pairEqualSum(int arr[], int sum){
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i  = 0; i < arr.length; i++){
            int temp = sum - arr[i];
            if (hashSet.contains(temp)){
                System.out.println("Pair of given sum: " + sum + " is (" + arr[i] + ", "+ temp +")");
            }
            hashSet.add(arr[i]);
        }
    }
    //find by sorting and 2 pointers
    public boolean SumOf2Elements(int[] arr, int len, int sum){
        BubbleSort bubble = new BubbleSort();
        int left = 0;
        int right = len -1;
        bubble.bubbleSortArr(arr);

        while (left < right){
            if (arr[left] + arr[right] == sum)
                return true;
            else if (arr[left] + arr[right] < sum)
                left++;
            else
                right--;
        }
        return false;
    }
}
