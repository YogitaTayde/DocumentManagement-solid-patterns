package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class PdfDocumentServiceImpl extends DocumentServiceAB{

	

	@Override
	public void processData() {
		System.out.println("process data for pdf");
	}

	@Override
	public String print() {
		System.out.println("print pdf");
		return "pdf";
	}


	}


