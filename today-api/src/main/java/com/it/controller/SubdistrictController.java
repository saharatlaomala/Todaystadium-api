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

import com.it.entity.SubdistrictEntity;
import com.it.repository.SubdistrictRepository;

@RestController
public class SubdistrictController {
	
	@Autowired
	private SubdistrictRepository subdistrictRepository;
	
	@GetMapping("/subdistrict")
	public ResponseEntity<List<SubdistrictEntity>> getAllSubdistrict(){
		return ResponseEntity.ok(subdistrictRepository.findAll());
	}

	@GetMapping("/subdistrict/{sdtId}")
	public ResponseEntity<SubdistrictEntity> getSubdistrictBySdtId(@PathVariable("sdtId") Integer sdtId){
		Optional<SubdistrictEntity> entity = subdistrictRepository.findById(sdtId);
		if (entity.isPresent()) {
			return ResponseEntity.ok(entity.get());
		}else {
			return ResponseEntity.badRequest().body(null);
		}

	}
	
	@PostMapping("/subdistrict/save")
	public ResponseEntity<SubdistrictEntity>saveSubdistrict(@RequestBody SubdistrictEntity request) {
		if (request != null) {
			SubdistrictEntity entity = new SubdistrictEntity();
			entity.setSdtid(request.getSdtid());
			entity.setZipcode(request.getZipcode());
			entity.setSdtnameth(request.getSdtnameth());
			entity.setSdtnameeng(request.getSdtnameeng());
			entity.setDisid(request.getDisid());
			return ResponseEntity.ok(subdistrictRepository.save(entity));
			
		}
		return ResponseEntity.badRequest().body(null);
	}
	
	@PostMapping("/subdistrict/update")
	public ResponseEntity<SubdistrictEntity> updateSubdistrict(@RequestBody SubdistrictEntity request){
		if (request.getSdtid() !=null) {
			Optional<SubdistrictEntity> entity = subdistrictRepository.findById(request.getSdtid());
			if (entity.isPresent()) {
				SubdistrictEntity updateEntity = entity.get();
				updateEntity.setZipcode(request.getZipcode());
				updateEntity.setSdtnameth(request.getSdtnameth());
				updateEntity.setSdtnameeng(request.getSdtnameth());
				updateEntity.setSdtnameeng(request.getSdtnameeng());
				return ResponseEntity.ok(subdistrictRepository.save(updateEntity));
				
				
				
			}else {
				return ResponseEntity.badRequest().body(null);
			}
			
		}else {
			return ResponseEntity.badRequest().body(null);
		}
	}
	}/////////end
