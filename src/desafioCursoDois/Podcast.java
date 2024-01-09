package desafioCursoDois;

public class Podcast extends Audio implements Ficha{
    private String host;
    private String convidados;

    @Override
    public void ficha (){
        System.out.println(String.format(
                """
                Host : %s
                Convidados : %s
                Título : %s
                Duraçao em minutos : %d
                Total de Reproduções : %d
                Curtidas : %d
                Classificação : %s
                """
                ,host, convidados, getTitulo(), getDuracaoEmMinutos(),
                getTotalDeReproducoes(), getCurtidas(), getClassificacao())
        );
    }

    @Override
    public String getClassificacao (){
        if (getCurtidas() >= 1000){
            return "Essa podcast é um estouro!";
        } else {
            return "Essa podcast ainda é irrelevante!";
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getConvidados() {
        return convidados;
    }

    public void setConvidados(String convidados) {
        this.convidados = convidados;
    }
}
