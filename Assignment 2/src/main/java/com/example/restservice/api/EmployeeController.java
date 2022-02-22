package com.example.restservice.api;

import com.example.restservice.model.Address;
import com.example.restservice.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public Employee getEmployee(@RequestParam(value = "name") String name,
								@RequestParam(value = "address") Address address,
								@RequestParam(value = "tel") String tel){
		return new Employee(name,address,tel);
	}

	@PostMapping("/employee")
	public String createEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		return "employee is created";
	}
}
