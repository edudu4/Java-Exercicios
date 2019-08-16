package aula011herança;
public class Tecnico extends Aluno {
    //Atributos
    private int registroProfis;
    
    //Métodos Públicos
    public int getRegistroprofis(){
        return registroProfis;
    }
    public void setRegistroprofis(int reg){
        this.registroProfis = reg;
    }
    
    //Métodos Especiais
    public final void praticar(){
        System.out.println(this.getNome() + " está praticando...");
    }
}

