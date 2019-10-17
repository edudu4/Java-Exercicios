package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
     int vetor20[] = new int[20];
     for(int i = 0; i < 20; i++){
      System.out.print("Digite algum valor: ");
      vetor20[i] = leia.nextInt();
      if(vetor20[i] < 0){
          vetor20[i] = 0;
          System.out.println("A iteração " + i + " passou a valer " + vetor20[i]);
      }
      
      
      
     }   
     
        
     
    }
    
}
