package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String filme = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (!filme.equalsIgnoreCase("sair")) {

            System.out.println("Digite o Filme que você deseja buscar: ");
            filme = leitura.nextLine();

            if (filme.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + filme.replace(" ", "+") + "&apikey=32f5bde7";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                // Buscar bibliotecas java https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-javadoc-plugin
                // para desserializar o json vamos usar o GSON
                // fiz o download do gson via jar
                // Para fazer ele funcionar vamos em file->Project Structure ->Project Sttings -> Modules -> Dependencies e add esse arquivo .jar

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);

            } catch (NumberFormatException erro) {
                System.out.println("Ocorreu um erro: ");
                System.out.println(erro.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);

        //salvando dados em um arquivo json
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();


    }
}

