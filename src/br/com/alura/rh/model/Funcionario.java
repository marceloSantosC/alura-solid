package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Optional;

import br.com.alura.rh.ValidacaoException;

public class Funcionario {


	private final DadosPessoais dadosPessoais;
	private BigDecimal salario;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		dadosPessoais = new DadosPessoais(nome, cpf, cargo);
		this.salario = salario;
	}

	public void atualizarSalario(BigDecimal novoValor) {
		this.salario = novoValor;
		this.dataUltimoReajuste = LocalDate.now();
	}

	public BigDecimal getSalario() {
		return salario;
	}


	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void promover(Cargo proximoCargo) {
		this.dadosPessoais.setCargo(proximoCargo);
	}

	public Cargo getCargo() {
		return Optional.ofNullable(dadosPessoais).map(DadosPessoais::getCargo).orElse(null);
	}
}
