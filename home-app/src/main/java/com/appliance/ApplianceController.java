package com.appliance;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.model.Appliance;
import com.model.ApplianceRepository;

	@RestController
	@RequestMapping("/appliances")

	public class ApplianceController {
		
		@Autowired
		private ApplianceRepository applianceRepository;

	//Get all Appliance
		
		@GetMapping
		public List<Appliance> getAllAppliances() {
			
			return applianceRepository.findAll();
			
			
		}

	// Create a new Appliance
		
		@PostMapping
		public Appliance createAppliance(@RequestBody Appliance appliance) {
			
			return applianceRepository.save(appliance);
		}

		
	// Update an Appliance 
		
		@PutMapping("/{id}")
		public Appliance updateAppliance(@PathVariable Long id, @RequestBody Appliance appliance) {
			
			appliance.setId(id);
			return applianceRepository.save(appliance);
		}
		
		@DeleteMapping("/{id}")
	    public void deleteAppliance(@PathVariable Long id) {
	        applianceRepository.deleteById(id);
	  }
		
	}

