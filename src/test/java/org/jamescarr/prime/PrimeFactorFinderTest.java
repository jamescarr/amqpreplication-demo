package org.jamescarr.prime;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.hasItems;

import java.util.List;
import java.util.Set;

import org.junit.Test;


public class PrimeFactorFinderTest {
	@Test
	public void shouldFindThePrimeFactorsOfNumber(){
		PrimeFactorFinder primeFactors = new PrimeFactorFinder();
		
		Factors numbers = primeFactors.find(23100);
		
		assertThat(numbers.getFactors(), hasItems(2l,2l,3l,5l,5l,7l,11l));
		
	}
}
