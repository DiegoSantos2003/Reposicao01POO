package model;

public class ingresso {
    private String codigoIdentificador;
    private float valor;

    public ingresso(String codigoIdentificador, float valor) {
        this.codigoIdentificador = codigoIdentificador;
        this.valor = valor;
    }

    public float getValorFinal(float taxaConveniencia) {
        return valor + taxaConveniencia;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public float getValor() {
        return valor;
    }
}
