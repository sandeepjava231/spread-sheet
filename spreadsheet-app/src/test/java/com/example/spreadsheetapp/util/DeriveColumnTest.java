package com.example.spreadsheetapp.util;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DeriveColumnTest {
	
	private List<String> Columns10TestResult = null;
	private List<String> Columns26TestResult = null;
	private List<String> Columns27TestResult = null;
	
	private DeriveColumn dc = null;
	
	@Before
	public void setup() {
		
		Columns10TestResult = Arrays.asList("A","B","C","D","E","F","G","H",
				"I","J");
		Columns26TestResult = Arrays.asList("A","B","C","D","E","F","G","H",
				"I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
		Columns27TestResult = Arrays.asList("A","B","C","D","E","F","G","H",
				"I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","AA");
		
		dc = new DeriveColumn();
		
	}
	
	
	@Test
	public void testGiveColumnNamesFor10() {
		
		List<String> result = dc.giveColumnNames(10);
		assertTrue(result.equals(Columns10TestResult));
		
	}
	
	@Test
	public void testGiveColumnNamesFor26() {
		
		List<String> result = dc.giveColumnNames(26);
		assertTrue(result.equals(Columns26TestResult));
		
	}
	
	@Test
	public void testGiveColumnNamesFor27() {
		
		List<String> result = dc.giveColumnNames(27);
		assertTrue(result.equals(Columns27TestResult));
		
	}
	

}
