package Q1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String [] agrs){
        VerificaFibonacci fibonacci = new VerificaFibonacci();
        Scanner p1 = new Scanner(System.in);
        System.out.println("Informe um número");
        int num = p1.nextInt();

        if(fibonacci.Fibonacci(num)){
            System.out.println(num +"  pertence a sequência de Fibonacci");
        }else{
            System.out.println(num +" não pertenca a sequência");
        }

    }
}
