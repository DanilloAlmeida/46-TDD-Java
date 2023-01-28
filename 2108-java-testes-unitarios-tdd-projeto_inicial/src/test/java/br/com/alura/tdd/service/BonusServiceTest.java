package br.com.alura.tdd.service;

//import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaSalarioMaiorQueDezMil() {
		BonusService service = new BonusService();
		Funcionario funcionario = new Funcionario("Danillo", LocalDate.now(), new BigDecimal("10010"));
		BigDecimal bonus = service.calcularBonus(funcionario);
		assertEquals(new BigDecimal("0.00"), bonus);
	}
	@Test
	void bonusDeveriaSerDiferenteDeZeroParaSalarioMenorQueDezMil() {
		BonusService service = new BonusService();
		Funcionario funcionario = new Funcionario("Danillo", LocalDate.now(), new BigDecimal("1000"));
		BigDecimal bonus = service.calcularBonus(funcionario);
		assertEquals(new BigDecimal("100.00"), bonus);
	}
	@Test
	void bonusDeveriaSerZeroParaSalarioIgualZero() {
		BonusService service = new BonusService();
		Funcionario funcionario = new Funcionario("Danillo", LocalDate.now(), new BigDecimal("10000"));
		BigDecimal bonus = service.calcularBonus(funcionario);
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
//atualizei
}
