package com.naveen.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.api.domain.Expense;
import com.naveen.api.repositories.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;

	@Override
	public List<Expense> findAll() {
		return (List<Expense>) expenseRepository.findAll();
	}

	@Override
	public List<Expense> findByMonthAndYear(String month, int year) {
		return expenseRepository.findByMonthAndYear(month, year);
	}

	@Override
	public List<Expense> findByYear(Integer year) {
		return expenseRepository.findByYear(year);
	}

	@Override
	public void saveOrUpdateExpense(Expense expense) {
		expenseRepository.save(expense);
		
	}

	@Override
	public void deleteExpense(String id) {
		expenseRepository.deleteById(id);
		
		
	}

}
