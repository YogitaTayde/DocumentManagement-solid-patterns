package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Factory.Factory;
import com.example.demo.Service.DocumentService;

@RestController
public class DocumentController {
	@GetMapping("print/{type}")
	String printInvoice(@PathVariable String type) {
		DocumentService ds=Factory.createObject(type);
		
		return ds.printDocument();
		
	}

}
