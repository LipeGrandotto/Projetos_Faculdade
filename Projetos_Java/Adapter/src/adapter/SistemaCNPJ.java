package adapter;


public class SistemaCNPJ {
    public void checarCNPJ(String cnpj) {
        if(cnpj.length() == 14) {
            System.out.println(" CNPJ Valido!");
        } else {
            System.out.println("Erro. Número de digitos inválido ");
        }
    }
}
