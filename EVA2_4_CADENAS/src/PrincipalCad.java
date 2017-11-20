/*IMPRIMIR CADENA
 */

/**
 *
 * @author 15060769
 */
public class PrincipalCad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 10; i++) {
            System.out.println(crearCadena(i));    
        }
        for (int i = 9; i > 0; i--) {
            System.out.println(crearCadena(i));
        }
        
    }
    
    public static String crearCadena(int iNum){
        if(iNum>1)
            return "*"+crearCadena(iNum-1);
        else
            return "*";
    }
    
}
