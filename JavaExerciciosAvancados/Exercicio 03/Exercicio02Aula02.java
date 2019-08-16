package exercicio02aula02;

public class Exercicio02Aula02 {

    public static void main(String[] args) {
        Banho banho = new Banho();
        banho.temperatura = "Quentinho";
        banho.lavar = true;
        banho.desligarchuveiro();
        banho.ensaboar();
        banho.status();
        banho.satisfacao();
    }
    
}
