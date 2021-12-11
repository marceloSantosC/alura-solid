package br.com.alura.rh.service;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ReajusteService {

    private final List<ValidacaoReajuste> validacoesReajuste;

    public ReajusteService(List<ValidacaoReajuste> validacaoReajustes) {
        this.validacoesReajuste = Optional.ofNullable(validacaoReajustes).orElse(Collections.emptyList());
    }

    public void reajustarSalario(BigDecimal valor, Funcionario funcionario) {

        this.validacoesReajuste.forEach(v -> v.validar(funcionario, valor));

        BigDecimal salarioReajustado = funcionario.getSalario().add(valor);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
