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

import com.it.entity.BookingEntity;
import com.it.repository.BookingRepository;

@RestController
public class BookingController {

	@Autowired
	private BookingRepository bookingRepository;
	
	@GetMapping("/booking")
	public  ResponseEntity<List<BookingEntity>> getAllBooking() {
		return ResponseEntity.ok(bookingRepository.findAll());
	}
	
	@GetMapping("/booking/{bkId}")
	public ResponseEntity<BookingEntity> getBookingByBkId(@PathVariable("bkId") Integer bkId){
		Optional<BookingEntity> entity = bookingRepository.findById(bkId);
		if (entity.isPresent()) {
			return ResponseEntity.ok(entity.get());
		}else {
			return ResponseEntity.badRequest().body(null);
		}}
	@PostMapping("/booking/save")
	public ResponseEntity<BookingEntity>saveBooking(@RequestBody BookingEntity request) {
		if (request != null) {
			BookingEntity entity = new BookingEntity();
			entity.setBkId(request.getBkId());
			entity.setBkDate(request.getBkDate());
			entity.setBkTime(request.getBkTime());
			entity.setBkEtime(request.getBkEtime());
			entity.setStatus(request.getStatus());
			entity.setUserId(request.getUserId());
			entity.setStdmId(request.getStdmId());
			return ResponseEntity.ok(bookingRepository.save(entity));
		}
		return ResponseEntity.badRequest().body(null);
				
		}
	
	@PostMapping("/booking/update")
	public ResponseEntity<BookingEntity> updateBooking(@RequestBody BookingEntity request){
		if (request.getBkId()!=null) {
			Optional<BookingEntity> entity = bookingRepository.findById(request.getBkId());
			if (entity.isPresent()) {
				BookingEntity updateEntity = entity.get();
				updateEntity.setBkDate(request.getBkDate());
				updateEntity.setBkTime(request.getBkTime());
				updateEntity.setBkEtime(request.getBkEtime());
				updateEntity.setStatus(request.getStatus());
				updateEntity.setUserId(request.getUserId());
				updateEntity.setStdmId(request.getStdmId());
				return ResponseEntity.ok(bookingRepository.save(updateEntity));
			}else {
				return ResponseEntity.badRequest().body(null);
				
			}
		}else {
			return ResponseEntity.badRequest().body(null);
					
				
			}
			
		}
	}
	//end
		
	
	
	