package com.example.demo.seervice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo empRepo;
	
	public void addEmp(Employee e) {
		empRepo.save(e);
	}

		
	public List<Employee> getAllEmp(){
		
		return empRepo.findAll();
	}
	public Employee getById(int id) {
		Optional<Employee> findById = empRepo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}
	public void deleteEp(int id) {
		
		empRepo.deleteById(id);
	
	}
}
