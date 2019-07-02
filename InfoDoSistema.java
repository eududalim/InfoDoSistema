
package infodosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;


public class InfoDoSistema {

    
    public static void main(String[] args) {
        // Mostrar Data
        Date relogio = new Date();
        System.out.println("Hora do sistema: " + relogio);
        
        // Mostrar Resolução    
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension resolucao = tk.getScreenSize();
        System.out.println("\nResolução de sua maquina: " + resolucao.width + " x " + resolucao.height);
        
        // Mostrar Idioma
        Locale loc = Locale.getDefault();
        String idioma  = loc.getDisplayLanguage();
        System.out.println("\nIdioma do sistema: " + idioma);
        
        
    }
    
}
