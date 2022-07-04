package com.it.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.entity.UserEntity;
import com.it.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/user")
	public ResponseEntity<List<UserEntity>> getAllUser(){
		return ResponseEntity.ok(userRepository.findAll());
	}
	
	@GetMapping("/user/userId")
	public ResponseEntity<UserEntity> getUserByUserId(@PathVariable("userId") String userId){
		Optional<UserEntity> entity = userRepository.findById(userId);
		if (entity.isPresent()) {
			return ResponseEntity.ok(entity.get());
			
			
		}else {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PostMapping("/user/save")
	public ResponseEntity<UserEntity>saveUser(@RequestBody UserEntity request) {
		if (request !=null) {
			UserEntity entity = new UserEntity();
			entity.setUserid(request.getUserid());
			entity.setUserusernaem(request.getUserusernaem());
			entity.setUserpassword(request.getUserpassword());
			entity.setUsertitle(request.getUsertitle());
			entity.setUserfirstname(request.getUserfirstname());
			entity.setUserlastname(request.getUserlastname());
			entity.setUsergender(request.getUsergender());
			entity.setUserphone(request.getUserphone());
			entity.setUseremail(request.getUseremail());
			entity.setUseraddrass(request.getUseraddrass());
			entity.setUserstutus(request.getUserstutus());
			entity.setZipcode(request.getZipcode());
			entity.setRoleid(request.getRoleid());
			return ResponseEntity.ok(userRepository.save(entity));
			
			
		}
		return ResponseEntity.badRequest().body(null);
	}
	
	@PostMapping("/user/update")
	public ResponseEntity<UserEntity> updateUser(@RequestBody UserEntity request){
		if (request.getUserid() !=null) {
			Optional<UserEntity> entity=userRepository.findById(request.getUserid());
			if (entity.isPresent()) {
				UserEntity updateEntity = entity.get();
				updateEntity.setUserusernaem(request.getUserusernaem());
				updateEntity.setUserpassword(request.getUserpassword());
				updateEntity.setUsertitle(request.getUsertitle());
				updateEntity.setUserfirstname(request.getUserfirstname());
				updateEntity.setUserlastname(request.getUserlastname());
				updateEntity.setUsergender(request.getUsergender());
				updateEntity.setUserphone(request.getUserphone());
				updateEntity.setUseremail(request.getUseremail());
				updateEntity.setUseraddrass(request.getUseraddrass());
				updateEntity.setUserstutus(request.getUserstutus());
				updateEntity.setZipcode(request.getZipcode());
				updateEntity.setRoleid(request.getRoleid());
				return ResponseEntity.ok(userRepository.save(updateEntity));
				
			}else {
				return ResponseEntity.badRequest().body(null);
			}
			
		}else {
			return ResponseEntity.badRequest().body(null);
		}
	}

}/////////end
