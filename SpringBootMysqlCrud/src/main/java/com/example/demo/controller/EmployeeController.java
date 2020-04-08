package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bank;
import com.example.demo.model.Employee;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.ProductService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp)
	{
		employeeService.saveEmployee(emp);		
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
	}
	
	@PostMapping("/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product pro)
	{
		productService.saveProduct(pro);
		return new ResponseEntity<Product> (pro,HttpStatus.CREATED);
	}
	
	@PostMapping("/bank")
	public ResponseEntity<Bank> saveBankDetails(@RequestBody Bank bank)
	{
		employeeService.saveBank(bank);
		return new ResponseEntity<Bank>(bank,HttpStatus.CREATED);
	}
}
