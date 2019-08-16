package primeira.aplicação;

import java.util.Scanner;

public class PrimeiraAplicação {
   
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.printf("A nota de %s é %.1f %s \n", nome, nota, valor);
        
    }
    
}
