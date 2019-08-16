package operadorternario;
/**
 *
 * @author Eduardo
 */
public class OperadorTernario {
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, z;
        x = 4;
        y = 7;
        z = 14;
        boolean r;
        r = (x<y^y<z)?true:false;
        System.out.println(r);
    } 
    
}
