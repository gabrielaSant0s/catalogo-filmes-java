import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Letura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // nextLine ler a linha e nextInt aceita so inteiro nextdouble aceita só double
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lançamento ?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("De nota ao filme:");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

        leitura.close();
    }
}
