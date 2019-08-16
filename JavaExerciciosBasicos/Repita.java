package repita;
import javax.swing.JOptionPane;
/**
 *
 * @author Eduardo
 */
public class Repita {
    public static void main(String[] args) {
        int n = 0; 
        int s = 0; 
        int t = 0; 
        int p = 0;
        int i = 0;
        int cem = 0; 
        int media = 0;
        do {
            
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um "
                + "Número: <br><em>(valor 0 interrompe!)</em></html>"));
        s+=n;
        t++;
        } while(n != 0 );
            
        
        t -= 1;
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <br><hr>" + 
                "<br>Somatório vale " + s + "<br>Total de Valores: " + t + 
                "</html>");
    }
    
}
