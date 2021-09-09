package com.tis.mx.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitialInvestmentDto {
	double initialInvestment;
	double yearlyInput;
	int yearlyInpuntIncrement;
	float investmentYield;
	int investmentYears;
	
	public double getInitialInvestment() {
		return initialInvestment;
	}
	public void setInitialInvestment(double initialInvestment) {
		this.initialInvestment = initialInvestment;
	}
	public double getYearlyInput() {
		return yearlyInput;
	}
	public void setYearlyInput(double yearlyInput) {
		this.yearlyInput = yearlyInput;
	}
	public int getYearlyInpuntIncrement() {
		return yearlyInpuntIncrement;
	}
	public void setYearlyInpuntIncrement(int yearlyInpuntIncrement) {
		this.yearlyInpuntIncrement = yearlyInpuntIncrement;
	}
	public float getInvestmentYield() {
		return investmentYield;
	}
	public void setInvestmentYield(float investmentYield) {
		this.investmentYield = investmentYield;
	}
	public int getInvestmentYears() {
		return investmentYears;
	}
	public void setInvestmentYears(int investmentYears) {
		this.investmentYears = investmentYears;
	}
	@Override
	public String toString() {
		return "InitialInvestmentDto [initialInvestment=" + initialInvestment + ", yearlyInput=" + yearlyInput
				+ ", yearlyInpuntIncrement=" + yearlyInpuntIncrement + ", investmentYield=" + investmentYield
				+ ", investmentYears=" + investmentYears + "]";
	}
	
	
}
