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

import com.it.entity.StadiumEntity;
import com.it.repository.StadiumRepository;

@RestController
public class StadiumController {
	
	@Autowired
	private StadiumRepository stadiumRepository;
	
	@GetMapping("/stadium")
	public ResponseEntity<List<StadiumEntity>> getAllStadium(){
		return ResponseEntity.ok(stadiumRepository.findAll());
	}
	
	@GetMapping("/stadium/{stdmId}")
	public ResponseEntity<StadiumEntity> getStadiumByStdmId(@PathVariable("stdmId")String stdmId) {
		Optional<StadiumEntity> entity = stadiumRepository.findById(stdmId);
		if (entity.isPresent()) {
			return ResponseEntity.ok(entity.get());
		}else {
			return ResponseEntity.badRequest().body(null);
		}								
		}
	
	@PostMapping("/stadium/save")
	public ResponseEntity<StadiumEntity>saveStadium(@RequestBody StadiumEntity request){
		if (request !=null) {
			StadiumEntity entity = new StadiumEntity();
			entity.setStdmid(request.getStdmid());
			entity.setStdmname(request.getStdmname());
			entity.setStdmstime(request.getStdmstime());
			entity.setStdmEtime(request.getStdmEtime());
			entity.setStdmdescription(request.getStdmdescription());
			return ResponseEntity.ok(stadiumRepository.save(entity));
		}
		return ResponseEntity.badRequest().body(null);					
	}
	
	@PostMapping("/stadium/update")
	public ResponseEntity<StadiumEntity> updateStadium(@RequestBody StadiumEntity request){
		if (request.getStdmid() !=null) {
			Optional<StadiumEntity>entity = stadiumRepository.findById(request.getStdmid());
			if (entity.isPresent()) {
				StadiumEntity updateEntity = entity.get();
				updateEntity.setStdmname(request.getStdmname());
				updateEntity.setStdmstime(request.getStdmstime());
				updateEntity.setStdmEtime(request.getStdmEtime());
				updateEntity.setStdmdescription(request.getStdmdescription());
				return ResponseEntity.ok(stadiumRepository.save(updateEntity));
			}else {
				return ResponseEntity.badRequest().body(null);
			}
				
			}else {
				return ResponseEntity.badRequest().body(null);
			}
			
		}
	}
	/////////end


