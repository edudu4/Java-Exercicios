package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status (){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Qual a carga?: " + this.carga);
        System.out.println("Está tampada?: " + this.tampada);
    }
    
    void rabiscar(){
        if (this.tampada == false){
            System.out.println("Estou rabiscando! Aguarde...");
        }   else {
            System.out.println("ERRO! NÃO POSSO RABISCAR");
        }
    }
    void tampar (){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
