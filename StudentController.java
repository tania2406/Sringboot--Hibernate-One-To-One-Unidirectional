package com.example.Uni_one_one.example;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	StudentRepository srepo;
	@Autowired 
	AddressRepository arepo;
	@RequestMapping("/test")
	public String test()
	{
		return "this is test for unidirectional one to one";
	}
	@RequestMapping("/insert")
	public String insert(@RequestBody Student s)
	{
//		Student s=new Student();
//		Address a=new Address();
//		s.setSname("chandesh");
//		s.setSage(33);
//		
//		a.setAcity("bokaro");
//		a.setAstreet("india");
////		s.setAddress(a);
		srepo.save(s);
		return "data saved to student"; 
		
	}
	@RequestMapping("/show")
	public List<Student>all()
	{
		return srepo.findAll();
	}
	@RequestMapping("/{id}")
	public Optional<Student> byid(@PathVariable int id)
	{
		return srepo.findById(id);
	}
}
