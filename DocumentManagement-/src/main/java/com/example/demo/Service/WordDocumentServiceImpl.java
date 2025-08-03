package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class WordDocumentServiceImpl implements DocumentService{

	@Override
	public void readData() {
		System.out.println("read Data from DB");
	}

	@Override
	public void processData() {
		System.out.println("process Data for Word");
		
	}

	@Override
	public String print() {
		System.out.println("print word");
		return "word";
	}

}
