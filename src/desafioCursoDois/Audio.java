package desafioCursoDois;


public class Audio {
    private String titulo;
    private int duracaoEmMinutos;
    private int totalDeReproducoes;
    private int curtidas;
    private String classificacao;


    public int curtir(){
        return this.curtidas++;
    }

    public int reprosuzir(){
        return this.totalDeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public String getClassificacao(){
        return this.classificacao;
    }

}
