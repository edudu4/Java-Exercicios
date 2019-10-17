package exercicio03;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);
       int numero[] = new int[10];
       
       for(int i = 0; i < 10; i++){
           System.out.print("Digite algum valor: ");
           numero[i] = leia.nextInt();
           if(numero[i] % 2 == 0){
               System.out.println(numero[i]);
               numero[i] = 0;
               System.out.println("A iteração " + i + " Passou a valer " + numero[i]);
               
           } else{
           System.out.println(numero[i]);
           numero[i] = 1;
           System.out.println("A iteração " + i + " Passou a valer " + numero[i]);

       }
           
       }
    }
    
}
