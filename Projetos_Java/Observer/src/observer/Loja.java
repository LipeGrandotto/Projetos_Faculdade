package observer;

public class Loja {
    private boolean temCelular;
    private Assinantes assinantes;
    
    public Loja(){
        this.temCelular = false;
        this.assinantes = new Assinantes();
    }
    
    public void inscrever(Notifica notifica){
        this.assinantes.addAssinante(notifica);
    }
    
    public void desinscrever(int i){
        this.assinantes.removeAssinante(i);
    }
    
    public Boolean isTemCelular(){
        return this.temCelular;
    }

    public void setTemCelular(boolean temCelular) {
        this.temCelular = temCelular;
    }
    
    public void chegouCelular (){
        this.temCelular = true;
        this.assinantes.notificarTodos();
    }   
    
    public void listar(){
        this.assinantes.listar();
    }
}
