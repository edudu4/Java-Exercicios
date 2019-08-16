package vetor02;

import java.util.Scanner;
/**
 *
 * @author Eduardo
 */
public class Vetor02 {
    public static void main(String[] args) {
        String aninho;
        int ano = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o ano?");
        ano = input.nextInt();
		
	if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
		aninho = "true";
	}
	else{
	                 aninho = "false";
	}
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
"Julho", "Agosto","Setembro", "Outubro", "Novembro", "Dezembro"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int c = 0; c < mes.length; c++){
            if(aninho == "true"){
                tot[1] = 29; 
            } else {
                tot[1] = 28;
        }
            System.out.println("O mês de " + mes[c] + " tem " + tot[c] + " dias ao"
                    + " todo.");
        }
    }
    
}
