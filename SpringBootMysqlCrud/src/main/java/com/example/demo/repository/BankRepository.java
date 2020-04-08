package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Bank;

public interface BankRepository extends CrudRepository<Bank,Long>{

}
