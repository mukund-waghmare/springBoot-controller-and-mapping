package com.ty.controllerannotationmapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

	
	@GetMapping("/sweet")
	public String m()
	{
		return "Hello";
	}
	
	@PostMapping("/postmapping")
	public String postMethod()
	{
		return "Hello from Post Mapping";
	}
	
	@PutMapping("/putmappig")
	public String x()
	{
		return "Hello from Put Mapping";
	}
	
	@DeleteMapping("/deletemapping")
	public String deleteMapping()
	{

		return "Hello from Delete Mapping";
		
	}
}
