package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class ExcelDocumentServiceImpl implements DocumentService {

	@Override
	public void readData() {
		System.out.println("read data from DB");
		
	}

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
