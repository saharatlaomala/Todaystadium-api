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

import com.it.entity.DmphurEntity;
import com.it.repository.DmphurRepository;

@RestController
public class DmphurController {
	
	@Autowired
	private DmphurRepository dmphurRepository;
	
	@GetMapping("/dmphur")
	public ResponseEntity<List<DmphurEntity>> getAllDmphur (){
		return ResponseEntity.ok(dmphurRepository.findAll());		
	}
	
	@GetMapping("/dmphur/{disId}")
	public ResponseEntity<DmphurEntity> getDmphurByDisID(@PathVariable("disId")Integer disId){
		Optional<DmphurEntity> entity = dmphurRepository.findById(disId);
		if (entity.isPresent()) {
			return ResponseEntity.ok(entity.get());
		}else {
			return ResponseEntity.badRequest().body(null);
				
			}
			
		}
	@PostMapping("/dmphur/save")
	public ResponseEntity<DmphurEntity>saveDmphur(@RequestBody DmphurEntity request ){
		if (request !=null) {
			DmphurEntity entity = new DmphurEntity();
			entity.setDisid(request.getDisid());
			entity.setDisCode(request.getDisCode());
			entity.setDisnameth(request.getDisnameth());
			entity.setDisnameeng(request.getDisnameeng());
			entity.setPvnid(request.getPvnid());
			return ResponseEntity.ok(dmphurRepository.save(entity));
		}
		return ResponseEntity.badRequest().body(null);
		}
	
	@PostMapping("/dmphur/update")
	public ResponseEntity<DmphurEntity> updateDmphur(@RequestBody DmphurEntity request){
		if (request.getDisid() !=null) {
			Optional<DmphurEntity> entity = dmphurRepository.findById(request.getDisid());
			if (entity.isPresent()) {
				DmphurEntity updateEntity = entity.get();
				updateEntity.setDisCode(request.getDisCode());
				updateEntity.setDisnameth(request.getDisnameth());
				updateEntity.setDisnameeng(request.getDisnameeng());
				updateEntity.setPvnid(request.getPvnid());
				return ResponseEntity.ok(dmphurRepository.save(updateEntity));
			}else {
				return ResponseEntity.badRequest().body(null);
				}
		}else {
			return ResponseEntity.badRequest().body(null);
		}
			}
			
		
	}
	/////end

	
	


