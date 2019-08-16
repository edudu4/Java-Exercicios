package exemplopraticoobjetos;


public class ExemploPraticoObjetos {

    public static void main(String[] args) {
        ContaBanco jose = new ContaBanco();
        jose.setDono("José dos Campos");
        jose.setNumConta(123456);
        jose.setTipo("cc");
        jose.abrirConta();
        jose.Status();
       
       
    }
     
}
