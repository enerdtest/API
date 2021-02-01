package testOOPs;


import OOPs.Abstract.CheckAllCharsSame;
import OOPs.Algo.*;
import OOPs.CallByValue;
import OOPs.InnerClass;
import org.testng.annotations.Parameters;
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

    @Test(groups = "HackerRank", description = "Merge 2 arrays ")
    public void mergeArray(){
        int arr[] = {12, 29, 30, 23, 16};
        int arr1[] = {12,21,3,4,1,5};
        System.out.println("Merge 2 arrays ");
        new Merge2Arrays(arr, arr1);
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

    @Test(groups = "HackerRank", dependsOnMethods = "recursionWithFactorial")
    public void fibonacciWithDynamic(){
        Fibonacci fb = new Fibonacci();
        int n = 8;
        if (n > 0)
            System.out.println("Fibonacci of "+ n + " is " + fb.fibonacci(n));
        else
            System.out.println("There is no fibonacci for "+ n);
    }

    @Test(groups = "HackerRank")
    public void recursionWithFactorial(){
        Fibonacci fb = new Fibonacci();
        int n = 5;
        System.out.println("Factorial of 5 is " + fb.factorial(n));
    }

    @Test(enabled = false)
    public void getOddDays(){
        OddDays odd = new OddDays();
        int givenYear = 600;
        System.out.println(odd.OddDays(givenYear));
    }
    @Test(groups = "HackerRank")
    public void division(){
        int num1 = -12;
        int num2 = 3;
        Division division = new Division();
        System.out.println(division.divisionWithoutOperation(num1, num2));
        System.out.println(division.divisionSubtracting(num1, num2));
        System.out.println(num1 * Math.pow(num2, -1));
        System.out.println(Math.pow(num2, -1));
        System.out.println(Math.pow(num1, -1));
        System.out.println(Math.pow(num2, -2));
    }

    @Test(groups = "HackerRank", dependsOnMethods = "division")
    public void callByValue(){
        CallByValue call = new CallByValue();
        System.out.println("Before changing value " + call.data);
        call.change(200);
        System.out.println("After changing value : " +call.data);
    }

    @Test(groups = "HackerRank", dependsOnMethods = "callByValue" )
    public void innerClass(){
        InnerClass inner = new InnerClass();
        InnerClass.defaultPrint innerClass = new InnerClass.defaultPrint();
        System.out.println(innerClass.passWord("aaaaaaa"));
        inner.innerClassMethod();
    }

    @Test(groups = "HackerRank")
    @Parameters({"a", "b"})
    public void paramTestNG(int c, int d){
        System.out.println("print something! ");
        int e = c + d;
        System.out.println("value of a + b is " + e);
    }

    @Test(groups = "HackerRank")
    public void getDayByGivenDate(){
        GetDayByGivenDate getDate = new GetDayByGivenDate();
        String date = "2020-10-19";
        getDate.GetDayByGivenDate(date);
        getDate.findDate(date);
        getDate.getDay(12, 9, 2020);
        getDate.findDay(10,12,2020);
    }
    @Test(groups = "permutation")
    public void permutation(){
        Permutations per = new Permutations();
        CheckAllChars allChars = new CheckAllChars();

        String arr = "a";
        int len = arr.length();

        if (allChars.allCharsSame(arr) != true) {
            System.out.println("All permutations of the String are ");
            per.generatePermutation(arr, 0, len - 1);
        } else {
            System.out.println(" Do not need to be swapped!");
        }
    }
}
