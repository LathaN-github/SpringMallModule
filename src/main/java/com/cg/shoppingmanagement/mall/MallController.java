package com.cg.shoppingmanagement.mall;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class MallController {
	@Autowired
	private MallService service;
	
	//retrieve all rows from database
	@GetMapping("/Mallspring")
	public List<MallEntities> list(){
		return service.listAll( );
	}
	@GetMapping("/Mallspring/{id}")
	public ResponseEntity<MallEntities> get(@PathVariable Integer id)
	{
	try
	{
	MallEntities MallEntities = service.get(id);
	return new ResponseEntity<MallEntities>(MallEntities, HttpStatus.OK);
	}
	catch (NoSuchElementException e)
	{
	return new ResponseEntity<MallEntities>(HttpStatus.NOT_FOUND);
	}
	}
	// RESTful API method for Create operation
	@PostMapping("/MallSpring")
	public void add(@RequestBody MallEntities MallEntities)
	{
	service.save(MallEntities);
	}
	// RESTful API method for Update operation
	@PutMapping("/MallSpring/{id}")
	public ResponseEntity<?> update(@RequestBody MallEntities MallEntities, @PathVariable Integer id)
	{
	try
	{
	MallEntities existMallEntities = service.get(id);
	service.save(MallEntities);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	catch (NoSuchElementException e)
	{
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}
	// RESTful API method for Delete operation
	@DeleteMapping("/Mallspring/{id}")
	public void delete(@PathVariable Integer id)
	{
	service.delete(id);
	}
	}


