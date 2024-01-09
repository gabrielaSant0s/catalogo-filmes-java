package cursoUm;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("De nota ao filme:");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println(String.format("Media de avaliação: %.2f",mediaAvaliacao/3));





    }
}
