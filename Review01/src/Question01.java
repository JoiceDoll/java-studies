import java.util.Random;

public class Question01 {
    private static final String[] NOME = {"Jorge", "Matheus", "Gustavo", "Lucas"};
    private static final String[] POSICAO = {"goleiro", "zagueiro", "lateral", "meio-campo", "atacante"};
    private static final String[] CLUBE = {"gremio", "Inter", "palmeiras", "São Paulo", "flamengo"};

    public static void main(String[] args) {
        Random random = new Random();
        String nome = NOME[random.nextInt(NOME.length)];
        int idade = random.nextInt(24) + 17;
        String posicao = POSICAO[random.nextInt(POSICAO.length)];
        String clube = CLUBE[random.nextInt(CLUBE.length)];

        System.out.println(nome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + ". Atualmente defende o " + clube + ".");
    }
}
