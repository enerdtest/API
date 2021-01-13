package testOOPs;

import OOPs.*;
import org.testng.annotations.Test;
import utility.printArray;

public class testOOPs {
    @Test(enabled = false)
    public void testString(){
        workingWithString splitString = new workingWithString();
        splitString.stringWithRegex("aaa123bbbe34238273*#&$*");
    }
    @Test(enabled = false)
    public void testMergeSort(){
        int arr[] = {12, -1, -20,0, 23, 31, 32,98,0, 16};
        mergeSort mergeSort = new mergeSort();
        printArray printArray = new printArray();

        System.out.println("The array before sorting! ");
        printArray.testSprintArray(arr);

        mergeSort.sort(arr, 0, arr.length -1);
        System.out.println("Array after Sorting! ");
        printArray.testSprintArray(arr);

    }

    @Test(enabled = false)
    public void testQuickSort(){
        int arr[] = {12, -1, -20,0, 23, 31, 32,98,0, 16};
        int arrLen = arr.length;
        quickSort quickSort = new quickSort();
        printArray printArray = new printArray();

        System.out.println("The array before doing sorting: ");
        printArray.testSprintArray(arr);

        System.out.println("the array after do quick sorting: ");
        quickSort.sort(arr,0, arrLen-1);
        printArray.testSprintArray(arr);
    }

    @Test(enabled = false)
    public void concatString(){
        String str = "immuteable ";
        str.concat("mute");
        System.out.println(str);

        String HN = "HANOI";
        String hn = "hanoi";
        System.out.println(hn.equalsIgnoreCase(HN));
        System.out.println(hn.equals(HN));
        System.out.println(hn.compareToIgnoreCase(HN));

    }

    @Test(enabled = false)
    public void testLinearSearch(){
        int arr[] = {12 ,34, 01, 3, 5, 32, 24, 56,-1, -8, 12};
        int key = -8;
        linear linear  = new linear();
        linear.linearSearch(arr, key);
    }

    @Test(enabled = false)
    public void binarySearch(){
        int arr[] = {12 ,34, 01, 3, 5, 32, 24, 56,-1, -8, 12};
        int len = arr.length;
        int key = 12;
        binary binary = new binary();
        int result = binary.binarySearch(arr, 0, len - 1, key);
        if (result == -1)
            System.out.println("your searching keyword not found! " + key);
        else
            System.out.println("your searching keyword found " + key);
    }

    @Test(enabled = true)
    public void bubbleSort(){
        int arr[] = {0 ,0, 01, 1,0, 1, 0, 0,1, 1, 10};
        bubbleSort bubbleSort = new bubbleSort();
        bubbleSort.bubbleSortArr(arr);
        printArray print = new printArray();
        print.testSprintArray(arr);
    }

    @Test(enabled = false)
    public void testLargestArr(){
        int arr[] = {12 ,34, 01, 3, 5, 32, 24, 56,-1, -8, 12, 10000};
        findLargest largest = new findLargest();
        largest.largestArr(arr);
    }

}
