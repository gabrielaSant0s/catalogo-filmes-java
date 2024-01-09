package desafioCursoDois;

public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.setAlbum("Red");
        musica.setArtista("Taylor Swift");
        musica.setGenero("Pop");
        musica.setTitulo("22");
        musica.setDuracaoEmMinutos(4);

        for (int i = 0; i < 1000; i++) {
            musica.curtir();
        }

        for (int i = 0; i < 1200; i++) {
            musica.reprosuzir();
        }
        musica.ficha();

        Podcast podcast = new Podcast();
        podcast.setHost("Pod");
        podcast.setConvidados("Blogueirinha");
        podcast.setTitulo("Adoração");
        podcast.setDuracaoEmMinutos(40);
        for (int i = 0; i < 500; i++) {
            podcast.curtir();
        }

        for (int i = 0; i < 2000; i++) {
            podcast.reprosuzir();
        }
        podcast.ficha();

    }
}
