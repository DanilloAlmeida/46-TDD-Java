package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void aplicaReajuste(Funcionario funci, Desempenho desempenho) {
		
			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal reajuste = funci.getSalario().multiply(percentual);
			funci.atualizarSalario(reajuste);
	}
}
