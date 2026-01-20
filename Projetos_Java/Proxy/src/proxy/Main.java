package proxy;


public class Main {


    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        internet.conectarPara("google.com");
        internet.conectarPara("jogos.com");
    
    }
}
