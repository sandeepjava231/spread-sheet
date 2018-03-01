package com.example.spreadsheetapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spreadsheetapp.util.DeriveColumn;

@RestController
@RequestMapping("/excel")
public class ExcelController {
	
	@GetMapping("/columns")
	public List<String> getColumns(@RequestParam(value="numberOfColumns") int number) {
		return new DeriveColumn().giveColumnNames(number);
	}

}
