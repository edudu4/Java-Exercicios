package projetopessoas;
public class Aluno extends Pessoa {
    //Atributos
    private int matr;
    private String curso;
    
    //Métodos
    public void cancelarMatr(){
        System.out.println("Matrícula cancelada!");
        matr = 0;
    }
    
    //Métodos Especiais
    public int getMatr(){
        return matr;
    }
    public void setMatr(int m){
        this.matr = m;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String c){
        this.curso = c;
    }
}
