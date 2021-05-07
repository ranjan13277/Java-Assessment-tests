package com.example.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repo.EmployeeRepository;
import com.example.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repo;
	

	@Transactional
	public Integer saveEmployee(Employee e) {
		return repo.save(e).getUserId();
	}

	@Transactional
	public void updateEmployee(Employee e) {
		repo.save(e);
		
	}

	@Transactional
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
		
	}

	@Transactional
	public Optional<Employee> getOneEmployee(Integer id) {
		return repo.findById(id);
	}

	@Transactional
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Transactional
	public boolean isPresent(Integer id) {
		return repo.existsById(id);
				
	}

}
