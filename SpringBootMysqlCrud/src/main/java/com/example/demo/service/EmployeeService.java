package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bank;
import com.example.demo.model.Employee;
import com.example.demo.repository.BankRepository;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private BankRepository bankRepository;
	
	
	public Employee saveEmployee(Employee emp)
	{
		employeeRepository.save(emp);
		
		return emp;
	}
	public Bank saveBank(Bank bank)
	{
		bankRepository.save(bank);
		return bank;
	}

}
