package cursoUm;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int tentativa = 1;

        while (tentativa <= 5) {
            System.out.println(String.format("============ Adivinhe o número tentativa %d =============", tentativa));
            System.out.println("Digite um numero:");
            int numeroDigitado = leitura.nextInt();

            if (numeroDigitado > numeroAleatorio) {
                System.out.println("Numero digitado maior que numero sorteado!");
            }
            else if (numeroDigitado < numeroAleatorio) {
                System.out.println("Numero digitado menor que numero sorteado!");
            }
            else {
                System.out.println("Você acertou! O número sorteado é " + numeroAleatorio);
                break;
            }

            tentativa++;

            if (numeroDigitado != numeroAleatorio && tentativa == 6) {
                System.out.println("Você perdeu o numero digitado era " + numeroAleatorio);
            }

        }

    }
}
