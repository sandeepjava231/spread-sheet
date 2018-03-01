package com.example.spreadsheetapp.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeriveColumn {
	
	public static final int ALPHABET_SIZE = 26;
	
	public static final String INITIAL_COLUMS[] = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", 
    		"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	
	public List<String> giveColumnNames(int numColumns) {
		
		List<String> finalColumnSet = new ArrayList<String>();
		
		List<String> prefixList = null;
		List<String> lastSetList = null;
		
		int index = numColumns/ALPHABET_SIZE;
		int lastSet = numColumns%ALPHABET_SIZE; 
		
		if(index >= 1) {
			prefixList = Arrays.asList(Arrays.copyOfRange(INITIAL_COLUMS, 0, index));
			lastSetList = Arrays.asList(Arrays.copyOfRange(INITIAL_COLUMS, 0, lastSet));
		} else {
			lastSetList = Arrays.asList(Arrays.copyOfRange(INITIAL_COLUMS, 0, lastSet));
		}
		
		if(prefixList != null && prefixList.size()>0) {
			finalColumnSet.addAll(Arrays.asList(INITIAL_COLUMS));
			
			for(int i=0;i<prefixList.size()-1;i++) {
				for(String t : Arrays.asList(INITIAL_COLUMS)) {
					finalColumnSet.add(prefixList.get(i)+t);
				}
			}
			
			String nextIndex = INITIAL_COLUMS[prefixList.size()-1];
			for(String t : lastSetList) {
				finalColumnSet.add(nextIndex+t);
			}
		} else {
			for(String t : lastSetList) {
				finalColumnSet.add(t);
			}
		}
		
		return 	finalColumnSet;
	}
}
