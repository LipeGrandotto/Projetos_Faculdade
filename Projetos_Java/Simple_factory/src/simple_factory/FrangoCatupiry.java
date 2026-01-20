
package simple_factory;

public class FrangoCatupiry extends Pizza{
    public FrangoCatupiry() {
        this.nome = "Pizza Frango com Catupiry";
    }

    @Override
    public void preparar() {
        System.out.println(nome + ": Adicionando Mussarela, Catupiry e Frangio.");
    }
}
