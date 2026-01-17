package NivelIntermediario.Desafio;

public class Kazegake extends Ninja{
    String habilidadeEspecial;

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("A habilidade especial: " + habilidadeEspecial);

    }
}
