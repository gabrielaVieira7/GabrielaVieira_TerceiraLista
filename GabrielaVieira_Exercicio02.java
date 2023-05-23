/*leia dois valores e mostre todos os números entre eles
Autora: Gabriela
Data: 22/05/2023
*/

import java.util.Scanner;

public class GabrielaVieira_Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int val1 = leitor.nextInt();
        
        System.out.println("Digite outro número inteiro: ");
        int val2 = leitor.nextInt();
        
        System.out.println("Números entre " + val1 + " e " + val2 + ":");
        
        int tes;
        if (val1 <= val2) {
            tes = val1 + 1;
            do {
                System.out.println(tes);
                tes++;
            } while (tes < val2);
        } else {
            tes = val1 - 1;
            do {
                System.out.println(tes);
                tes--;
            } while (tes > val2);

            leitor.close();
        }
    }
}