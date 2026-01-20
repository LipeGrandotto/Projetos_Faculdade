package composite;


public class Main {

    public static void main(String[] args) {
        ItemSistema arquivo1 = new Arquivo("foto.img");
        ItemSistema arquivo2 = new Arquivo("Atividade.pdf");
        ItemSistema arquivo3 = new Arquivo("VScode.exe");

     
        Pasta pastaJogos = new Pasta("Compilador");
        Pasta pastaDocumentos = new Pasta("Documentos");
        Pasta pastaRaiz = new Pasta("Disco principal");

      
        pastaJogos.adicionar(arquivo3);

        
        pastaDocumentos.adicionar(arquivo2);
        
    
        pastaRaiz.adicionar(arquivo1);       
        pastaRaiz.adicionar(pastaDocumentos); 
        pastaRaiz.adicionar(pastaJogos);      

      
        System.out.println("Estrutura");
        
        pastaRaiz.mostrarDetalhes("");
    }
}
