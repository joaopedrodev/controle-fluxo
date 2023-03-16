public class CaixaEletronico {
    public static void main(String[] args){
        double saldo = 25.0;
        double valorSolicitado = 4.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Seu saldo atual é : " +  " " + saldo);
            
        }else
            System.out.println("Saldo insuficiente" + "Seu atual saldo e de " + saldo);    

            
    }
}
