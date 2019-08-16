package projetopessoas;
public class Professor extends Pessoa {
    //Atributos
    private String especialidade;
    private float salario;
    
    //Métodos
    public void receberAumento(float aum){
        this.salario+= aum;
    }
    
    //Métodos Especiais
    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String e){
        this.especialidade = e;
    }
    public float getSalario(){
        return salario;
    }
    public void setSalario(float s){
        this.salario = s;
    }
}
