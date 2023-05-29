/* Calcula a média de 500 números
Autora: Gabriela
Data: 24/05/2023
 */

 //Importar classes
 import java.util.Scanner;


 public class GabrielaVieira_Exercicio03 {
    public static void main (String []args) {
        Scanner reader = new Scanner (System.in);
        
        //Cria das variáveis
        int cont;
        double soma, media;

        //Inicialização das variáveis
        cont = 0;
        soma = 0.0;
        media = 0.0;
        
        //Pega os 500 números
        while (cont < 10) {
            System.out.println("Digite um número: ");

            //Pega o valor que o usuário colocou
            soma += reader.nextDouble();

            //Acrescenta a var cont
            cont++;
        }

            //Calcule a média
            media = soma / cont;

            System.out.println("A var 'soma' é: " + soma);

            System.out.println("A var 'cont' é " + cont);

            System.out.println("A média é: " + media);
            
            reader.close();

        }
    }