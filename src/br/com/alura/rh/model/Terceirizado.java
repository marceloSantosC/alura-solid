package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizado  {

    private final DadosPessoais dadosPessoais;
    private String empresa;
    private BigDecimal valorContrato;

    public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal valorContrato, String empresa) {
        dadosPessoais = new DadosPessoais(nome, cpf, cargo);
        this.empresa = empresa;
        this.valorContrato = valorContrato;
    }

    public String getEmpresa() {
        return empresa;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public BigDecimal getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(BigDecimal valorContrato) {
        this.valorContrato = valorContrato;
    }
}
