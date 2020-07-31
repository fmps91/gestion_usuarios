package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Historia;
import com.example.demo.repository.HistoriaRepository;

//@CrossOrigin(origins = { "http://localhost:4200" })
@CrossOrigin(origins = { "*" })
@RestController

@RequestMapping("/api/v1")

public class HistoriaController {

	@Autowired
	private HistoriaRepository historiaRepository;

	@GetMapping("/historia")
	public List<Historia> getAllhistorias() {
		
		return historiaRepository.findAll();
		
	}

	
	@PostMapping("/historia")
	public Historia createhistoria(@RequestBody Historia historia) {
		return historiaRepository.save(historia);
	}

	
}
