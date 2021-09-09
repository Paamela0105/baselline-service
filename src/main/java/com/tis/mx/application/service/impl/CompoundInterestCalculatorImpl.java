package com.tis.mx.application.service.impl;


import com.tis.mx.application.dto.InitialInvestmentDto;
import com.tis.mx.application.dto.InvestmentYieldDto;
import com.tis.mx.application.service.CompoundInterestCalculator;
import java.util.List;

public class CompoundInterestCalculatorImpl implements CompoundInterestCalculator {

  @Override
  public List<InvestmentYieldDto> createRevenueGrid(InitialInvestmentDto initialInvestment) {
    return null;
  }

  @Override
  public boolean validateInput(InitialInvestmentDto initialInvestment) {
	  if ( initialInvestment.getInitialInvestment() > 1000.0
			  && initialInvestment.getYearlyInpuntIncrement() >= 0
			  && initialInvestment.getInvestmentYears() >= 0.0
			  && initialInvestment.getInvestmentYield() > 0
			  && initialInvestment.getYearlyInput() >= 0 ) {
		  return true;
	  }
	  
    return false;
  }

}
