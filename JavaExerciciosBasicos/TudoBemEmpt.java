package olaempty;
/**
 *
 * @author Eduardo
 */
public class OlaEmpty {
    
public static void main(String[] args) {
	   String nome = "João";
	   imprimeNome("Empt");
}
public static void imprimeNome(String nome) {
	   if(!nome.isEmpty()){
		    System.out.println("Tudo bem " + nome + "?");
	   } else { 
		    System.out.println("O nome é " + nome + "?");
	   }
}
}