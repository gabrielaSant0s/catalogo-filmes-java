public class Filme {
    // atributos
    String nome;
    int anoDeLancamento;
    boolean incluidonoPlano;

    // privando/encapsulando o atributo ( o atributo nao pode ser nem lido nem reescrito fora da classe)
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //métodos
    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    // void é usado pra métodos sem return
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    //métodos com retorno utiliza o tipo de dado que o metodo vai retornar
    double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    // getter para pegar valor do atributo privado
    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

}
