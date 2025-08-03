package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class ExcelDocumentServiceImpl extends DocumentServiceAB {

	

	@Override
	public void processData() {
		System.out.println("process Data for excel");
		
	}

	@Override
	public String print() {
		System.out.println("print excel");
		return "excel";
	}

	
}
