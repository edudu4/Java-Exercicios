package aula07teorica;
public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
       this.peso = peso;
       this.setCategoria();
    }
    
    private void setCategoria() {
        if(52.2 > this.peso){
            this.categoria = "Inválido";
        } else if(this.peso<= 70.3f){
            this.categoria = "Leve";
        } else if(this.getPeso() <= 83.9f){
            this.categoria = "Médio";
        } else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        } else{
            this.categoria = "Inválido";
        }
    }
    

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public Lutador(String nome, String nacionalidade, int idade, float altura, 
float pe, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(pe);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    
    //Métodos
    public void apresentar(){
        System.out.println("=================================================");
        System.out.println("Lutador: "+ this.getNome());
        System.out.println("de Origem: " + this.getNacionalidade());
        System.out.println("De " + this.getIdade() + " Anos");
        System.out.println("Com aproximadamente " + this.getAltura() + 
        "m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Ganhou exatamente " + this.getVitorias() 
                + " lutas");
        System.out.println("E também perdeu " + this.getDerrotas() + " lutas");
        System.out.println("Por fim, empatou " + this.getEmpates() 
                + " partidas");
    }
    public void status(){
        System.out.println("=================================================");
        System.out.println(this.getNome());
        System.out.println("É um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
