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

import com.it.entity.PaymentsEntity;
import com.it.repository.PaymentsRepository;

@RestController
public class PaymentsController {
	
	@Autowired
	private PaymentsRepository paymentsRepository;
	
	@GetMapping("/payments")
	public ResponseEntity<List<PaymentsEntity>> getAllPayments() {
		return ResponseEntity.ok(paymentsRepository.findAll());
	}
	
	@GetMapping("payments/{pmId}")
	public ResponseEntity<PaymentsEntity> getPaymentsByPmId(@PathVariable("pmId") Integer pmId){
		Optional<PaymentsEntity> entity = paymentsRepository.findById(pmId);
		if (entity.isPresent()) {
			return ResponseEntity.ok(entity.get());
		}else {
			return ResponseEntity.badRequest().body(null);
		}
		
		}
	
	@PostMapping("/payments/save")
	public ResponseEntity<PaymentsEntity>savePayments(@RequestBody PaymentsEntity request) {
		if (request != null) {
			PaymentsEntity entity = new PaymentsEntity();
			entity.setPmid(request.getPmid());
			entity.setAmount(request.getAmount());
			entity.setPaymentamount(request.getPaymentamount());
			entity.setReceiveddate(request.getReceiveddate());
			entity.setTransactioncode(request.getTransactioncode());
			entity.setStatus(request.getStatus());
			entity.setUserid(request.getUserid());
			entity.setBkid(request.getBkid());
			return ResponseEntity.ok(paymentsRepository.save(entity));
		}
		return ResponseEntity.badRequest().body(null);
			
		}
	@PostMapping("/payments/update")
	public ResponseEntity<PaymentsEntity> updatePayments(@RequestBody PaymentsEntity request) {
		if (request.getPmid() !=null) {
			Optional<PaymentsEntity> entity = paymentsRepository.findById(request.getPmid());
			if (entity.isPresent()) {
				PaymentsEntity updateEntity = entity.get();
				updateEntity.setAmount(request.getAmount());
				updateEntity.setPaymentamount(request.getPaymentamount());
				updateEntity.setReceiveddate(request.getReceiveddate());
				updateEntity.setTransactioncode(request.getTransactioncode());
				updateEntity.setStatus(request.getStatus());
				updateEntity.setUserid(request.getUserid());
				updateEntity.setBkid(request.getBkid());
				return ResponseEntity.ok(paymentsRepository.save(updateEntity));
			}else {
				return ResponseEntity.badRequest().body(null);
				
			}
				
			}else {
				return ResponseEntity.badRequest().body(null);
			}
			
		}
	}//////end
	
	


