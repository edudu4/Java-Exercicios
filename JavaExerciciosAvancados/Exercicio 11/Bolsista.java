package aula011herança;
public class Bolsista extends Aluno {
    //Atributos
    private float bolsa;
    
    //Métodos Públicos
    public float getBolsa(){
        return bolsa;
    }
    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }
    //Métodos Especiais
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do Bolsista " + this.getNome() + 
                "...");
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+ " é bolsista, pagamento facilitado."
                + "..");
    }
}
