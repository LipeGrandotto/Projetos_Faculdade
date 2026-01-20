package observer;


public class Cliente implements Notifica {
    private String nome;
    private boolean notificado;
    
    public Cliente(String nome) {
        this.nome = nome;
        this.notificado = false;
    }
    
    @Override
    public void notificar(){
        this.notificado = !this.notificado;
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", notificado=" + notificado + '}';
    }
    
    
}