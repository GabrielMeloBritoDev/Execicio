package Q3;

public class CalculaIndice {
     public static void main(String[] agrs){
         int indice = 12;
         int soma = 0;
         int K = 1;
         while (K<indice){
             K = K+1;
             soma = soma +K;
         }
         System.out.println("O valor da soma é: "+soma);
     }
}
