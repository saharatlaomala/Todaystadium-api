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

import com.it.entity.RoleEntity;
import com.it.repository.RoleRepository;

@RestController
public class RoleController {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@GetMapping("/role")
	public ResponseEntity<List<RoleEntity>> getAllRole(){
		return ResponseEntity.ok(roleRepository.findAll());
		
	}
	
	@GetMapping("/role/roleId")
	public ResponseEntity<RoleEntity> getRoleByRoleId(@PathVariable("roleId")String roleId){
		Optional<RoleEntity> entity = roleRepository.findById(roleId);
		if (entity.isPresent()) {
			return ResponseEntity.ok(entity.get());
		}else {
			return ResponseEntity.badRequest().body(null);
		}
		}
	
	@PostMapping("/role/save")
	public ResponseEntity<RoleEntity>saveRole(@RequestBody RoleEntity request){
		if (request !=null) {
			RoleEntity entity = new RoleEntity();
			entity.setRoleid(request.getRoleid());
			entity.setRolename(request.getRolename());
			entity.setRoledes(request.getRoledes());
			entity.setRolestatus(request.getRolestatus());
			return ResponseEntity.ok(roleRepository.save(entity));
			
			
		}
		return ResponseEntity.badRequest().body(null);
		
	}
	
	@PostMapping("/role/update")
	public ResponseEntity<RoleEntity> updateRole(@RequestBody RoleEntity request){
		if (request.getRoleid() !=null) {
			Optional<RoleEntity> entity = roleRepository.findById(request.getRoleid());
			if (entity.isPresent()) {
				RoleEntity updateEntity = entity.get();
				updateEntity.setRolename(request.getRolename());
				updateEntity.setRoledes(request.getRoledes());
				updateEntity.setRolestatus(request.getRolestatus());
				return ResponseEntity.ok(roleRepository.save(updateEntity));
			}else {
				return ResponseEntity.badRequest().body(null);
			}
		}else {
			return ResponseEntity.badRequest().body(null);
		}
				
			}
	}/////end
	



