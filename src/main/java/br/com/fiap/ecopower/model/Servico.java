package br.com.fiap.ecopower.model;

public class Servico {

    // Atributos
    private String localServico;
    private String tipo;
    private String tipoLocal;
    private String detalhesServico;
    private String telefone;

    // Construtores
    public Servico(String localServico, String tipo, String tipoLocal, String detalhesServico, String telefone) {
        this.localServico = localServico;
        this.tipo = tipo;
        this.tipoLocal = tipoLocal;
        this.detalhesServico = detalhesServico;
        this.telefone = telefone;
    }

    // Getters e Setters
    public String getLocalServico() {
        return localServico;
    }

    public void setLocalServico(String localServico) {
        this.localServico = localServico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

    public String getDetalhesServico() {
        return detalhesServico;
    }

    public void setDetalhesServico(String detalhesServico) {
        this.detalhesServico = detalhesServico;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return  "LOCAL                - " + localServico + "\n" +
                "TIPO SERVIÇO         - " + tipo + "\n" +
                "TIPO LOCAL           - " + tipoLocal + "\n" +
                "DETALHES             - " + detalhesServico + "\n" +
                "TELEFONE             - " + telefone + "\n";
    }

}
