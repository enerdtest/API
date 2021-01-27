package OOPs.Algo;

public class Fibonacci {

    //Fibonacci with recursion
    public int recursion(int n){
        if(n <= 1)
            return n;
        return recursion(n-1) + recursion(n -2);
    }

    //Fibonacci with dynamic
    public int fibonacci(int n){
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
            for (int i = 2 ; i <= n; i++){
                c = a + b;
                a = b;
                b = c;
                System.out.println("fibo of i " + i + " is " + c);
            }
            return b;
    }
}

