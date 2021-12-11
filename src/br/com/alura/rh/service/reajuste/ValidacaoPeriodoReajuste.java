package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodoReajuste implements ValidacaoReajuste {

    @Override
    public void validar(Funcionario funcionario, BigDecimal valorReajust) {
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(funcionario.getDataUltimoReajuste(), LocalDate.now());
        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser menor que seis");
        }
    }
}
