package programamedia;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class ProgramaMedia {
    public static void main(String[] args) {
 
        Scanner t = new Scanner(System.in);
        System.out.print("Escreva o ano de nascimento: ");
        int nasc = t.nextInt();
        int idade = 2019 - nasc;
        System.out.println("Sua idade é " + idade);
        if (idade >= 18){
            System.out.println("Maior de idade.");
        }   else{
            System.out.println("Menor de Idade");
        }
    }
    
}
