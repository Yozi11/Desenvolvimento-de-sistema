public class Pix implements Pagamento {

    @Override 
    public void pagar(double valor ){
        System.out.println("Pagamento realizar");
        System.out.println("Valor pago: R$ "+valor);
    }
    
}
