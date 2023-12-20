public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2010;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos Recentes");
        } else {
            System.out.println("Filme Retrô");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

    }
}
