package aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
   public void status (){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Qual a carga?: " + this.carga);
        System.out.println("Está tampada?: " + this.tampada);
    }
    
   public void rabiscar(){
        if (this.tampada == false){
            System.out.println("Estou rabiscando! Aguarde...");
        }   else {
            System.out.println("ERRO! NÃO POSSO RABISCAR");
        }
    }
    public void tampar (){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
