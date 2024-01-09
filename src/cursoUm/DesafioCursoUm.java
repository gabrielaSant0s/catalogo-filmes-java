package cursoUm;

import java.util.Scanner;

public class DesafioCursoUm {
    public static void main(String[] args) {
        Scanner leituraTeclado = new Scanner(System.in);

        String nome = "Gabriela Motta";
        String tipoDeConta = "corrente";
        double saldoInicial = 1000;
        int operacao = 1;

        while (operacao != 4) {
            String dadosCadastrais = String.format(
                    """
                    **************************************************
                    Dados iniciais do cliente:
                    
                    Nome: %s
                    Tipo conta: %s
                    Saldo inicial: R$ %.2f
                    
                    **************************************************
                    """
            ,nome,tipoDeConta,saldoInicial);
            System.out.println(dadosCadastrais);

            String menu = String.format(
                    """
                    
                    Operações
                    
                    1- Consultar Saldos
                    2- Receber valor
                    3- Transferir valor
                    4 - Sair
                    
                    Digite a opção desejada:
                    """);
            System.out.println(menu);
            operacao = leituraTeclado.nextInt();

            switch (operacao){
                case 1:
                    System.out.println(dadosCadastrais);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja inserir: ");
                    double valorRecebido = leituraTeclado.nextDouble();
                    saldoInicial += valorRecebido;
                    System.out.println("Seu novo saldo é " + saldoInicial);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja retirar: ");
                    double valorRetirado = leituraTeclado.nextDouble();

                    if (saldoInicial < valorRetirado){
                        System.out.println("Saldo insuficiente para realizar essa operação!!");
                        break;
                    }

                    saldoInicial -= valorRetirado;
                    System.out.println("Seu novo saldo é " + saldoInicial);
                    break;
                case 4:
                    System.out.println("""
                            **************************************************
                            
                            Obrigada pela confiança !!
                            
                            **************************************************
                            """);
                    break;
                default:
                    System.out.println("Operação inválida!");
                    break;
            }
        }

    }
}
