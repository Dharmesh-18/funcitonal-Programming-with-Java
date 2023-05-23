import java.util.Scanner;

public class Closet {

    private static int result;

    public static void main(String[] args) {

        Closet classObject = new Closet();
        int result = classObject.fact(5);
        System.out.println(result);
    }

    public int fib(int n){
        if(n < 0){
            return -1;
        }
        if(n == 0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);

    }

    public int fact(int n){
        if(n == 0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }
}
