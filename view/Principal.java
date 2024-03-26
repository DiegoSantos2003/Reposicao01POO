package view;

import model.ingresso;
import model.IngressoVIP;

public class Principal {
    public static void main(String[] args) {
        
        ingresso ingressoNormal = new ingresso("123", 50.0f);
        IngressoVIP ingressoVIP = new IngressoVIP("456", 100.0f, "VIP");

        float taxaConveniencia = 5.0f;

        float valorFinalNormal = ingressoNormal.getValorFinal(taxaConveniencia);
        System.out.println("Valor final do ingresso normal: R$" + valorFinalNormal);

       
        float valorFinalVIP = ingressoVIP.getValorFinal(taxaConveniencia);
        System.out.println("Valor final do ingresso VIP: R$" + valorFinalVIP);
    }
}
