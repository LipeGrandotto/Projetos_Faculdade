package observer;

import java.util.ArrayList;
import java.util.List;


public class Assinantes {
    
    List<Notifica> assinantes;
    
    public Assinantes(){
        assinantes = new ArrayList<>();
    }
    
    public void addAssinante (Notifica notifica){
        assinantes.add(notifica);
    }
    
    public void removeAssinante(int notifica){
        assinantes.remove(notifica);
    }
    
    public void notificarTodos(){
        for(Notifica n: assinantes){
            n.notificar();
        }
    }
    
    public void listar(){
        for(Notifica n: assinantes){
            System.out.println(n.toString());
        }
   }
}
