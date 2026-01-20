package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internetifg internetReal = new Internetifg();
    private static List<String> sitesBloqueados;

    static {
        sitesBloqueados = new ArrayList<>();
        sitesBloqueados.add("jogos.com");
        sitesBloqueados.add("facebook.com");
        sitesBloqueados.add("youtube.com");
    }

    @Override
    public void conectarPara(String site) {
        if (sitesBloqueados.contains(site.toLowerCase())) {
            System.out.println("Site " + site + " bloqueado nesta rede.");
        } else {
            
            internetReal.conectarPara(site);
        }
    }
}
