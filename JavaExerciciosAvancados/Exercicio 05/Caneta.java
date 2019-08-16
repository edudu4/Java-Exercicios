package aula04;
public class Caneta {
   private String modelo;
   private float ponta;
   private boolean tampada;
   private String cor;
   
   public Caneta(String m, String c, float p){
       this.cor = c;
       this.setModelo(m);
       this.setPonta(p);
       this.tampar();
   }
   
   public String getModelo(){
       return this.modelo;
   }
   public void setModelo(String m){
       this.modelo = m; 
   }
   public float getPonta(){
       return this.ponta;
   }
   public void setPonta (float p){
       this.ponta = p;
   }
   public void tampar (){
       this.tampada = true;
   }
   public void destampada (){
       this.tampada = false;
   }
           
   public void status (){
       System.out.println("Sobre a caneta:");
       System.out.println("Modelo: " + this.getModelo());
       System.out.println("Ponta: " + this.getPonta());
       System.out.println("Cor: " + this.cor);
       System.out.println("A caneta está tampada?: " + this.tampada);
   }
   
}
