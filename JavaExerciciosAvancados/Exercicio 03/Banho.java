package exercicio02aula02;

import java.util.Scanner;


public class Banho {
    String temperatura;
    boolean lavar;
    boolean ligado;
    
    
    void status(){
        System.out.println("O chuveiro está ligado: " + this.ligado);    
        if (ligado == true){
            System.out.println("O banho está: "+ this.temperatura);
            System.out.println("Vou me lavar?: " + this.lavar);
        } else {
            System.out.println("Não há como eu me lavar se o chuveiro está"
                    + " desligado.");
        }
    }
    void ensaboar(){
        if(ligado == true){
          System.out.println("Estou me ensaboando...");
        } else {
          System.out.println("Não estou banhando no momento.");
        }
       
    }
    void ligarchuveiro(){
        ligado = true;
        System.out.println("O chuveiro está ligado.");
    }
    void desligarchuveiro(){
        ligado = false;
        System.out.println("O chuveiro está desligado.");
    }
    void satisfacao(){
        if (ligado == true){
            
        
        Scanner qual = new Scanner(System.in);
        System.out.println("Qual nota você daria a este banho?: "); 
        int satisfação = qual.nextInt();
        if(satisfação >= 7){
            System.out.println("Hmmm... Que banho gostoso!");
        } else {
            System.out.println("Bom, ao menos me sinto mais limpo.");
            
        }
        }
    }
}
