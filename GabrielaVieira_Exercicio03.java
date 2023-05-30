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
        int contador;
        double somadora, media;

        //Inicialização das variáveis
        contador = 0;
        somadora = 0.0;
        media = 0.0;
        
        //Pega os 500 números
        while (contador < 500) {
            System.out.println("Digite um número: ");

            //Pega o valor que o usuário colocou
            somadora += reader.nextDouble();

            //Acrescenta a var cont
            contador++;
        }

            //Calcule a média
            media = somadora / contador;

            System.out.println("A var 'somadora' é: " + somadora);

            System.out.println("A var 'contador' é " + contador);

            System.out.println("A média é: " + media);
            
            reader.close();

        }
    }
