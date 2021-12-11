package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoValorReajuste implements ValidacaoReajuste {

    @Override
    public void validar(Funcionario funcionario, BigDecimal valorReajuste) {
        BigDecimal percentualReajuste = valorReajuste.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
