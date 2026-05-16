package principal;

import GUI.JanelaPrincipal;
import preferencias.Config;

public class Main {
    
    public static void main(String[] args) {
        Config.loadConfig();
        JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
        janelaPrincipal.setVisible(true);
    }
}
