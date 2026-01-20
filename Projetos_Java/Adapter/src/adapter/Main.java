package adapter;


public class Main {

    public static void main(String[] args) {
        
        String inputCPF = "12345678901";
        String inputCNPJ = "12345678000199";

        SistemaCPF sistemaLegadoCPF = new SistemaCPF();
        ValidaDoc adaptador1 = new AdapterCPF(sistemaLegadoCPF);
        
        SistemaCNPJ sistemaLegadoCNPJ = new SistemaCNPJ();
        ValidaDoc adaptador2 = new AdapterCNPJ(sistemaLegadoCNPJ);

        System.out.println("DOC 1");
        adaptador1.validar(inputCPF); 

        System.out.println("\nDOC 2");
        adaptador2.validar(inputCNPJ); 
    }
}