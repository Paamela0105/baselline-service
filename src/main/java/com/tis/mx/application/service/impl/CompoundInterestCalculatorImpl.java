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
* Nombre de archivo: CompoundInterestCalculatorImpl.java
* Autor: padelgad
* Fecha de creación: 10 sep. 2021
*/
package com.tis.mx.application.service.impl;


import com.tis.mx.application.dto.InitialInvestmentDto;
import com.tis.mx.application.dto.InvestmentYieldDto;
import com.tis.mx.application.service.CompoundInterestCalculator;
import java.util.ArrayList;
import java.util.List;

public class CompoundInterestCalculatorImpl implements CompoundInterestCalculator {

  /**
   * Creates the revenue grid.
   *
   * @param initialInvestmentDto the initial investment dto
   * @return the list
   */
  @Override
  public List<InvestmentYieldDto> createRevenueGrid(InitialInvestmentDto initialInvestmentDto) {
    
    Integer investmentYears = initialInvestmentDto.getInvestmentYears();
    Double initialBalance = initialInvestmentDto.getInitialInvestment();
    Double yearlyInput = initialInvestmentDto.getYearlyInput();
    Double yield;
    Double finalBalance = 0.0;
    Double aux = 0.0;
    
    ArrayList<InvestmentYieldDto> investmentYieldList = new ArrayList<>();
    
    for (int i = 0; i < investmentYears; i++) {
      investmentYears = i + 1;
      yearlyInput = initialBalance + aux;
      aux += (yearlyInput * initialInvestmentDto.getYearlyInpuntIncrement()) / 100;
      
      if (i > 0) {
        initialBalance = finalBalance;
      }
      
      yield = (initialBalance + yearlyInput) * (initialInvestmentDto.getInvestmentYield() / 100);
      finalBalance = initialBalance + yearlyInput + yield;
      
      investmentYieldList.add(new InvestmentYieldDto(investmentYears, initialBalance, yearlyInput, yield, finalBalance));
            
    }
        
    return investmentYieldList;
  }

  /**
   * Validate input.
   *
   * @param initialInvestment the initial investment
   * @return true, if successful
   */
  @Override
  public boolean validateInput(InitialInvestmentDto initialInvestmentDto) {
	  
	  this.setDefaults(initialInvestmentDto);
	  boolean valid = true;
	  
	  valid = valid && (initialInvestmentDto.getInitialInvestment() >= 1000);
	  valid = valid && (initialInvestmentDto.getYearlyInput() >= 0.0);
	  valid = valid && (initialInvestmentDto.getYearlyInpuntIncrement() >= 0);
	  valid = valid && (initialInvestmentDto.getInvestmentYears() > 0.0);
	  valid = valid && (initialInvestmentDto.getInvestmentYield() > 0.0);
	  
	  return valid;
  }
  
  /**
   * Sets the defaults.
   *
   * @param initialInvestment the new defaults
   */
  private void setDefaults(InitialInvestmentDto initialInvestment) {

	  Double yearlyInput = initialInvestment.getYearlyInput();
	  yearlyInput = yearlyInput == null ? 0.0 : yearlyInput;
	  initialInvestment.setYearlyInput(yearlyInput);
	  
	  Integer yearlyInputIncrement = initialInvestment.getYearlyInpuntIncrement();
	  yearlyInputIncrement = yearlyInputIncrement == null ? 0 : yearlyInputIncrement;
	  initialInvestment.setYearlyInpuntIncrement(yearlyInputIncrement);
	  
  }

}

