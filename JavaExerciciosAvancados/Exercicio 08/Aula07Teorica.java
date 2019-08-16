package aula07teorica;
public class Aula07Teorica {
    public static void main(String[] args) {
       Lutador c[] = new Lutador[6];
               c[0] = new Lutador("Pretty boy","França",31,1.75f,68.9f,11,3,1);
               c[1] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
               c[2] = new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
               c[3] = new Lutador ("Dead Code","Austrália",28,1.93f,81.6f,13,0,2
               );
               c[4] = new Lutador("UF0Cobol","Brasil",37,1.70f,119.3f,5,4,3);
               c[5] = new Lutador("Nerdaart","EUA",30,1.81f,105.7f,12,2,4);
       
       Luta UEC01 = new Luta();
       UEC01.marcarLuta(c[4],c[5]);
       UEC01.lutar();
       c[0].status();
       c[1].status();
    }
    
}
