import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JogadorGerador {

    public static void main(String[] args) throws Exception {
        String uri = "https://gitlab.com/snippets/1896187/raw";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String[] jogadorInfo = response.body().split(",");
        String nome = jogadorInfo[0];
        String sobrenome = jogadorInfo[1];
        String posicao = jogadorInfo[2];
        String clube = jogadorInfo[3];

        Jogador jogador = new Jogador(nome, sobrenome, posicao, clube);

        System.out.println(jogador.getDescricao());

    }
}

class Jogador {
    private String nome;
    private String sobrenome;
    private String posicao;
    private String clube;

    public Jogador(String nome, String sobrenome, String posicao, String clube) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
        this.clube = clube;
    }


    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getClube() {
        return clube;
    }

    public String getDescricao(){
        return nome + sobrenome + "é um futebolista brasileiro de  32 anos que atua como " + posicao + ". Atualmente defende o " + clube + ".";
    }
}

