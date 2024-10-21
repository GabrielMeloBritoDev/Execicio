package Q2;

import java.util.Scanner;

public class VerificaLetra {
    public static void main(String[] agrs) {
        Scanner p1 = new Scanner(System.in);

        System.out.println("Informe uma string: ");
        String input = p1.nextLine().toLowerCase();
        int numeroDeA = 0;
        for(int i =0; i<input.length(); i++){
            if (input.charAt(i) == 'a'){
                numeroDeA++;
            }
        }
        if(numeroDeA>0){
            System.out.println("A letra 'a' aparece "+ numeroDeA +"vez(es)");
        }else{
            System.out.println("A letra 'a' não aparece");
        }
    }
}
