public class Main {

    public static void main(String[] args) {

        //Criando um objeto do tipo Personagem Mágico
        PersonagemMagico mago = new PersonagemMagico();

        //Atribuindo valores aos atributos do objeto
        mago.nome = "Gandalf";
        mago.nivelEnergia = 100;
        mago.poderMagico = "Magia";

        //Exibindo valores dos atributos do objeto
        System.out.println(mago.nome + " Energia: " + mago.nivelEnergia + " Poder: " + mago.poderMagico);
    }
}