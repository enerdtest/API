package utility;

public class PrintArray {
    public void testSprintArray(int arr[]){
        int len = arr.length;
        for (int i = 0; i < len; i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }
}