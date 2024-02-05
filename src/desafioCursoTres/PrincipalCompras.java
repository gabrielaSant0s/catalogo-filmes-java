package desafioCursoTres;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PrincipalCompras {
    public static void main(String[] args) {

        // inicializacao de variaveis
        Scanner leituraTeclado = new Scanner(System.in);
        int operacao = 1;
        List listaDeCompras = new ArrayList<>();

        // primeiro comando
        System.out.println("Digite o limite do cartão: ");
        double limite = leituraTeclado.nextDouble();

        while (operacao != 0){
            // instanciamento
            Compras compra = new Compras(limite);
            compra.setSaldo(limite);

            // adicionando nome do objeto comprado
            System.out.println("Digite a descrição da compra:");
            String nomeCompra = leituraTeclado.next();
            compra.setNomeObjetoCompra(nomeCompra);

            // adicionando valor do objeto comprado
            System.out.println("Digite valor da compra:");
            double valorCompra = leituraTeclado.nextDouble();
            compra.setValorObjetoCompra(valorCompra);

            //efetuando compra
            if ( compra.realizandoCompra() == -1){
                operacao = 0;
                System.out.println("Saldo Insuficiente!");
                break;
            }

            //adicionando a lista
            listaDeCompras.add(compra);

            System.out.println("Compra Realizada!");
            System.out.println("Digite 0 para sair e 1 para continuar ");
            operacao = leituraTeclado.nextInt();
        }

        listaDeCompras.sort(Comparator.comparing(Compras::getValorObjetoCompra));

        // menu com saldo final
        System.out.println("###################");
        System.out.println("COMPRAS REALIZADAS: ");
        System.out.println();
        for (Object compra : listaDeCompras){
            System.out.println(compra);
        }
        System.out.println();
        System.out.println("###################");
    }
}
