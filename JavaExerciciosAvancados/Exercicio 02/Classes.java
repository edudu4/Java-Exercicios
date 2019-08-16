package exercicioaula02;

public class Classes {
    String cor;
    String formato;
    String tecido;
    boolean esticavel;
    
    void status() {
        System.out.println("POSSUI A COR: " + this.cor);
        System.out.println("NO FORMATO: " + this.formato);
        System.out.println("FEITA DE: " + this.tecido);
        System.out.println("TA SENDO ESTICADA?: " + this.esticavel);
}
    void prenderocabelo(){
        if (this.esticavel == true){
            System.out.println("ESTOU PRESA NO CABELO!");
        } else {
            System.out.println("NÃO ESTOU PRESA AO CABELO");
        }
    }
    void agarrada(){
        System.out.println("ESTOU AGARRADA A ALGO!");
    }
}
