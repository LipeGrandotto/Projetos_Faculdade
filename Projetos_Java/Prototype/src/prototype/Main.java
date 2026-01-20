package prototype;

public class Main {

    public static void main(String[] args) {
        Usuario user1 = new Usuario();
        user1.setID(01);
        user1.setEmail("Luiz@gmail.com");
        user1.setNome("LUIZ");
        user1.setSenha("SenhaMuitoDificil123");
        
        var clone = user1.clone();
        
        System.out.println(user1);
        System.out.println(clone);
    }
    
}
