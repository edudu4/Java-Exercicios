package exercicio01;

import java.util.Scanner;

public class AulaVisualg {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       System.out.println ("###############Vetores###############");
        int numero[] = new int[3] ;
        int maior = 300000;
        int menor = 0; 
        int impar = 0;
        for(int i = 0; i < 3; i++ ){
            System.out.print("Escreva aqui o número: ");
            numero[i] += leia.nextInt();
            if(numero[i] < menor){
                menor = numero[i];
            }
            if(numero[i] > maior){
                maior = numero[i];
            }
            if(numero[i]% 2 == 1){
                impar+= numero[i];
            }
        }
        System.out.println("O conteúdo da posição 3 é: " + numero[2]);
        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("O valor da soma dos ímpares é: " + impar);
        System.out.println("##########FimPrograma##########");
    }
}
