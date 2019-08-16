package programapernas;

import java.util.Scanner;
/**
 *
 * @author Eduardo
 */
public class ProgramaPernas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas Pernas?: ");
        int perna = teclado.nextInt();
        String tipo;
        System.out.println("Isso é um(a) ");
        switch(perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede"; 
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                
        }
        System.out.println(tipo);
    }
    
}
