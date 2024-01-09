package desafioCursoDois;

public class Musica extends Audio implements Ficha {
    private String artista;
    private String album;
    private String genero;

    @Override
    public void ficha (){
        System.out.println(String.format(
                """
                Artista : %s
                Título : %s
                Album : %s
                Genero : %s
                Duraçao em minutos : %d
                Total de Reproduções : %d
                Curtidas : %d
                Classificação : %s
                """
                ,artista, getTitulo(), album, genero, getDuracaoEmMinutos(),
                getTotalDeReproducoes(), getCurtidas(), getClassificacao())
        );
    }

    @Override
    public String getClassificacao (){
        if (getTotalDeReproducoes() >= 1000){
            return "Essa música é um sucesso!";
        } else {
            return "Essa música ainda é desconhecida!";
        }
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
