package aula011herança;
public abstract class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //Métodos Públicos
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    //Métodos Especiais
    public void fazerAnivers(){
        this.idade++;
    }

    @Override
    public String toString() {
        return "Dados{" + "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + '}';
    }
    
}
