package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	private ReajusteService rs;
	private Funcionario funci;
	
	@BeforeEach
	public void inicializar() {
		this.rs = new ReajusteService();
		this.funci = new Funcionario("Danillo", LocalDate.now(), new BigDecimal("1000"));
	}

	@Test
	public void reajusteParaDesempenhoADesejar() {
//		inicializar();
		rs.aplicaReajuste(funci, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), funci.getSalario());
	}
	
	@Test
	public void reajusteParaDesempenhoBom() {
//		inicializar();
		rs.aplicaReajuste(funci, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), funci.getSalario());
	}

	@Test
	public void reajusteParaDesempenhoOtimo() {
//		inicializar();
		rs.aplicaReajuste(funci, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), funci.getSalario());
	}
}
