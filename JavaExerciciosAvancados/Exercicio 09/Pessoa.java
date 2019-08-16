package exerciciosemjava;
public class Pessoa {
   private String nome;
   private int idade;
   private String sexo;
   
   //Métodos Públicos
    public String getNome(){
       return nome;
   }
    public void setNome(String n){
       this.nome = n ;
   }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int i){
        this.idade = i;
   }

    public Pessoa(String nome,int idade,String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
   //Métodos Especiais 
    public void fazerAniver(){
        this.setIdade(idade++);
    }
    
}
