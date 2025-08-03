package com.example.demo.Factory;

import com.example.demo.Service.DocumentService;
import com.example.demo.Service.ExcelDocumentServiceImpl;
import com.example.demo.Service.WordDocumentServiceImpl;
import com.example.demo.Service.pdfDocumentServiceImpl;

public class Factory {
	public static DocumentService createObject(String type) {
		if (type.equals("pdf"))
			return new pdfDocumentServiceImpl();
		if (type.contentEquals("word"))
			return new WordDocumentServiceImpl();
		if (type.equals("excel"))
			return new ExcelDocumentServiceImpl();
		return null;
	}

}
