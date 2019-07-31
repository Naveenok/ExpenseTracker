package com.naveen.api.service;

import java.util.List;

import com.naveen.api.domain.Expense;

public interface ExpenseService {

	List<Expense> findAll();

	List<Expense> findByMonthAndYear(String month, int year);

	List<Expense> findByYear(Integer year);

	void saveOrUpdateExpense(Expense expense);

	void deleteExpense(String id);
	
	
}
