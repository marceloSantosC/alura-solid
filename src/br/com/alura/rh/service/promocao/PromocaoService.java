package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {

        if (!metaBatida) {
            throw new ValidacaoException("Não é possível promover um funcionário que não bateu a meta");
        }

        Cargo cargoAtual = funcionario.getCargo();
        if (cargoAtual == Cargo.GERENTE) {
            throw new ValidacaoException("Gerente não pode ser promovido");
        }

        Cargo novoCargo = cargoAtual.getProximoCargo();
        funcionario.promover(novoCargo);
    }
}
