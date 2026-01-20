package proxy;


public class Internetifg implements Internet{
    @Override
    public void conectarPara(String site) {
        System.out.println("Conectando ao servidor: " + site);
    }
}
