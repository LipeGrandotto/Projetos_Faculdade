package adapter;

public class SistemaCPF {
    public void validarCPF(String cpf){
        if (cpf.length() == 11){
            System.out.println("CPF valido");
        }else{
        System.out.println("ERRO! Número de digitos inválido");}
    }  
}

