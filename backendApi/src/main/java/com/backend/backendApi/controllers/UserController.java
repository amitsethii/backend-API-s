package com.backend.backendApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backendApi.payloads.UserDto;
import com.backend.backendApi.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	//POST - create user
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
	UserDto createUserDto = this.userService.createUser(userDto);
	
	return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
	}
	
	//PUT - update user
	//DELETE - delete user
	//GET - user get
	
	
	
	
}