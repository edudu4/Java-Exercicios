package aula011herança;
public class Aula011Herança {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("João");
        v1.setIdade(20);
        v1.setSexo("M");
        v1.fazerAnivers();
        System.out.println(v1.toString());
        
        System.out.println("-------------------------------------------------"
                + "-------------------");
    
        Aluno a1 = new Aluno();
        a1.setCurso("Ciências da Computação");
        a1.setIdade(18);
        a1.setNome("Eduardo");
        a1.setSexo("M");
        a1.setMatricula(123456);
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        
        System.out.println("-------------------------------------------------"
                + "-------------------");
        
        Bolsista b1 = new Bolsista();
        b1.setCurso("Ciências da Computação");
        b1.setIdade(19);
        b1.setMatricula(1234567);
        b1.setNome("Ana");
        b1.setSexo("F");
        b1.setBolsa(12.5f);
        System.out.println(b1.toString());
        b1.pagarMensalidade();
        
        System.out.println("-------------------------------------------------"
                + "-------------------");
        
        Professor p1 = new Professor();
        p1.setEspecialidade("Programação");
        p1.setIdade(32);
        p1.setNome("Cláudio");
        p1.setSalario(3000f);
        p1.setSexo("M");
        p1.receberAumento();
        System.out.println(p1.toString() + " Salário de: " + p1.getSalario());
        
        System.out.println("-------------------------------------------------"
                + "-------------------");
        
        Tecnico t1 = new Tecnico();
        t1.setCurso("TI");
        t1.setIdade(20);
        t1.setMatricula(1234);
        t1.setNome("Maria");
        t1.setSexo("F");
        t1.setRegistroprofis(11111);
        System.out.println(t1.toString());
        t1.praticar();
        
        System.out.println("-------------------------------------------------"
                + "-------------------");
        
    }
    
}
