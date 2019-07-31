package com.naveen.api.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.naveen.api.domain.Expense;
//perform CRUD operations
public interface ExpenseRepository extends CrudRepository<Expense, String> {//Takes domain class and the id as the parameter
	//Implementation will be done by springboot automatically
	List<Expense> findByMonthAndYear(String month, int year);

	List<Expense> findByYear(Integer year);
	
	
}
