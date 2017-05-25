package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {
	
	@PutMapping("/users/register")
	public ResponseEntity postUser(@Valid @RequestBody User user, BindingResult result) {
		if (result.hasErrors()) {
			return new ResponseEntity(result.getAllErrors(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(user, HttpStatus.CREATED);
	}
	
}
