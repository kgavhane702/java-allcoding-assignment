package com.core;

import java.util.*;

import org.omg.CORBA.PRIVATE_MEMBER;

public enum CityPopulationEnum {

	MAHARASHTRA("Mumbai", 203040), RAJSTHAN("Jaypur", 2834), UNKNOWN("unknown state",000);

	final private int population;
	final private String capital;
	
	private static final Map<String, CityPopulationEnum> reverseLookup;

	private CityPopulationEnum(String capital, int population) {
		this.population = population;
		this.capital = capital;
	}

	public int getPopulation() {
		return population;
	}

	public String getCapital() {
		return capital;
	}
	
	static
	{
		reverseLookup = new HashMap<>();
		for(CityPopulationEnum stateInfo : CityPopulationEnum.values())
		{
			
			reverseLookup.put(stateInfo.capital, stateInfo);
			
		}
	} 
	
	public static String matchFor(String capital) {
	    if (reverseLookup.containsKey(capital)) {
	      return reverseLookup.get(capital).name();
	    }
	      return UNKNOWN.name();
	  }

	@Override
	public String toString() {
		return this.getPopulation() + " " + this.getCapital();
	}

}
