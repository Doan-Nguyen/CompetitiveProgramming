public class Fibonacci {
    public static int fibonacci(int n){
        if (n <= 2){
            return 1;
        }
        System.out.println("Can tinh F[" + n + "]");
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacciOpt(int n){
        int[] f = new int[n];
        //
        if (f[n] != 0)
            return f[n];
        System.out.println("Can tinh F[" + n + "]");
        //
        if (n <= 2){
            f[1] = 1;
            f[2] = 1;
            return 1;
        }
        f[n] = fibonacciOpt(n - 1) + fibonacciOpt(n - 2);
        return f[n];
    }

    public static void main(String[] args){
        System.out.println(fibonacciOpt(10));

        int[] f = new int[11];
        //
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i < 11; i++){
            f[i] = f[i - 1] + f[i - 2];
        }
    }
}
