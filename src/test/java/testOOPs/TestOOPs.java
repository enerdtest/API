package testOOPs;

import OOPs.*;
import OOPs.Algo.*;
import org.testng.annotations.Test;
import utility.PrintArray;

import java.util.Scanner;

public class TestOOPs {
    @Test(enabled = false)
    public void testString(){
        WorkingWithString splitString = new WorkingWithString();
        splitString.stringWithRegex("aaa123bbbe34238273*#&$*");
    }
    @Test(enabled = false)
    public void testMergeSort(){
        int arr[] = {12, -1, -20,0, 23, 31, 32,98,0, 16};
        MergeSort mergeSort = new MergeSort();
        PrintArray printArray = new PrintArray();

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
        QuickSort quickSort = new QuickSort();
        PrintArray printArray = new PrintArray();

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

    @Test(enabled = true)
    public void testLinearSearch(){
        int arr[] = {12 ,34, 01, 3, 5, 32, 24, 56,-1, -8, 12};
        int key = -8;
        LinearSearch LinearSearch = new LinearSearch();
        LinearSearch.linearSearch(arr, key);
    }

    @Test(enabled = false)
    public void binarySearch(){
        int arr[] = {12 ,34, 01, 3, 5, 32, 24, 56,-1, -8, 12};
        int len = arr.length;
        int key = 12;
        BinarySearch BinarySearch = new BinarySearch();
        int result = BinarySearch.binarySearch(arr, 0, len - 1, key);
        if (result == -1)
            System.out.println("your searching keyword not found! " + key);
        else
            System.out.println("your searching keyword found " + key);
    }

    @Test(enabled = true)
    public void bubbleSort(){
        int arr[] = {7 ,0, 01, 8, 3, 1, 0, 20, 17, 1000, 10};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSortArr(arr);
        PrintArray print = new PrintArray();
        print.testSprintArray(arr);
    }

    @Test(enabled = false)
    public void testLargestArr(){
        int arr[] = {12 ,34, 01, 3, 5, 32, 24, 56,-1, -8, 12, 10000};
        FindLargest largest = new FindLargest();
        largest.largestArr(arr);
    }

    @Test(enabled = false)
    public void testScanner(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Your input is " + a);
    }

    @Test(enabled = false)
    public void testOddEven(){
        int num = 2;
        OddEven OddEven =  new OddEven();
        OddEven.oddEven(num);
        int result;
     for (int i =1; i <= 10; i++){
         result = num * i;
         System.out.println(num + " x " + i + " = " + result);
     }

     int t=1;

     for(int i = 0; i<t; i++){
         int a = 5, b =3, n =5;
         int result1 = a;
         for (int j = 0; j<n; j++){
            result1 += (int) (Math.pow(2, j)*b);
             System.out.printf("%s ", result1);
         }
         System.out.println();
     }
    }

    @Test(enabled = false)
    public void appendString(){

        String str = "aaa123bbbe34238273*#&$*";
        StringBuffer alpha = new StringBuffer(),
                number = new StringBuffer(),
                special = new StringBuffer();
        for (int i = 0; i<str.length(); i++){
            if (Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));
            else if (Character.isDigit(str.charAt(i)))
                number.append(str.charAt(i));
            else
                special.append(str.charAt(i));
        }
        System.out.println("Alphabet after splitting " + alpha);
        System.out.println("Number after splitting " + number);
        System.out.println("Special char after splitting " + special);
    }

    @Test(enabled = false)
    public void mergeArrays(){
        int arr1[] = {12, 11, 02, 07};
        int arr2[] = {28, 1, 22, 17};
        WorkingWithString withString = new WorkingWithString();
        withString.mergeArrays(arr1, arr2);
    }

    @Test(enabled = false)
    public void testAbstract(){
        int arr1[] = {12, 11, 02, 07};
        int arr2[] = {12, 11, 02, 07};
        InheAbstract inhe = new InheAbstract();

//        inhe.mergeArrays(arr1, arr2);
        inhe.printAbstract();
        inhe.absMethod();
        inhe.draw();
    }

    @Test(enabled = false)
    public void findPeekElement(){
        PeekElement peek = new PeekElement();
        int arr[] = {10, 20, 15, 2, 23, 67, 90};
        int len = arr.length;
        System.out.println("Peek element is: " + peek.peekElement(arr, len));

        System.out.println("Peek element with Binary is: " + peek.findPeek(arr, len));
    }

    @Test
    public void staticVariable(){
        StaticVariable s1 = new StaticVariable(110, "Kalyan");
        StaticVariable s2 = new StaticVariable(112, "Dunion");
        StaticVariable s3 = new StaticVariable(123, "Mice");

        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();
    }

}
