package Q1;

public class VerificaFibonacci {
    public static boolean Fibonacci(int n){
        int num1=0, num2 =1, valorAnt;
        while (num1<n){
            valorAnt = num1;
            num1 = num2;
            num2 = valorAnt + num2;
        }
        return  num1==n;
    }
}
