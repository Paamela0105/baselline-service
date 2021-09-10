/* 
* This program is free software: you can redistribute it and/or modify  
* it under the terms of the GNU General Public License as published by  
* the Free Software Foundation, version 3.
*
* This program is distributed in the hope that it will be useful, but 
* WITHOUT ANY WARRANTY; without even the implied warranty of 
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
* General Public License for more details.
*
* Nombre de archivo: ApplicationControllerTest.java
* Autor: padelgad
* Fecha de creación: 10 sep. 2021
*/
package com.tis.mx.application.controller;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.tis.mx.application.dto.InitialInvestmentDto;
import com.tis.mx.application.dto.InvestmentYieldDto;
import com.tis.mx.application.service.CompoundInterestCalculator;
import com.tis.mx.application.service.impl.CompoundInterestCalculatorImpl;

public class ApplicationControllerTest {
	
	private ApplicationController controller;
	private InitialInvestmentDto initialInvestment;
	private CompoundInterestCalculator calculator;
	
	@Before
	public void createValuesBeforeToTest() { // en before se pone todo lo necesario para realizar una prueba
		// Creacion de una calculadora
		this.calculator = new CompoundInterestCalculatorImpl();
		// Creacion de los valores iniciales de la inversion
		
		this.initialInvestment = new InitialInvestmentDto();
		
		this.initialInvestment.setInitialInvestment(5000.00);
		this.initialInvestment.setYearlyInput(3000.00);
		this.initialInvestment.setYearlyInpuntIncrement(1);
		this.initialInvestment.setInvestmentYears(5);
		this.initialInvestment.setInvestmentYield(0.21f);	
		
	}
	
	@Test
	public void shouldGenerateTableYield() {
		// Lógica para hacer la prueba
	// se establece la tabla de objetos de rendimiento
		List<InvestmentYieldDto> tableYield = controller.createTableYield(initialInvestment); // obtendremos una lista de objetos que será la tabla de renidmiento
		
		assertEquals(5, tableYield.size());
		//assertEquals compara dos valores. en la prueba unitaria se usa para validar con el valor esperado
		
		
		InvestmentYieldDto firstYear = tableYield.get(0);
		assertEquals(5000.0, firstYear.getInitialInvestment());
		assertEquals(3000.00, firstYear.getYearlyInput());
		assertEquals(1680.00, firstYear.getInvestmentYield());
		assertEquals(9680.00, firstYear.getFinalBalance());
		
	}

}
