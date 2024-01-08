package br.com.alura.screenmatch.modelos;

public class Titulo {
    // atributos
    private String nome;
    private int anoDeLancamento;
    private boolean incluidonoPlano;

    // privando/encapsulando o atributo ( o atributo nao pode ser nem lido nem reescrito fora da classe)
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //métodos
    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    // void é usado pra métodos sem return
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    //métodos com retorno utiliza o tipo de dado que o metodo vai retornar
    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    // getter para pegar valor do atributo privado
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidonoPlano() {
        return incluidonoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //setters
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos (int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidonoPlano(boolean incluidonoPlano) {
        this.incluidonoPlano = incluidonoPlano;
    }
}
