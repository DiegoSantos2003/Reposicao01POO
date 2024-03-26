package model;

public class IngressoVIP extends ingresso {
    private String funcao;

    public IngressoVIP(String codigoIdentificador, float valor, String funcao) {
        super(codigoIdentificador, valor);
        this.funcao = funcao;
    }

    public float getValorFinal(float taxaConveniencia) {
        return super.getValorFinal(taxaConveniencia) * 1.18f;
    }

    public String getFuncao() {
        return funcao;
    }
}