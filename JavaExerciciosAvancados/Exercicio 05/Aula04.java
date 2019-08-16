package aula04;
public class Aula04 {
     public static void main(String[] args) {
         Caneta c1 = new Caneta("NIC","Amarela",0.4f);
         //c1.setModelo("BIC");
         //c1.setPonta(0.5f);
         c1.status();
         
         Caneta c2 = new Caneta("ABAB", "Laranja", 2.0f);
         System.out.println(" ");
         c2.status();
         //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta "
         //+ c1.getPonta());
    }
    
}
