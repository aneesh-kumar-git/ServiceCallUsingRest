package com.example.demo.controller;

import java.util.List;

import org.apache.http.annotation.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Country;
import com.example.demo.service.ServiceClass;

@RestController
public class TestController {
	
	@Autowired
	ServiceClass serv;
	
	@RequestMapping("/getAll")
	public ResponseEntity<List<Country>> cList()
	{
		return serv.collectAll();
	}

}
