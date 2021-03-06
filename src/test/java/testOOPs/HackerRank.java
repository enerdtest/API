package testOOPs;


import OOPs.Algo.Fibonacci;
import OOPs.Algo.FindPairEqualSum;
import OOPs.Algo.OddDays;
import OOPs.Algo.PairMinMax;
import org.testng.annotations.Test;
import utility.PrintArray;

public class HackerRank {
//    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input an integer number:");
//        int in = scanner.nextInt();
//        String st = scanner.nextLine();
//        if (in > 0) {
//            for (int i = 0; i < in; i++) {
//                try {
//                    System.out.println("Input a long number:");
//                    long x = scanner.nextLong();
//                    System.out.println(x + " can be fitted in:");
//                    if (x >= -128 && x <= 127) System.out.println("* byte");
//                    //Complete the code
//                    if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
//                        System.out.println("* short");
//                    if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
//                        System.out.println("* int");
//                    if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
//                        System.out.println("* long");
//                } catch (Exception e) {
//                    System.out.println(scanner.next() + " can't be fitted anywhere.");
//                }
//            }
//        } else {
//            System.out.println("You input an invalid number " + in);
//        }
//        scanner.close();
//    }


    @Test(enabled = false)
    public void minMax(){
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        PairMinMax min = new PairMinMax();
        System.out.println("Min of array is : " + min.getMinValue(arr));
        System.out.println("Max of array is : " + min.getMaxValue(arr));
    }

    @Test(enabled = false)
    public void findGivenSum(){
        FindPairEqualSum pairEqualSum = new FindPairEqualSum();
        PrintArray print = new PrintArray();
        int arr[] = {1, 23, 13, 5, 8, 4,11, 90,6};
        int sum = 14;

        System.out.println("Array after sorting ");
        pairEqualSum.pairEqualSum(arr,sum);

        if (pairEqualSum.SumOf2Elements(arr, arr.length, sum))
        System.out.println("Array has 2 " + " elements with given sum");
        else
            System.out.println("Array does not have " + " elements with given sum");
        print.testSprintArray(arr);
    }

    @Test(enabled = false)
    public void fibonacciWithRecursion(){
        int n =8;
        Fibonacci fib = new Fibonacci();
        if (n > 0)
            System.out.println("Fibonacci of "+ n + " is " + fib.recursion(n));
        else
            System.out.println("There is no fibonacci for "+ n);
    }

    @Test(enabled = false)
    public void fibonacciWithDynamic(){
        Fibonacci fb = new Fibonacci();
        int n = 8;
        if (n > 0)
            System.out.println("Fibonacci of "+ n + " is " + fb.fibonacci(n));
        else
            System.out.println("There is no fibonacci for "+ n);
    }

    @Test
    public void getOddDays(){
        OddDays odd = new OddDays();
        int givenYear = 600;
        System.out.println(odd.OddDays(givenYear));
    }
}
