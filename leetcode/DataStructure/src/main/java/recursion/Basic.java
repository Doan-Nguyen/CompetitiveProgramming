package recursion;

public class Basic {
    public static int factorial(int n){
        //      Bai toan co so
        if (n==0){
            return 1;
        }
        //      Cong thuc quy nap
        return n*factorial(n-1);
    }

    public static int fibonacci(int n){
        if (n <= 2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args){
//        System.out.println(factorial(5));
        System.out.println(fibonacci(5));
    }

}
