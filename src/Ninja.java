public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("O nome do ninja: " + nome);
        System.out.println("A idade: " + idade);
        System.out.println("A missão: " + missao);
        System.out.println("A nível de dificuldade: " + nivelDificuldade);
        System.out.println("O status da missão é:" + statusMissao);
    }

}
