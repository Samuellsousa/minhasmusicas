import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.print("digite um numero entre 0 e 100: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Parabens, voçê acertou o número em " + tentativas + "tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("o numero digitado é menor que o numero gerado.");
            } else {
                System.out.println("O numero digitado é maior que o numero gerado.");
            }

        }
            if (tentativas == 5){
                System.out.println("Voce não conseguiu adivinhar o numero em 5 tentativas. O numero era " + numeroGerado);
            }
    }
}