package exerciciosemjava;
public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos Públicos
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String t){
      this.titulo = t;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String a){
        this.autor = a;
    }
    public int getTotPaginas(){
        return totPaginas;
    }
    public void setTotPaginas(int t){
        this.totPaginas = t;
    }
    public int getPagAtual(){
        return pagAtual;
    }
    public void setPagAtual(int p){
        this.pagAtual = p;
    }
    public boolean getAberto(){
        return aberto;
    }
    public void setAberto(boolean a){
        this.aberto = a;
    }
    public Pessoa getLeitor(){
        return leitor;
    }
    public void setLeitor(Pessoa l){
        this.leitor = l;
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    
    
    //Métodos Especiais

    
    public String detalhes() {
        return "Livro{" + "titulo = " + titulo + " , autor = " + autor + ""
                + "\n, totPaginas = " + totPaginas + ", pagAtual = " + pagAtual 
                + ", aberto = " + aberto + "\n, leitor = " + leitor.getNome() + 
                " , idade = " + leitor.getIdade() + 
                " , sexo= " + leitor.getSexo() + '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p > this.totPaginas){
            this.pagAtual = 0;
        } else {
           this.pagAtual = p; 
        }
        
    }

    @Override
    public void avançarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
}
