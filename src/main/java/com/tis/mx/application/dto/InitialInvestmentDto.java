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
* Nombre de archivo: InitialInvestmentDto.java
* Autor: padelgad
* Fecha de creación: 10 sep. 2021
*/
package com.tis.mx.application.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitialInvestmentDto {
	
	/** The initial investment. */
	double initialInvestment;
	
	/** The yearly input. */
	double yearlyInput;
	
	/** The yearly inpunt increment. */
	int yearlyInpuntIncrement;
	
	/** The investment yield. */
	float investmentYield;
	
	/** The investment years. */
	int investmentYears;
	
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "InitialInvestmentDto [initialInvestment=" + initialInvestment + ", yearlyInput=" + yearlyInput
				+ ", yearlyInpuntIncrement=" + yearlyInpuntIncrement + ", investmentYield=" + investmentYield
				+ ", investmentYears=" + investmentYears + "]";
	}
	
	
}
