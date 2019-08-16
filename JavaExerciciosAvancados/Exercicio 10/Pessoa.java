package projetopessoas;
public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    //Métodos
    public void fazerAniversario(){
        this.idade++;
    }
    
    //Métodos Especiais
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String s){
        this.sexo = s;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + '}';
    }
    
    
}
