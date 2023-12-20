

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o GabiFlix!");
        System.out.println("Barbie Moda e Magia");

        int anoDeLancamento = 2010;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        String sinopse;
        sinopse = """
                Filme de Fantasia da barbie
                Muito bom!
                """ + anoDeLancamento;
        System.out.println(sinopse);

        double media = (8.9 + 7.5 + 10) / 3;

        int classificacao;
        // casting
        classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}

